package com.zw.leetCode_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE,b=0;
        for(int i=0;i<nums.length;i++){
            if(b>0) b += nums[i];
            else b = nums[i];
            if(b>sum) sum = b;
        }
        return sum;
    }
}