package JingDianSuanFa;

/**
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程
 * 序找出三队赛手的名单。
 */
public class Demo18 {
    public static void main(String[] args) {
        char[] team1 = {'a', 'b', 'c'};
        char[] team2 = {'x', 'y', 'z'};
        for (int i = 0; i < team1.length; i++) {
            for (int j = 0; j < team2.length; j++) {
                if (team1[i] == 'a' && team2[j] == 'x') {
                    continue;
                } else if (team1[i] == 'a' && team2[j] == 'y') {
                    continue;
                } else if (team1[i] == 'c' && (team2[j] == 'x' || team2[j] == 'z')) {
                    continue;
                } else if (team1[i] == 'b' && (team2[j] == 'z' || team2[j] == 'y')) {
                    continue;
                } else
                    System.out.println(team1[i] + "VS" + team2[j]);
            }
        }

        char a, b, c;
        for (a = 'x'; a <= 'z'; a++) {
            for (b = 'x'; b <= 'z'; b++) {
                if (a != b) {   //避免参赛队员重复比赛
                    for (c = 'x'; c <= 'z'; c++) {
                        if (a != c && b != c) {      //避免参赛队员重复比赛
                            if (a != 'x' && c != 'x' && c != 'z') {   //根据题意判断
                                System.out.println("a和" + a + "，b和" + b + "，c和" + c + "进行比赛");
                            }
                        }
                    }
                }
            }
        }
    }
}
