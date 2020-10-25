package com.rl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
 * 1写程序获取一百个不重复的随机数。
 *
 * 分析：（1）随机数     random
 * 		（2）100个
 *      （3）不能重复   set
 */
        //创建一个集合
        Set s = new HashSet();

        //1.获得随机数
        Random r = new Random();
        while(s.size() != 100){
            //获得的随机数
            int num = r.nextInt(1000);
            //把数字加入到set集合里面
            s.add(num);
        }
        //查看集合中的元素
        System.out.println(s);
        System.out.println(s.size()+"个");

    }
}
