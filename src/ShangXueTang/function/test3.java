package ShangXueTang.function;

public class test3 {



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


    public static void main(String[] args) {
        //创建一个对象
        testFunction1 t = new testFunction1();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};


        String exist = t.isExist(a, 4);
        System.out.println(exist);

        System.out.println("======================");

        String exist1 = t.isExist(a, 422);
        System.out.println(exist1);
        System.out.println("=====================");
    }
}
