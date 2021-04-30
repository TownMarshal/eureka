package ShangGuiGuJiChu;

public class anweiyu {

    public static void main(String[] args) {
        int i1 = 10, i2 = 20;
        int i = (i2++);
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        i = (++i2);
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        i = (--i1);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        i = (i1--);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);

        System.out.println("10 % 3 = " + 10 % 3);
        System.out.println("20 % 3 = " + 20 % 3);

        int rst = (i2 % 3) > 1 ? -10 : 10;
        System.out.println("(20 % 3) > 1 ? -10 : 10 = " + rst);


        operater();

    }

    private static void operater() {
        int a = 129;
        int b = 128;
        System.out.println("a和b按位与的结果是：" + (a & b));
        System.out.println("a和b按位或的结果是：" + (a | b));
        System.out.println("a按位非的结果是：" + Integer.toBinaryString((~a)));
        //Integer.toBinaryString(),方法是将数据按二进制格式输出
        System.out.println("a和b按位异或的结果是：" + (a ^ b));
        int c = 5;
        int rst = c << 3;//左移三位相当于c * 2 ^ 3 = 40
        System.out.println("5左移三位的结果是：" + rst);
    }

}


