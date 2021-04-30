public class Sort {

    /**
     * 冒泡排序
     * @param arrs
     */
    public static void bubbleSort(int[] arrs){
        int n = arrs.length;
        if (n <= 1)
            return;
        for (int i=0; i<n; i++){
            //排序过程中是否进行位置交换
            boolean flag = false;
            for (int j=0; j<n-i-1; j++){
                if (arrs[j] > arrs[i]){
                    int temp = arrs[j];
                    arrs[j] = arrs[i];
                    arrs[i] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    /**
     * 插入排序
     * @param arrs
     */
    public void insertSort(int[] arrs){
        int n = arrs.length;
        if (n <= 1)
            return;
        for (int i=1; i<n; i++){
            int value = arrs[i];
            int j = i-1;
            //查询插入的位置
            for (; j >= 0; j--){
                if (arrs[j] > value){
                    arrs[j+1] = arrs[j];//数据移动
                } else {
                   break;
                }
            }
            arrs[j+1] = value;
        }
    }

}
