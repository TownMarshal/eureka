package JingDianSuanFa;

/**
 * 5. 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
 * 示例 1：
 * 输入：weights = [1,2,3,4,5,6,7,8,9,10], D = 5
 * 输出：15
 * 解释：
 * 船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
 * 第 1 天：1, 2, 3, 4, 5
 * 第 2 天：6, 7
 * 第 3 天：8
 * 第 4 天：9
 * 第 5 天：10
 */
public class chuansongdai {

    public static void main(String[] args) {
        Solution So = new Solution();
        int[] weights = {1, 2, 3, 1, 1};
        int D = 4;
        System.out.println(So.shipWithinDays(weights, D));
    }
}

class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int res = 0;//统计所有包裹的重量
        int max = 0;//包裹中的重量最大值
        for (int i = 0; i < weights.length; i++) {
            res += weights[i];
            if (max < weights[i]) {
                max = weights[i];
            }
        }
        res = Math.max(res / D, max); // “最低标准”
        while (true) {
            int sum = 0;
            int d = 1;//验证天数
            for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] <= res) {
                    sum += weights[i];
                } else {
                    sum = weights[i];
                    d++;
                }
            }
            if (d <= D) {
                return res;
            } else {
                res++;
            }
        }
    }
}


