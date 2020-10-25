package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo23 {
    public static void main(String[] args) {
        /**
         编写一个java程序在屏幕上输出1!+2!+3！+...+10！的和
         递归：方法自身调用方法本身，一定要有退出的标识
         */
            //定义一个总和变量total
            int total=0;
            for(int i=1;i<=10;i++){
                total+=fn(i);
            }
            System.out.println(total);
        }
        public static int fn(int num){
            //定义一个结果变量
            int result=1;
            if(num>1){
                result=num*fn(num-1);
            }
            return result;
    }
}
