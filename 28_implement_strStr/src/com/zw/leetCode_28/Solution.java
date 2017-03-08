package com.zw.leetCode_28;

public class Solution {
	public int strStr(String haystack,String needle){
		if(haystack.startsWith(needle)){
			return 0;
		}
		for(int i=0;i<haystack.length()-needle.length()+1;i++){
			int j;
			int k=i;
			for(j=0;j<needle.length();j++){
				if(haystack.charAt(k) != needle.charAt(j)){
					break;
				}
				k++;
			}
			if (j==needle.length()){
				return i;
			}
		}
		return -1;
	}
}
