package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo9 {
    public static void main(String[] args) {
        /**
         三元运算符：逻辑表达式2？表达式3
         给定一个变量1男，2女

         */

            int gender=2;
/*if(gender==1){
	System.out.println("男");
	}else{
		System.out.println("女")；
		}*/
            char c=gender==1?'男':'女';
            System.out.println(c);


            String man="我是男";
            String result=gender==1?man:"我是女";
            System.out.println(result);


            int score=80;
            String level=score>=90?"A":(score<=60?"C":"B");
            System.out.println("成绩是"+score+"的级别是"+level);

        }
}
