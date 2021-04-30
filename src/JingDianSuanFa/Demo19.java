package JingDianSuanFa;

/**
 打印出如下图案（菱形）

 1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重for循环，第一层控制行，第二层控制列。

 三角形：
 *
 ***
 ******
 ********
 ******
 ***
 *

 */
public class Demo19 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=3; i>=1; i--){
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
