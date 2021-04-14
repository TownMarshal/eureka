package ShangXueTang.function;

public class test8 {

     public int[] zhishu(int begin,int end){
         if (begin<0&&end<0){
             System.out.println("质数没有负数，不给找");
             return null;
         }
         if (begin>end){
             System.out.println("你提供的数据开始值比终止值大，不合适");
             return null;
         }
         //创建一个很大的数组
         int[] arr=new int[(end-begin)/2];
         int index=0;//记录新数组的变化，同时记录个数
         for (int num = begin; num <end; num++) {
             boolean b=false;
             for (int i = 2; i <num/2 ; i++) {
                if (num%i==0){
                    b=true;
                    break;
                }

             }
             if (!b){
                 arr[index++]=num;
             }
         }
//将数组后面的多余的0去掉
         int[]primeArr=new int[index];
         for (int i = 0; i < primeArr.length; i++) {
             primeArr[i]=arr[i];
         }
         arr=null;
         return primeArr;
     }


    public static void main(String[] args) {
        test8 t = new test8();
        int[] zhishu = t.zhishu(2, 100);
        for (int i : zhishu) {
            System.out.println(i);
        }
    }

}
