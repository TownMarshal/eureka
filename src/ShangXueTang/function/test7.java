package ShangXueTang.function;

public class test7 {

    public  int[] remobeElementFromArray(int[] arr,int element){
//       找寻原数组去掉被删除元素后的长度
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=element){
                count++;
            }
        }
//        通过找到的count（新数组长度）
        int[]newArr=new int[count];
        int index=0;//控制新数组的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
               newArr[index++]= arr[i];
            }
        }
        return newArr;
    }


    public static void main(String[] args) {


    }

}
