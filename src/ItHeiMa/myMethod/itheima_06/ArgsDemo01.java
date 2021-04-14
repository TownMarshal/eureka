package ItHeiMa.myMethod.itheima_06;

/*
    对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);

    }

    private static void change(int x) {
        x = 200;
        System.out.println("方法区里");
        System.out.println(x);
    }
}
