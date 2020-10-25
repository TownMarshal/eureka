package cn.tx;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Multiply {
    @Override
    public String toString() {
        return super.toString();
    }

    public static int multiply(int num) {
        if (num < 0) {
            System.out.println("请输入大于0的数！");
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return multiply(num - 1) * num;
        }
    }
    public static void main(String[] args) {
        System.out.println(multiply(5));
    }
}
