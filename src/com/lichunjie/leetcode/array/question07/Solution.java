package com.lichunjie.leetcode.array.question07;

public class Solution {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (0 != digits[i]) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public static void main(String[] args) {
        int[] arr = {0};
        for (int i : plusOne(arr)) {
            System.out.println(i);
        }
    }
}
