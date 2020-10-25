package computer.ArrayListDemo;

/**
 * Created by Administrator on 2020/2/12 0012.
 * 场景：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果
 * 例如：int[] arr= {1,2,3};执行方法后输出的结果是[1,2,3]
 */
public class ArrayToStringDemo {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        String s = arrayToString(arr);
        System.out.println("s"+s);
    }

    public static String arrayToString(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;

    }
}