package com.lichunjie.leetcode.array.question04;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>(len);
        for (int num : nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}
