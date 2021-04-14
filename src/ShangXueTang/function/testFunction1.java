package ShangXueTang.function;

public class testFunction1 {
    //把一个数组中的元素首位交换
    public int[] changeArrElement(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

//    查询一个数组中的最值问题
    public int findMaxOrMin(int[] arr, boolean flag) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (flag && arr[i] > temp) {
                temp = arr[i];
            } else if (!flag && arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

//    判断一个数组中是否存在某个元素
    public String isExist(int[]arr,int element){
        String result="对不起，你要找的数，不在该数组中";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                result="恭喜你，你要找的书在数组里";
                break;
            }
        }
        return result;
    }

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
        testFunction1 t = new testFunction1();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};
        int[] b = new int[]{23,24,25,26};
        int[] result = t.changeArrElement(a);
        int max = t.findMaxOrMin(a, true);
        int min = t.findMaxOrMin(a, false);
        System.out.println(max);
        System.out.println("======================");
        System.out.println(min);
//        for (int v : result) {
//            System.out.println(v);
//        }
        System.out.println("======================");

        String exist = t.isExist(a, 4);
        System.out.println("======================");

        String exist1 = t.isExist(a, 422);
        System.out.println(exist+exist1);
        System.out.println("=====================");
//        调用数组合并元素方法
        int[] mergeArr = t.mergeArr(a, b);
        for (int i : mergeArr) {
            System.out.println(i);
        }


    }

}
