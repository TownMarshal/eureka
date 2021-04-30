package JingDianSuanFa;

public class sortPop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 77, 8, 9, 12};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

    }
}
