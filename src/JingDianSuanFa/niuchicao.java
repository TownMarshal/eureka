package JingDianSuanFa;

/**
 * 问题描述:牛吃草问题：有一块牧场，可供10头牛吃20天，15头牛吃10天，则它可供多少头牛吃4天？
 * 解决牛吃草问题常用到四个基本公式，分别是︰
 * 　　（1）草的生长速度= （对应的牛头数×吃的较多天数－相应的牛头数×吃的较少天数）÷（吃的较多天数－吃的较少天数）；
 * 　　（2）原有草量=牛头数×吃的天数－草的生长速度×吃的天数；`
 * 　　（3）吃的天数=原有草量÷（牛头数－草的生长速度）；
 * 　　（4）牛头数=原有草量÷吃的天数+草的生长速度。
 */

/**
 * "C:\Program Files\Java\jdk1.8.0_231\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=6134:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_231\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_231\jre\lib\rt.jar;D:\ideaworkspace\demo-first\out\production\demo-first" JingDianSuanFa.niuchicao
 * 每天草的生长速度5.0
 * 牧场原有草量100.0
 * 可供24头牛吃5.2631578947368425天
 * 可供30.0牛吃4天
 *
 * Process finished with exit code 0
 */

public class niuchicao {
    public static void main(String[] args) {
        //假设每头牛每天吃1份
        double ee = 1;
        //牧场原有草量
        double o;
        //每天草的生长速度
        double ge;
        //根据10头牛可吃20天，16头牛可吃10天，可以求出每天草的生长速度
        int num1 = 10;
        int day1 = 20;
//        int num2 = 16;
        int num2 = 15;
        int day2 = 10;
        //每天草的生长速度
        ge = (num1 * day1 - num2 * day2) / (day1 - day2);
        System.out.println("每天草的生长速度" + ge);
        //求出牧场原有草量
        o = num1 * day1 - ge * day1;
        System.out.println("牧场原有草量" + o);

        //求出可供24头牛，吃几天
        System.out.println("可供24头牛吃" + (o / (24 - ge)) + "天");

        //求出可供多少头牛吃四天
        //牛头数=原有草量÷吃的天数+草的生长速度。
        System.out.println("可供" + (o / 4 + ge) + "牛吃4天");


    }
}




