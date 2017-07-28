package com.lht.demo.apitest.main.NetWork;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lht on 2017/7/25.
 */

public class OkhttpTool {

    private static OkhttpTool okhttpTool;
    private static OkHttpClient okHttpClient;
    private static Request request;

    public OkhttpTool() {
        okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(30 * 1000, TimeUnit.SECONDS)
                .writeTimeout(10 * 1000, TimeUnit.SECONDS)
                .readTimeout(10 * 1000, TimeUnit.SECONDS)
                .build();

    }

    public static OkhttpTool getOkhttpTool() {
        if (null==okhttpTool) {
            synchronized (OkhttpTool.class) {
                if (null == okhttpTool) {
                    okhttpTool = new OkhttpTool();
                }
            }
        }
        return okhttpTool;
    }


    public static void get(String url, Callback callback) {
        request = new Request.Builder()
                .url(url)
                .get()
                .build();

        okHttpClient.newCall(request).enqueue(callback);
    }


    public static void post(String url, Map<String,Object> map,Callback callback) {
        FormBody.Builder formbody = new FormBody.Builder();

        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                    try {
                        String o = URLEncoder.encode(String.valueOf(entry.getValue()), "GBK");
                        formbody.add(entry.getKey(), o);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
            }
        }

        request = new Request.Builder()
                .url(url)
                .post(formbody.build())
                .build();

        okHttpClient.newCall(request).enqueue(callback);
    }















}
