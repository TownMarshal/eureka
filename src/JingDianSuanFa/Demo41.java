package JingDianSuanFa;

/**
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，
 * 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，
 * 又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * 程序分析：有个疑问就是题目没说第五个猴子拿到的只有一个桃子，但是别人都知道？？不理解
 * 这其实就是一个递归问题每次*5 +1
 */
public class Demo41 {
    public static void main(String[] args) {
        System.out.println(func(5));
    }

    public static int func(int num){
        if(num==0){
            return 1;
        }
        return 5*func(num-1)+1;
    }
}
