package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo19 {
    public static void main(String[] args) {
        /**
         打印菱形*号
         *
         * *
         *   *
         *     *
         *       *
         *         *
         *           *
         *         *
         *       *
         *     *
         *   *
         * *
         *
         一共是7行
         1行：*1个 空白6个
         2行：*3个 空白4个
         3行：*5个 空白2个
         4行：*7个 空白0个
         5行：*5个 空白2个
         6行：*3个 空白4个
         7行：*1个 空白6个
         空白=行号-*号
         *=2行号-1
         */

            int i;
            int j;
            int z;
            int num=7;

//外层的for循环，i是行号
            for(i=1;i<=num;i++){
                //打印空格
                for(j=1;j<=num-i;j++){
                    System.out.print(" ");
                }
                //打印*号
                for(z=1;z<=2*i-1;z++){
                    if(z == 1 || z == (2*i - 1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                //换行
                System.out.println();
            }

            //外层的for循环，i是行号
            for(i=num-1;i>=1;i--){
                //打印空格
                for(j=1;j<=num-i;j++){
                    System.out.print(" ");
                }
                //打印*号
                for(z=1;z<=2*i-1;z++){
                    if(z == 1 || z == (2*i - 1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                //换行
                System.out.println();
            }
            System.out.println("程序结束");
    }
}
