package com.lht.demo.apitest.main.Gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lht on 2017/7/24.
 */

public class MoviesGson {


    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":true,"movies":[{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映1566场","scm":"爱情陷阴谋，刀剑欲封喉","imax":false,"snum":67968,"nm":"绣春刀II：修罗战场","dir":"路阳","star":"张震,杨幂,张译","cat":"动作,古装,武侠","wish":79455,"3d":false,"pn":256,"dur":120,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b0fc6fd58f1592dd31298149734ab2d8382151.jpg","sc":8.5,"showDate":"","src":"","ver":"2D/中国巨幕","rt":"2017-07-19上映","id":341189,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映1144场","scm":"父子共生死，联手打BOSS","imax":false,"snum":31057,"nm":"父子雄兵","dir":"袁卫东","star":"董成鹏,范伟,张天爱","cat":"剧情,喜剧","wish":44014,"3d":false,"pn":410,"dur":105,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/149b7474fbb19d19bf10f1e69000c855496039.png","sc":8,"showDate":"","src":"","ver":"2D","rt":"2017-07-21上映","id":1196180,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天137家影院放映1105场","scm":"悟空二郎神，兄弟俩情深","imax":true,"snum":227279,"nm":"悟空传","dir":"郭子健","star":"彭于晏,倪妮,余文乐","cat":"剧情,动作,奇幻","wish":338817,"3d":true,"pn":167,"dur":123,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/3534d263e6bc6f85412a147c4aaf4e46667953.jpg","sc":7.6,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2017-07-13上映","id":341375,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映808场","scm":"婚后也不易，偶遇胞兄弟","imax":true,"snum":290137,"nm":"神偷奶爸3","dir":"皮艾尔·柯芬,凯尔·巴尔达","star":"史蒂夫·卡瑞尔,克里斯汀·韦格,崔·帕克","cat":"喜剧,动画,冒险","wish":250810,"3d":true,"pn":156,"dur":90,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/e4aa7abb6ef5fbe695174063ac6cc0921246361.jpg","sc":8.8,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕","rt":"2017-07-07上映","id":249900,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-08-03 下周四上映","scm":"虐心姐弟恋，颜值要逆天","imax":true,"snum":21592,"nm":"三生三世十里桃花","dir":"赵小丁,安东尼.拉默里纳拉","star":"刘亦菲,杨洋,彭子苏","cat":"爱情,奇幻,古装","wish":670138,"3d":true,"pn":202,"dur":109,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/b063b9ca66d23311b39c5367330dcb11873589.png","sc":0,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"下周四上映","id":246896,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-27 本周四上映","scm":"只身冲险地，帅过宋仲基","imax":false,"snum":9082,"nm":"战狼2","dir":"吴京","star":"吴京,弗兰克·格里罗,卢靖姗","cat":"动作,战争","wish":368739,"3d":true,"pn":461,"dur":123,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/02ac72c0e8ee2987f7662ad921a2acc7999433.jpg","sc":0,"showDate":"","src":"","ver":"2D/3D/中国巨幕/全景声","rt":"本周四上映","id":344264,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天118家影院放映435场","scm":"奇葩恋校草，联合大逆袭","imax":false,"snum":26506,"nm":"闪光少女","dir":"王冉","star":"徐璐,彭昱畅,刘泳希","cat":"剧情,喜剧,音乐","wish":14489,"3d":false,"pn":172,"dur":103,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/b2589235242332cf54704ca3cec394f7286747.jpg","sc":9.2,"showDate":"","src":"","ver":"2D","rt":"2017-07-20上映","id":1132316,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天110家影院放映331场","scm":"茶店丑茶宠，为美大步走","imax":false,"snum":7431,"nm":"阿唐奇遇","dir":"王微","star":"石磊,袁泽宇,芒来","cat":"动画,冒险,家庭","wish":15520,"3d":true,"pn":270,"dur":99,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/e7415fcfaac2f50a755fe38dd6d9894d937103.jpg","sc":8.9,"showDate":"","src":"","ver":"2D/3D","rt":"2017-07-21上映","id":367815,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天97家影院放映319场","scm":"重口味动画，眼看成黑马","imax":false,"snum":50403,"nm":"大护法","dir":"不思凡","star":"小连杀,图特哈蒙,金士杰","cat":"动画,冒险,奇幻","wish":22327,"3d":true,"pn":211,"dur":93,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/14d327102710b25c4ad4acf33064b065104228.jpg","sc":8.3,"showDate":"","src":"","ver":"3D/中国巨幕","rt":"2017-07-13上映","id":344682,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-27 本周四上映","scm":"群星敬功勋，热血献我军","imax":true,"snum":3033,"nm":"建军大业","dir":"刘伟强","star":"刘烨,朱亚文,黄志忠","cat":"剧情,历史","wish":85949,"3d":false,"pn":331,"dur":133,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/0e3a853a93d342f5d071f5e0867cbfb7518640.jpg","sc":0,"showDate":"","src":"","ver":"2D/IMAX 2D/中国巨幕","rt":"本周四上映","id":345011,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天68家影院放映111场","scm":"智慧胜邪恶，拯救奥兹国","imax":false,"snum":1429,"nm":"绿野仙踪之奥兹国奇幻之旅","dir":"Fyodor Dmitriev,Darina Shmidt,Vladimir Toropchin","star":"Dmitriy Dyuzhev,Konstantin Khabenskiy,Sergey Shnurov","cat":"动画,冒险,家庭","wish":5590,"3d":true,"pn":29,"dur":92,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/834e088a4cb8606aee52d25eab387cad2723458.jpg","sc":7.9,"showDate":"","src":"","ver":"2D/3D","rt":"2017-07-21上映","id":1205027,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天32家影院放映65场","scm":"原版再回归，暖心又暖胃","imax":false,"snum":6640,"nm":"深夜食堂2","dir":"松冈锭司","star":"小林薰,多部未华子,小田切让","cat":"剧情","wish":25842,"3d":false,"pn":67,"dur":108,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/53b25618e98f0ff82f633c31a0d8e78a463347.jpg","sc":8.5,"showDate":"","src":"","ver":"2D","rt":"2017-07-18上映","id":1142462,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天24家影院放映46场","scm":"磕头去朝圣，只因心虔诚","imax":false,"snum":46851,"nm":"冈仁波齐","dir":"张杨","star":"杨培,尼玛扎堆,斯朗卓嘎","cat":"剧情","wish":5697,"3d":false,"pn":145,"dur":117,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/7b1795a13a668935ac80c551016c2eb690110.jpg","sc":8.8,"showDate":"","src":"","ver":"2D","rt":"2017-06-20上映","id":342601,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-28 本周五上映","scm":"只要功夫深，豆子变上神","imax":false,"snum":576,"nm":"豆福传","dir":"邹燚","star":"陈佩斯,季冠霖,李立群","cat":"喜剧,动画,奇幻","wish":9803,"3d":true,"pn":61,"dur":82,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/8b38b9b3edf4b88df1dd8ee3f850adc2481592.png","sc":0,"showDate":"","src":"","ver":"2D/3D/中国巨幕","rt":"本周五上映","id":1204581,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天18家影院放映36场","scm":"喵星攻地球，软萌耍得溜","imax":false,"snum":28302,"nm":"喵星人","dir":"陈木胜","star":"古天乐,马丽,刘楚恬","cat":"喜剧,科幻,奇幻","wish":40914,"3d":false,"pn":175,"dur":109,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/0dc3be00bb030c6c871496ec74a168d52823468.jpg","sc":8.3,"showDate":"","src":"","ver":"2D","rt":"2017-07-14上映","id":346154,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-28 本周五上映","scm":"图图变厨神，萌娃变勤奋","imax":false,"snum":2224,"nm":"大耳朵图图之美食狂想曲","dir":"速达,李晔","star":"豆豆,范楚绒,胡谦","cat":"喜剧,动画,冒险","wish":16546,"3d":false,"pn":82,"dur":91,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/1eb7dc53464f846cf74e667bb4b7f298422855.jpg","sc":8.6,"showDate":"","src":"","ver":"2D","rt":"本周五上映","id":345972,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天19家影院放映31场","scm":"公鸡来招魂，婴灵现真身","imax":false,"snum":116616,"nm":"京城81号II","dir":"钱人豪","star":"张智霖,梅婷,钟欣潼","cat":"剧情,惊悚,悬疑","wish":126530,"3d":true,"pn":107,"dur":93,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b54ff6d86280f53abde1c46b03f6dea1977483.jpg","sc":5.8,"showDate":"","src":"","ver":"2D/3D/中国巨幕","rt":"2017-07-06上映","id":344236,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天8家影院放映20场","scm":"女人救小狼，千里送故乡","imax":false,"snum":33131,"nm":"重返·狼群","dir":"亦风","star":"李微漪,亦风","cat":"纪录片,剧情","wish":13580,"3d":false,"pn":115,"dur":98,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d9ca94c8bd0386038cb1ae4281ef3848660148.png","sc":9.3,"showDate":"","src":"","ver":"2D","rt":"2017-06-16上映","id":490367,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-08-04 下周五上映","scm":"吴尊助冠军，热血灌篮魂","imax":false,"snum":594,"nm":"我是马布里","dir":"杨子","star":"斯蒂芬·马布里,吴尊,锦荣","cat":"剧情,运动","wish":24453,"3d":false,"pn":101,"dur":110,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/41845ed23370e37a8c923946fcfc8f98953072.jpg","sc":0,"showDate":"","src":"","ver":"2D","rt":"下周五上映","id":248648,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天9家影院放映12场","scm":"少年提拳干，暑期终一战","imax":false,"snum":32979,"nm":"青禾男高","dir":"蒋卓原","star":"景甜,欧豪,黑木明纱","cat":"剧情,喜剧,动作","wish":19449,"3d":false,"pn":139,"dur":98,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/f633e97639c3697725a2bd2d3b491bff508139.jpg","sc":7.7,"showDate":"","src":"","ver":"2D","rt":"2017-07-12上映","id":672202,"time":""}]}
     */

