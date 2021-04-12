package com.lichunjie.leetcode.array.question03;

public class Solution {
    // 超出时间限制
    public static void rotate1(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int length = nums.length;
            int tmp = nums[length - 1];
            for (int i = length - 1; i > 0; i--) {
                nums[i] = nums[(i - 1) % i];
            }
            nums[0] = tmp;
        }
    }

    /**
     输入: nums = [1,2,3,4,5,6,7], k = 3
     输出: [5,6,7,1,2,3,4]
     解释:
     向右旋转 1 步: [7,1,2,3,4,5,6]
     向右旋转 2 步: [6,7,1,2,3,4,5]
     向右旋转 3 步: [5,6,7,1,2,3,4]
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i+k)%len] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate2(arr, k);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
