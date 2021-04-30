/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Demo10 {

    public static void main(String[] args) {
        int sum=0, high = 100;
        for (int i=1; i<=10; i++){
            sum += high;
            high = high /2 ;
            sum += high;
        }
        System.out.println("总共经过" + sum + "米");
        System.out.println("第10次反弹" + high + "米");
    }
}
