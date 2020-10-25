package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo30 {
    public static void main(String[] args) {
        /**
         定义两个数组
         数组A："1,7,9,11,13,15,17,19"
         数组B:"2,4,6,8,10"
         将两个数组合并，然后升序排列
         */

//定义两个数组
            int[] arr={1,7,9,11,13,15,17,19};
            int[] arr1={2,4,6,8,10};
//调用方法将两个数组合并成一个数组
            int[] arr2=generNewArr(arr,arr1);
//遍历打印数组
            printArr(arr2);
//冒泡排序
            sortArr(arr2);
//换行
            System.out.println();
//再次遍历打印数组
            printArr(arr2);
        }

        //方法1接收两个int类型数组，把两个数组合并为一个数组返回
        public static int[] generNewArr(int[] arr,int[] arr1){
            //定义一个新数组，长度为两个数组的长度之和
            int[] arr2=new int[arr.length+arr1.length];
            //先把第一个数组里面的内容给给新数组
            for(int i=0;i<arr.length;i++){
                arr2[i]=arr[i];
            }
            //再把第二个数组里面的内容给新数组
            for(int i=0;i<arr1.length;i++){
                //把第二个数组中的内容逐个赋值到新数组中，从索引arr.length开始
                arr2[arr.length+i]=arr1[i];
            }
            return arr2;
        }
        //方法2遍历数组
        public static void printArr(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
        }

        //方法3给一个数组冒泡排序
        public static void sortArr(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j+1]<arr[j]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }
