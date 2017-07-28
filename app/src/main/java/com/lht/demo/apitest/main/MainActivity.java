package com.lht.demo.apitest.main;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.lht.demo.apitest.R;
import com.lht.demo.apitest.main.Gson.MoviesGson;
import com.lht.demo.apitest.main.NetWork.OkhttpTool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private XRecyclerView recyclerView;
    private List<MoviesGson.DataBean.MoviesBean> list = new ArrayList<>();
    private MoviesGson moviesGson;
    private MyAdapter adapter;
    private Map<String, Object> map = new HashMap<>();
    private int offset;
    private static final int GETINFO = 0x111;
    private static final int ONLOAD = 0x121;
    private Handler hd = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == GETINFO) {
                if (null != moviesGson) {
                    list = moviesGson.getData().getMovies();
                    recyclerView.refreshComplete();
                    adapter.notifyDataSetChanged();
                }
            } else if (msg.what == ONLOAD) {
                if (null != moviesGson) {
                    list.addAll(moviesGson.getData().getMovies());
                    recyclerView.loadMoreComplete();
                    adapter.notifyDataSetChanged();
                } else {
                    recyclerView.setNoMore(true);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doRefresh();
        recyclerView = (XRecyclerView) findViewById(R.id.lv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setPullRefreshEnabled(true);

        recyclerView.setAdapter(adapter = new MyAdapter());
        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                doRefresh();
            }

            @Override
            public void onLoadMore() {

                Log.d("lht", "======================进来了");
                map.put("offset", offset);

                OkhttpTool.getOkhttpTool().get("http://m.maoyan.com/movie/list.json?"+"type=hot&offset="+offset+"&limit=20", new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        String s = response.body().string();
                        Log.d("lht", "=======================response：" + s);
                        moviesGson = new Gson().fromJson(s, MoviesGson.class);
                        hd.sendEmptyMessage(ONLOAD);

                    }
                });
                offset += 20;

            }
        });




    }

    private void doRefresh() {

        map.put("type", "hot");
        map.put("offset", "0");
        map.put("limit", "20");
        OkhttpTool.getOkhttpTool().get("http://m.maoyan.com/movie/list.json?"+"type=hot&offset="+offset+"&limit=20",new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String s = response.body().string();
                Log.d("lht", "=======================response：" + s);
                moviesGson = new Gson().fromJson(s, MoviesGson.class);
                hd.sendEmptyMessage(GETINFO);

            }
        });
        offset = 20;

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(MainActivity.this).inflate(R.layout.recycleview_item, null));
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            Glide.with(MainActivity.this).load(list.get(position).getImg()).into(holder.image);
            holder.movieName.setText(list.get(position).getNm());
            holder.screenType.setText(list.get(position).getVer());
            holder.movieType.setText(list.get(position).getCat());
            holder.movieActor.setText("主演：" + list.get(position).getStar());
            holder.movieCount.setText(list.get(position).getShowInfo());
            holder.movieScores.setText(list.get(position).getSc() + "分");

        }

        @Override
        public int getItemCount() {
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            private ImageView image;
            private TextView movieName;
            private TextView screenType;
            private TextView movieType;
            private TextView movieActor;
            private TextView movieCount;
            private TextView movieScores;

            public MyViewHolder(View itemView) {
                super(itemView);
                image = (ImageView) itemView.findViewById(R.id.image);
                movieName = (TextView) itemView.findViewById(R.id.movies_name);
                screenType = (TextView) itemView.findViewById(R.id.screen_type);
                movieType = (TextView) itemView.findViewById(R.id.movies_type);
                movieActor = (TextView) itemView.findViewById(R.id.movies_actor);
                movieCount = (TextView) itemView.findViewById(R.id.movies_count);
                movieScores = (TextView) itemView.findViewById(R.id.movies_scores);
            }
        }


    }


}
