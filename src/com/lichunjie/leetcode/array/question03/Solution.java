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
    public static void rotate2(int[] nums, int k) {
            int length = nums.length;
            int tmp = nums[length-1];
            for (int i = length - 1; i > 0; i--) {
                nums[i+k%length] = nums[i+(k - 1) % length];
            }
            nums[(length +k+1)%length] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 1;
        rotate2(arr, k);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
