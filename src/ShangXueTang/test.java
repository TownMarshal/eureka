package ShangXueTang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("保护环境");  //向列表中添加数据
        list.add("爱护地球");  //向列表中添加数据
        list.add("从我做起");  //向列表中添加数据
        list.add(1, "从我做起");  //在第1+1个元素的位置添加数据
        List<String> list_ad = new ArrayList<String>();
        list_ad.add("公益广告");  //将list中的全部元素添加到list_ad中
        System.out.println("是否添加成功:" + list_ad.addAll(list));  //通过循环输出列表中的内容
        for (int i = 0; i < list_ad.size(); i++) {
            System.out.println(i + ":" + list_ad.get(i));
        }
    }
}
