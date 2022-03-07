package JingDianSuanFa;

import java.util.HashMap;
import java.util.Map;

/**
 * arr 0 1 2 3 4 5
 * 0   < < < < < val
 * 1              >
 * 2              >
 * 3   tar        >
 * 4              >
 * 1）我么设初始值为右上角元素，arr[0][5] = val，目标tar = arr[3][1]
 * 2）接下来进行二分操作：
 * 3）如果val == target,直接返回
 * 4）如果 tar > val, 说明target在更大的位置，val左边的元素显然都是 < val，间接 < tar，说明第 0 行都是无效的，所以val下移到arr[1][5]
 * 5）如果 tar < val, 说明target在更小的位置，val下边的元素显然都是 > val，间接 > tar，说明第 5 列都是无效的，所以val左移到arr[0][4]
 * 6）继续步骤2）
 * <p>
 * 复杂度分析
 * 时间复杂度：O(m+n) ，其中m为行数，n为列数，最坏情况下，需要遍历m+n次。
 * 空间复杂度：O(1)
 */
public class Erfenchazhao {
    public static void main(String[] args) {
        int[] arr = {2, 32, 423, 526, 657, 14, 6356, 5, 5356};
        int i = 14;
        Erfenchazhao er = new Erfenchazhao();
        int search = er.search(arr, i);
//        System.out.println(search);//5，查找出数组中元素为14的下标为5


        int[][] arr1 = {
//                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(arr1.length);//表示二维数组有几行
        System.out.println(arr1[0].length);//表示二维数组有几列

        for (int a = 0; a < arr1[0].length; a++) {
            System.out.println(arr1[0][a]);
        }
        Map map = er.searchTwoArr(9, arr1);
        System.out.println(map);


    }

    //单向查找
    private int search(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //动态分割数组
    public int search1(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r >> 1);// mid = l + （（r - l) >> 1)， val>>1, 表示val右移一位相当于val／2，相当于 l+(r-l)/2,这样的写法是防止溢出。如果写成 mid = （l+r)/2; l+r可能会溢出。
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l] == target ? l : -1;
    }

    /*
    在一个二维数组array中（每个一维数组的长度相同），
    每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    */
    //二维数组二分查找
    /*
    * 从左下找
1. 分析
利用该二维数组的性质：

每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序
改变个说法，即对于左下角的值 m，m 是该行最小的数，是该列最大的数
每次将 m 和目标值 target 比较：

当 m < target，由于 m 已经是该行最大的元素，想要更大只有从列考虑，取值右移一位
当 m > target，由于 m 已经是该列最小的元素，想要更小只有从行考虑，取值上移一位
当 m = target，找到该值，返回 true
用某行最小或某列最大与 target 比较，每次可剔除一整行或一整列
    * */
//    public boolean searchTwoArr(int target, int[][] array) {
    public Map searchTwoArr(int target, int[][] array) {
        HashMap<Object, Object> map = new HashMap<>();
        //二维数组有r行
        int r = array.length;
        if (r == 0) {
            map.put(false, "");
//            return false;
        }
        //二维数组有c列
        int c = array[0].length;
        if (c == 0) {
            map.put(false, "");
//            return false;
        }
        // 从左下角开始查找，row表示行坐标，col表示列坐标
        int row = r - 1;//最后一行
        int col = 0;//第一列
        while (row >= 0 && col < c) {
            if (array[row][col] < target) {
                col++;
            } else if (array[row][col] > target) {
                row--;
            } else {
                map.put(true, array[row][col]);
                map.put("row", row);
                map.put("col", col);
                return map;
//                return true;
            }
        }
        map.put(false, "");
        return map;
//        return false;
    }

}
