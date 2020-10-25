package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo26 {
    public static void main(String[] args) {
        /**
         求极值
         */
//定义一个整数类型的数组
            int[]arr={12,4,5,78,94,24};
            int result=max(arr);
            System.out.println("数组的最大值是："+result);
/*数组是引用数据类型，引用数据类型有可能发生空指向的问题
引用数据类型可以赋值成null，这就代表是空指向
int[]arr1=null;*/
        }
        public static int max(int[]arr){
            //定义一个最大值结果变量
            int maxValue=-1;
            //我们为了程序的严谨性，一定要判断null和0长度的问题
            //if(arr.length!=0&&arr!=null)不能先判断是否是0，会报错
            if(arr!=null&&arr.length!=0){
                for(int i=0;i<arr.length;i++){
                    //如果遍历的数组中的值比最大值大的话，需要替换
                    if(arr[i]>maxValue){
                        maxValue=arr[i];
                    }
                }
            }
            return maxValue;
    }
}
