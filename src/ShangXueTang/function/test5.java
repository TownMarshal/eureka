package ShangXueTang.function;

public class test5 {


    //将一个很大的数组，按照最大值的位置拆分为两个小的数组，最大值不要，前后各为一个数组
    public int[][]  splitArr(int[]arr){
        //找最大值索引位置
        int max=arr[0];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        int[]newa=new  int[index];
        int[]newb=new  int[arr.length-1-index];
//        分别将两个小数组填满
        for (int i = 0; i < newa.length; i++) {
            newa[i]=arr[i];
        }
        for (int i = 0; i < newb.length; i++) {
            newb[i]=arr[index+1+i];
        }
        return new  int[][] {newa,newb};


    }
    public static void main(String[] args) {
        //创建一个对象
        int j;
        testFunction1 t = new testFunction1();
//        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};
        int[] a = new int[]{1,  3, 4, 5,66, 78, 9, 10};
        int[][] splitArr = t.splitArr(a);
        int[] ints1 = splitArr[0];
        int[] ints2 = splitArr[1];
        System.out.print("[");
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
            if(i<ints1.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints1[i]);
            if(i<ints2.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");

        for (int[] ints : splitArr) {
            for (int i : ints) {
                System.out.println("增强for的i值："+i);
            }
        }

        for (int[] ints : splitArr) {
            for (int i =0 ;i<ints.length; i+=2) {
                System.out.println("普通for的i对应的value值："+ints[i]);
                if(i < ints.length-1){
                    System.out.println("普通for的i对应的value值："+ints[i+1]);
                }
            }
        }

    }

}
