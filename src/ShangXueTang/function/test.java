package ShangXueTang.function;

public class test {
    public static void main(String[] args) {
        //用来交换一个数组，头尾交换
        int[] arr=new int[]{1,2,3,4,5,6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp =arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
