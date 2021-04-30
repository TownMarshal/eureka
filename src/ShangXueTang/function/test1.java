package ShangXueTang.function;

public class test1 {

    //方法交换两个数组，需要参数及返回值，提供两个数组,不需要返回值是因为数组里面的值已经改变了
    public void changeTwoArrray(int[]a,int[]b){
        for (int i = 0; i <a.length; i++) {
            int x=a[i];
            a[i]=b[i];
            b[i]=x;
        }

    }
    public static void main(String[] args) {
        int[]x={1,2,3,4};
        int[]y={5,6,7,8,};

       test1 j = new test1();
        j.changeTwoArrray(x,y);

        for (int v : x) {
            System.out.println(v);
        }
        for (int v : y) {
            System.out.println(v);

        }
    }
}
