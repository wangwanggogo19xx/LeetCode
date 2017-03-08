package com.zw.leetCode_58;

public class Solution {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
        int end = s.lastIndexOf(" ");
        return s.substring(end+1).length();
    }
}