    private ControlBean control;
    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 1800
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * hasNext : true
         * movies : [{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映1566场","scm":"爱情陷阴谋，刀剑欲封喉","imax":false,"snum":67968,"nm":"绣春刀II：修罗战场","dir":"路阳","star":"张震,杨幂,张译","cat":"动作,古装,武侠","wish":79455,"3d":false,"pn":256,"dur":120,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b0fc6fd58f1592dd31298149734ab2d8382151.jpg","sc":8.5,"showDate":"","src":"","ver":"2D/中国巨幕","rt":"2017-07-19上映","id":341189,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映1144场","scm":"父子共生死，联手打BOSS","imax":false,"snum":31057,"nm":"父子雄兵","dir":"袁卫东","star":"董成鹏,范伟,张天爱","cat":"剧情,喜剧","wish":44014,"3d":false,"pn":410,"dur":105,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/149b7474fbb19d19bf10f1e69000c855496039.png","sc":8,"showDate":"","src":"","ver":"2D","rt":"2017-07-21上映","id":1196180,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天137家影院放映1105场","scm":"悟空二郎神，兄弟俩情深","imax":true,"snum":227279,"nm":"悟空传","dir":"郭子健","star":"彭于晏,倪妮,余文乐","cat":"剧情,动作,奇幻","wish":338817,"3d":true,"pn":167,"dur":123,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/3534d263e6bc6f85412a147c4aaf4e46667953.jpg","sc":7.6,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2017-07-13上映","id":341375,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天136家影院放映808场","scm":"婚后也不易，偶遇胞兄弟","imax":true,"snum":290137,"nm":"神偷奶爸3","dir":"皮艾尔·柯芬,凯尔·巴尔达","star":"史蒂夫·卡瑞尔,克里斯汀·韦格,崔·帕克","cat":"喜剧,动画,冒险","wish":250810,"3d":true,"pn":156,"dur":90,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/e4aa7abb6ef5fbe695174063ac6cc0921246361.jpg","sc":8.8,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕","rt":"2017-07-07上映","id":249900,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-08-03 下周四上映","scm":"虐心姐弟恋，颜值要逆天","imax":true,"snum":21592,"nm":"三生三世十里桃花","dir":"赵小丁,安东尼.拉默里纳拉","star":"刘亦菲,杨洋,彭子苏","cat":"爱情,奇幻,古装","wish":670138,"3d":true,"pn":202,"dur":109,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/b063b9ca66d23311b39c5367330dcb11873589.png","sc":0,"showDate":"","src":"","ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"下周四上映","id":246896,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-27 本周四上映","scm":"只身冲险地，帅过宋仲基","imax":false,"snum":9082,"nm":"战狼2","dir":"吴京","star":"吴京,弗兰克·格里罗,卢靖姗","cat":"动作,战争","wish":368739,"3d":true,"pn":461,"dur":123,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/02ac72c0e8ee2987f7662ad921a2acc7999433.jpg","sc":0,"showDate":"","src":"","ver":"2D/3D/中国巨幕/全景声","rt":"本周四上映","id":344264,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天118家影院放映435场","scm":"奇葩恋校草，联合大逆袭","imax":false,"snum":26506,"nm":"闪光少女","dir":"王冉","star":"徐璐,彭昱畅,刘泳希","cat":"剧情,喜剧,音乐","wish":14489,"3d":false,"pn":172,"dur":103,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/b2589235242332cf54704ca3cec394f7286747.jpg","sc":9.2,"showDate":"","src":"","ver":"2D","rt":"2017-07-20上映","id":1132316,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天110家影院放映331场","scm":"茶店丑茶宠，为美大步走","imax":false,"snum":7431,"nm":"阿唐奇遇","dir":"王微","star":"石磊,袁泽宇,芒来","cat":"动画,冒险,家庭","wish":15520,"3d":true,"pn":270,"dur":99,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/e7415fcfaac2f50a755fe38dd6d9894d937103.jpg","sc":8.9,"showDate":"","src":"","ver":"2D/3D","rt":"2017-07-21上映","id":367815,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天97家影院放映319场","scm":"重口味动画，眼看成黑马","imax":false,"snum":50403,"nm":"大护法","dir":"不思凡","star":"小连杀,图特哈蒙,金士杰","cat":"动画,冒险,奇幻","wish":22327,"3d":true,"pn":211,"dur":93,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/14d327102710b25c4ad4acf33064b065104228.jpg","sc":8.3,"showDate":"","src":"","ver":"3D/中国巨幕","rt":"2017-07-13上映","id":344682,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-27 本周四上映","scm":"群星敬功勋，热血献我军","imax":true,"snum":3033,"nm":"建军大业","dir":"刘伟强","star":"刘烨,朱亚文,黄志忠","cat":"剧情,历史","wish":85949,"3d":false,"pn":331,"dur":133,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/0e3a853a93d342f5d071f5e0867cbfb7518640.jpg","sc":0,"showDate":"","src":"","ver":"2D/IMAX 2D/中国巨幕","rt":"本周四上映","id":345011,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天68家影院放映111场","scm":"智慧胜邪恶，拯救奥兹国","imax":false,"snum":1429,"nm":"绿野仙踪之奥兹国奇幻之旅","dir":"Fyodor Dmitriev,Darina Shmidt,Vladimir Toropchin","star":"Dmitriy Dyuzhev,Konstantin Khabenskiy,Sergey Shnurov","cat":"动画,冒险,家庭","wish":5590,"3d":true,"pn":29,"dur":92,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/834e088a4cb8606aee52d25eab387cad2723458.jpg","sc":7.9,"showDate":"","src":"","ver":"2D/3D","rt":"2017-07-21上映","id":1205027,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天32家影院放映65场","scm":"原版再回归，暖心又暖胃","imax":false,"snum":6640,"nm":"深夜食堂2","dir":"松冈锭司","star":"小林薰,多部未华子,小田切让","cat":"剧情","wish":25842,"3d":false,"pn":67,"dur":108,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/53b25618e98f0ff82f633c31a0d8e78a463347.jpg","sc":8.5,"showDate":"","src":"","ver":"2D","rt":"2017-07-18上映","id":1142462,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天24家影院放映46场","scm":"磕头去朝圣，只因心虔诚","imax":false,"snum":46851,"nm":"冈仁波齐","dir":"张杨","star":"杨培,尼玛扎堆,斯朗卓嘎","cat":"剧情","wish":5697,"3d":false,"pn":145,"dur":117,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/7b1795a13a668935ac80c551016c2eb690110.jpg","sc":8.8,"showDate":"","src":"","ver":"2D","rt":"2017-06-20上映","id":342601,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-28 本周五上映","scm":"只要功夫深，豆子变上神","imax":false,"snum":576,"nm":"豆福传","dir":"邹燚","star":"陈佩斯,季冠霖,李立群","cat":"喜剧,动画,奇幻","wish":9803,"3d":true,"pn":61,"dur":82,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/8b38b9b3edf4b88df1dd8ee3f850adc2481592.png","sc":0,"showDate":"","src":"","ver":"2D/3D/中国巨幕","rt":"本周五上映","id":1204581,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天18家影院放映36场","scm":"喵星攻地球，软萌耍得溜","imax":false,"snum":28302,"nm":"喵星人","dir":"陈木胜","star":"古天乐,马丽,刘楚恬","cat":"喜剧,科幻,奇幻","wish":40914,"3d":false,"pn":175,"dur":109,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/0dc3be00bb030c6c871496ec74a168d52823468.jpg","sc":8.3,"showDate":"","src":"","ver":"2D","rt":"2017-07-14上映","id":346154,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-07-28 本周五上映","scm":"图图变厨神，萌娃变勤奋","imax":false,"snum":2224,"nm":"大耳朵图图之美食狂想曲","dir":"速达,李晔","star":"豆豆,范楚绒,胡谦","cat":"喜剧,动画,冒险","wish":16546,"3d":false,"pn":82,"dur":91,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/1eb7dc53464f846cf74e667bb4b7f298422855.jpg","sc":8.6,"showDate":"","src":"","ver":"2D","rt":"本周五上映","id":345972,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天19家影院放映31场","scm":"公鸡来招魂，婴灵现真身","imax":false,"snum":116616,"nm":"京城81号II","dir":"钱人豪","star":"张智霖,梅婷,钟欣潼","cat":"剧情,惊悚,悬疑","wish":126530,"3d":true,"pn":107,"dur":93,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b54ff6d86280f53abde1c46b03f6dea1977483.jpg","sc":5.8,"showDate":"","src":"","ver":"2D/3D/中国巨幕","rt":"2017-07-06上映","id":344236,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天8家影院放映20场","scm":"女人救小狼，千里送故乡","imax":false,"snum":33131,"nm":"重返·狼群","dir":"亦风","star":"李微漪,亦风","cat":"纪录片,剧情","wish":13580,"3d":false,"pn":115,"dur":98,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d9ca94c8bd0386038cb1ae4281ef3848660148.png","sc":9.3,"showDate":"","src":"","ver":"2D","rt":"2017-06-16上映","id":490367,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"2017-08-04 下周五上映","scm":"吴尊助冠军，热血灌篮魂","imax":false,"snum":594,"nm":"我是马布里","dir":"杨子","star":"斯蒂芬·马布里,吴尊,锦荣","cat":"剧情,运动","wish":24453,"3d":false,"pn":101,"dur":110,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/41845ed23370e37a8c923946fcfc8f98953072.jpg","sc":0,"showDate":"","src":"","ver":"2D","rt":"下周五上映","id":248648,"time":""},{"late":false,"cnms":0,"sn":0,"showInfo":"今天9家影院放映12场","scm":"少年提拳干，暑期终一战","imax":false,"snum":32979,"nm":"青禾男高","dir":"蒋卓原","star":"景甜,欧豪,黑木明纱","cat":"剧情,喜剧,动作","wish":19449,"3d":false,"pn":139,"dur":98,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/f633e97639c3697725a2bd2d3b491bff508139.jpg","sc":7.7,"showDate":"","src":"","ver":"2D","rt":"2017-07-12上映","id":672202,"time":""}]
         */

        private boolean hasNext;
        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            /**
             * late : false
             * cnms : 0
             * sn : 0
             * showInfo : 今天136家影院放映1566场
             * scm : 爱情陷阴谋，刀剑欲封喉
             * imax : false
             * snum : 67968
             * nm : 绣春刀II：修罗战场
             * dir : 路阳
             * star : 张震,杨幂,张译
             * cat : 动作,古装,武侠
             * wish : 79455
             * 3d : false
             * pn : 256
             * dur : 120
             * preSale : 0
             * vd :
             * img : http://p0.meituan.net/165.220/movie/b0fc6fd58f1592dd31298149734ab2d8382151.jpg
             * sc : 8.5
             * showDate :
             * src :
             * ver : 2D/中国巨幕
             * rt : 2017-07-19上映
             * id : 341189
             * time :
             */

            private boolean late;
            private int cnms;
            private int sn;
            private String showInfo;
            private String scm;
            private boolean imax;
            private int snum;
            private String nm;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean _$3d;
            private int pn;
            private int dur;
            private int preSale;
            private String vd;
            private String img;
            private double sc;
            private String showDate;
            private String src;
            private String ver;
            private String rt;
            private int id;
            private String time;

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean is_$3d() {
                return _$3d;
            }

            public void set_$3d(boolean _$3d) {
                this._$3d = _$3d;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
