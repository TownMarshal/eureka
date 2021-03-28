package JingDianSuanFa;

/**
 * Created by Administrator on 2020/2/7 0007.
 * 中国百鸡问题：鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一．百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 */
public class baijibaiqian {
    public static void main(String[] args) {
        //100元最多买20只鸡翁，假设买了x只鸡翁，y值鸡母，z只鸡雏，
        // x+y+z=100;
        //鸡翁,鸡母,鸡雏的单价分别为5,3,1/3
        //5*x+3*y+1/3*z=100;
        //鸡雏的数量是3的整数倍
        // 通过数量和金钱关系列出两个关系式，进行循环迭代

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
    }
}
