package com.lichunjie.leetcode.array.question01;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;
        int index = 0;
        int length = nums.length;
        for (int j = 1; j < length; j++) {
            if (nums[index] != nums[j]) {
                index++;
                nums[index] = nums[j];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(arr);
        System.out.println("数组大小为:" + result);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
