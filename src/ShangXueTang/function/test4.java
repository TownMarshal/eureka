package ShangXueTang.function;

public class test4 {


    //    创建两个比较小的数组，然后用一个大的数组合并两个比较小的数组
    public int[] mergeArr(int[]a,int[]b){
        int[] newArr=new int[a.length+b.length];
        //分别将ab两个数组
        for (int i = 0; i < a.length; i++) {
            newArr[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArr[i+a.length]=b[i];
        }
//        将新数组返回
        return newArr;
    }
    public static void main(String[] args) {
        //创建一个对象
        testFunction1 t = new testFunction1();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};
        int[] b = new int[]{23,24,25,26};

//        调用数组合并元素方法
        int[] mergeArr = t.mergeArr(a, b);
        for (int i : mergeArr) {
            System.out.println(i);
        }

    }
}
