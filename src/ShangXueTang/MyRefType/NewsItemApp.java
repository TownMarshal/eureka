package ShangXueTang.MyRefType;

import ShangXueTang.MySort.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
    public static void main(String[] args) {
        List<NewsItem> news=new ArrayList<NewsItem>();
        news.add(new NewsItem("中国登上钓鱼岛了，全国欢呼了",100,new Date()));

        news.add(new NewsItem("美国后怕了，逃跑了悲剧了",50,new Date(System.currentTimeMillis()-1000*60*60)));
//        news.add(new NewsItem("中国登上钓鱼岛了，全国欢呼了",100,new Date()));
        news.add(new NewsItem("小日本终于听话了，泪流满面笑了",60,new Date(System.currentTimeMillis()-1000*60*60)));
        System.out.println("排序前:"+news);
        //排序
//        Collections.sort(news);
        Utils.sort(news);

        System.out.println("排序后"+news);



    }
}
