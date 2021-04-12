package com.lichunjie.leetcode.array.question06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] arr = new int[nums2.length];
        int index = 0;
        for (int num : nums2) {
            Integer count = map.getOrDefault(num, 0);
            if (count > 0) {
                arr[index] = num;
                index++;
                map.put(num, count - 1);
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {1, 1, 3};
        System.out.println(intersect(arr1, arr2));
    }
}
