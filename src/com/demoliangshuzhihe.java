package com;

public class demoliangshuzhihe {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
//    private int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(nums[i])){
//                return new int[]{map.get(nums[i]), i};
//            }
//            map.put(target - nums[i], i);
//        }
//        return null;
//    }

    public static void main(String[] args) {
        demoliangshuzhihe d = new demoliangshuzhihe();
        int[] arr = new int[]{2, 7, 11, 15};

        int[] sum = d.twoSum(arr, 26);

        for (int i : sum) {
            System.out.println(i);
        }

    }


}
