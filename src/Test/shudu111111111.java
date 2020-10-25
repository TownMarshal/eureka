package Test;

import java.util.*;

/**
 * Created by Administrator on 2020/8/5 0005.
 * 数独解析
 */
public class shudu111111111 {

    public static void main(String[] args) {
        //生成候选数字表,9行9列，每个格子有9个数字
        int[][][] candi = new int[9][9][9];
        //初始化候选数字表
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                candi[i][j] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                ;
            }
        }
        int[][] sudo = {
                {0,0,9,6,0,0,0,3,0},
                {0,0,1,7,0,0,0,4,0},
                {7,0,0,0,9,0,0,8,0},
                {0,7,0,0,8,0,5,0,0},
                {1,0,0,0,4,0,0,2,0},
                {0,2,0,0,1,0,9,0,0},
                {5,0,0,0,0,9,0,0,0},
                {6,0,0,0,0,3,0,0,2},
                {4,0,0,0,0,0,0,0,1}
        };



        if (isOkSudo(candi, sudo)) {
            System.out.println("校验是不是一个合法数独：是");
        } else {
            System.out.println("校验是不是一个合法数独：不是");
            return;
        }

        crack(candi, sudo);

        //获取隐形数组中两个相等的数
        List<CandiInfo> equalCandi = getEqualCandi(candi, sudo);

        //获取其中一个进行试探。
        for (CandiInfo info : equalCandi) {

            //获取坐标
            String[] location = info.location.split("\\|");
            String[] ALocation = location[0].split("-");
            int aRow = Integer.parseInt(ALocation[0]);
            int aColumn = Integer.parseInt(ALocation[1]);
            String[] BLocation = location[1].split("-");
            int bRow = Integer.parseInt(BLocation[0]);
            int bColumn = Integer.parseInt(BLocation[1]);
            //获取数据
            int[] data = info.nums.stream().mapToInt(Integer::intValue).toArray();

            System.out.println("开始进行试探：data=" + data[0] + ", " + data[1] + " 位置：" + aRow + "-" + aColumn + ", " + bRow + "-" + bColumn);

            if (isRight(candi, sudo, aRow, aColumn, bRow, bColumn, data[0], data[1])) {
                modifySudoAndCandi(candi, sudo, aRow, aColumn, data[0]);
                modifySudoAndCandi(candi, sudo, bRow, bColumn, data[1]);
            } else {
                modifySudoAndCandi(candi, sudo, aRow, aColumn, data[1]);
                modifySudoAndCandi(candi, sudo, bRow, bColumn, data[0]);
            }
            crack(candi, sudo);
        }


        System.out.println("解析完成：");
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(sudo[i]));
        }
    }

    /**
     * 试探这样的组合是否正确
     *
     * @param candi
     * @param sudo
     * @param aRow
     * @param aColumn
     * @param bRow
     * @param bColumn
     * @param data0
     * @param data1
     * @return
     */
    private static boolean isRight(int[][][] candi, int[][] sudo, int aRow, int aColumn, int bRow, int bColumn, int data0, int data1) {
        int[][][] deepCandiCopy = new int[9][9][9];
        for (int i = 0; i < 9; i++) {
            deepCandiCopy[i] = candi[i].clone();
        }
        int[][] deepSudoCopy = new int[9][9];
        for (int i = 0; i < 9; i++) {
            deepSudoCopy[i] = sudo[i].clone();
        }
        modifySudoAndCandi(deepCandiCopy, deepSudoCopy, aRow, aColumn, data0);
        modifySudoAndCandi(deepCandiCopy, deepSudoCopy, bRow, bColumn, data1);

        crack(deepCandiCopy, deepSudoCopy);

        return isOkSudo(deepCandiCopy, deepSudoCopy);
    }

    /**
     * 隐藏数法解析数独
     *
     * @param candi 隐藏数数组
     * @param sudo  要解的数独
     */
    private static void crack(int[][][] candi, int[][] sudo) {

        eliminateCandidateNumbers(candi, sudo);

        //一轮结束后，查看隐形数组里有没有单个的，如果有继续递归一次
        boolean flag = false;
        for (int k = 0; k < 9; k++) {
            for (int q = 0; q < 9; q++) {
                int f = sudo[k][q];
                if (f == 0) {
                    int[] tmp = candi[k][q];
                    Set<Integer> s = new HashSet<>();
                    for (int t = 0; t < tmp.length; t++) {
                        if (tmp[t] > 0) {
                            s.add(tmp[t]);
                        }
                    }
                    //说明有单一成数据可以用的
                    if (s.size() == 1) {
                        flag = true;
                        modifySudoAndCandi(candi, sudo, k, q, s.stream().mapToInt(Integer::intValue).toArray()[0]);
                    }
                }
            }
        }
        //如果有确定的单个数，进行递归一次
        if (flag) {
            crack(candi, sudo);
        }
        //查看行有没有唯一数字，有就递归一次
        flag = checkRow(candi, sudo);
        if (flag) {
            crack(candi, sudo);
        }
        //查看列有没有唯一数字，有就递归一次
        flag = checkColumn(candi, sudo);
        if (flag) {
            crack(candi, sudo);
        }
    }

    /**
     * 剔除数组中的候选数字,剔除行、列、宫
     *
     * @param candi
     * @param sudo
     */
    private static void eliminateCandidateNumbers(int[][][] candi, int[][] sudo) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sudo[i][j];
                //剔除备选区数字
                if (num > 0) {
                    candi[i][j] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
                    for (int m = 0; m < 9; m++) {
                        int[] r = candi[i][m];
                        r[num - 1] = 0;
                        int[] c = candi[m][j];
                        c[num - 1] = 0;
                    }
                    //摒除宫里的唯一性
                    //取整,获取宫所在数据
                    int palaceRow = i / 3;
                    int palaceColumn = j / 3;
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            int[] p = candi[palaceRow * 3 + m][palaceColumn * 3 + n];
                            p[num - 1] = 0;
                        }
                    }
                }
            }
        }
    }

    /**
     * 修改数独的值并剔除隐形数字
     *
     * @param candi
     * @param sudo
     * @param row
     * @param column
     * @param v
     */
    private static void modifySudoAndCandi(int[][][] candi, int[][] sudo, int row, int column, int v) {
        //修改数独的值
        sudo[row][column] = v;

        //剔除备选区数字
        candi[row][column] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int m = 0; m < 9; m++) {
            int[] r = candi[row][m];
            r[v - 1] = 0;
            int[] c = candi[m][column];
            c[v - 1] = 0;
        }
        //摒除宫里的唯一性
        //取整,获取宫所在数据
        int palaceRow = row / 3;
        int palaceColumn = column / 3;
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                int[] p = candi[palaceRow * 3 + m][palaceColumn * 3 + n];
                p[v - 1] = 0;
            }
        }
    }

    /**
     * 查看行中的隐形数组有没有唯一存在的候选值
     *
     * @param candi
     * @param sudo
     * @return
     */
    private static boolean checkRow(int[][][] candi, int[][] sudo) {
        boolean flag = false;
        for (int i = 0; i < 9; i++) {
            Map<String, Set<Integer>> candiMap = new HashMap<>();
            int[] row = sudo[i];
            for (int j = 0; j < 9; j++) {
                if (row[j] == 0) {
                    int[] tmp = candi[i][j];
                    Set<Integer> set = new HashSet<>();
                    for (int k = 0; k < tmp.length; k++) {
                        if (tmp[k] > 0) {
                            set.add(tmp[k]);
                        }
                    }
                    candiMap.put(String.valueOf(i) + "-" + String.valueOf(j), set);
                }
            }
            if (candiMap.size() > 0) {
                Set<String> keys = candiMap.keySet();
                Iterator iterator = keys.iterator();
                while (iterator.hasNext()) {
                    String tKey = (String) iterator.next();
                    //要查看的集合
                    Set<Integer> set = deepCopySet(candiMap.get(tKey));
                    //深复制
                    Set<String> tmpKeys = candiMap.keySet();
                    Iterator tmpKeyIterator = tmpKeys.iterator();
                    while (tmpKeyIterator.hasNext()) {
                        String tmpKey = (String) tmpKeyIterator.next();
                        //取交集
                        if (!tKey.equals(tmpKey)) {
                            set.removeAll(candiMap.get(tmpKey));
                        }
                    }
                    //交集取完，集合空了,看下一个结合有没有
                    if (set.size() == 0) {
                        continue;
                    } else {
                        //还剩一个唯一值
                        if (set.size() == 1) {
                            String[] ks = tKey.split("-");
                            flag = true;
                            modifySudoAndCandi(candi, sudo, Integer.parseInt(ks[0]), Integer.parseInt(ks[1]), set.stream().mapToInt(Integer::intValue).toArray()[0]);
                        }
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 查看列中的隐形数组有没有唯一存在的候选值
     *
     * @param candi
     * @param sudo
     * @return
     */
    private static boolean checkColumn(int[][][] candi, int[][] sudo) {
        boolean flag = false;
        for (int i = 0; i < 9; i++) {
            Map<String, Set<Integer>> candiMap = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                if (sudo[j][i] == 0) {
                    int[] tmp = candi[j][i];
                    Set<Integer> set = new HashSet<>();
                    for (int k = 0; k < tmp.length; k++) {
                        if (tmp[k] > 0) {
                            set.add(tmp[k]);
                        }
                    }
                    candiMap.put(String.valueOf(i) + "-" + String.valueOf(j), set);
                }
            }
            if (candiMap.size() > 0) {
                Set<String> keys = candiMap.keySet();
                Iterator iterator = keys.iterator();
                while (iterator.hasNext()) {
                    String tKey = (String) iterator.next();
                    //要查看的集合
                    Set<Integer> set = deepCopySet(candiMap.get(tKey));
                    //深复制
                    Set<String> tmpKeys = candiMap.keySet();
                    Iterator tmpKeyIterator = tmpKeys.iterator();
                    while (tmpKeyIterator.hasNext()) {
                        String tmpKey = (String) tmpKeyIterator.next();
                        //取交集
                        if (!tKey.equals(tmpKey)) {
                            set.removeAll(candiMap.get(tmpKey));
                        }
                    }
                    //交集取完，集合空了,看下一个结合有没有
                    if (set.size() == 0) {
                        continue;
                    } else {
                        //还剩一个唯一值
                        if (set.size() == 1) {
                            String[] ks = tKey.split("-");
                            flag = true;
                            modifySudoAndCandi(candi, sudo, Integer.parseInt(ks[1]), Integer.parseInt(ks[0]), set.stream().mapToInt(Integer::intValue).toArray()[0]);
                        }
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 获取隐形数字中宫中两个相等的数字
     *
     * @return
     */
    private static List<CandiInfo> getEqualCandi(int[][][] candi, int[][] sudo) {
        //找到两个相等数字
        //遍历宫
        List<CandiInfo> maps = new ArrayList<>();
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                Map<String, Set<Integer>> palaceMap = new HashMap<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int sudoRow = m * 3 + i;
                        int sudoColumn = n * 3 + j;
                        if (sudo[sudoRow][sudoColumn] == 0) {
                            int[] tmpX = candi[sudoRow][sudoColumn];
                            Set<Integer> set = new HashSet<>();
                            for (int k = 0; k < tmpX.length; k++) {
                                if (tmpX[k] > 0) {
                                    set.add(tmpX[k]);
                                }
                            }
                            if (set.size() == 2) {
                                palaceMap.put(String.valueOf(sudoRow) + "-" + String.valueOf(sudoColumn), set);
                            }
                        }
                    }
                }

                Set<String> pSet = palaceMap.keySet();
                Iterator pIterator = pSet.iterator();
                while (pIterator.hasNext()) {
                    String key = (String) pIterator.next();
                    Iterator tmpIterator = pSet.iterator();
                    while (tmpIterator.hasNext()) {
                        String tmpKey = (String) tmpIterator.next();
                        if (!key.equals(tmpKey)) {
                            Set<Integer> tmpIntSet = palaceMap.get(tmpKey);
                            Set<Integer> palaceIntSet = deepCopySet(palaceMap.get(key));
                            palaceIntSet.removeAll(tmpIntSet);
                            //说明两个集合相等
                            if (palaceIntSet.size() == 0) {
                                CandiInfo candiInfo = new CandiInfo();
                                candiInfo.location = key + "|" + tmpKey;
                                candiInfo.nums = palaceMap.get(key);
                                maps.add(candiInfo);
                            }
                        }
                    }
                }
            }
        }
        List<CandiInfo> infos = new ArrayList<>();
        CandiInfo candiInfo = null;
        for (CandiInfo info : maps) {
            if (candiInfo == null) {
                candiInfo = info;
            } else {
                if (candiInfo.nums.equals(info.nums)) {
                    infos.add(info);
                }
                candiInfo = info;
            }
        }
        return infos;
    }

    /**
     * 校验这个数独是不是还满足数独的特点
     * 思路：
     * 1. 校验行和列有没有重复的数字
     * 2. 校验数独是0的格子，对应的隐形数组还有没有值，如果没有候选值，肯定是某一个地方填错了
     *
     * @param candi 隐形数组
     * @param sudo  数独二维数组
     * @return
     */
    private static boolean isOkSudo(int[][][] candi, int[][] sudo) {
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            //校验行
            Set<Integer> rowSet = new HashSet<>();
            //校验列
            Set<Integer> clumnSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int rowV = sudo[i][j];
                int cloumV = sudo[j][i];
                if (rowV > 0) {
                    if (!rowSet.add(rowV)) {
                        flag = false;
                        break;
                    }
                }
                if (cloumV > 0) {
                    if (!clumnSet.add(cloumV)) {
                        flag = false;
                        break;
                    }
                }

            }
            if (!flag) {
                break;
            }
        }
        //校验隐形数字是否为空
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 9; n++) {
                if (sudo[m][n] == 0) {
                    int[] s = candi[m][n];
                    Set<Integer> set = new HashSet<>();
                    for (int p = 0; p < s.length; p++) {
                        if (s[p] > 0) {
                            set.add(s[p]);
                        }
                    }
                    if (set.size() == 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 深度复制set集合
     *
     * @param source
     * @return
     */
    private static Set<Integer> deepCopySet(Set<Integer> source) {
        Set<Integer> deepCopy = new HashSet<>();
        Iterator iterator = source.iterator();
        while (iterator.hasNext()) {
            deepCopy.add((Integer) iterator.next());
        }
        return deepCopy;
    }

    public static class CandiInfo {
        String location;
        Set<Integer> nums;
    }
}