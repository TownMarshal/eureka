package Demo;

public class jiaohuanshuzuyuansu {



    //方法交换两个数组，需要参数及返回值，提供两个数组
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

        jiaohuanshuzuyuansu j = new jiaohuanshuzuyuansu();
        j.changeTwoArrray(x,y);

        for (int v : x) {
            System.out.println(v);
        }
        for (int v : y) {
            System.out.println(v);

        }
    }
}
