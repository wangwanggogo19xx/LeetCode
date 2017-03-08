package com.zw.leetCode_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return bianrySearch(nums, 0, nums.length-1, target);
    }
    public int bianrySearch(int[] nums,int start,int end,int target){
    	if(end == start){
    	    if(nums[start] >= target) return start;
    	    else return start + 1;
    	} 
    	if(nums[(start+end)/2] == target) return (start+end)/2;
    	else if(nums[(start+end)/2] > target) return bianrySearch(nums, start, (start+end)/2, target);
    	else if(nums[(start+end)/2] < target) return bianrySearch(nums, (start+end)/2+1, end, target);
    	return 0;
    }
}