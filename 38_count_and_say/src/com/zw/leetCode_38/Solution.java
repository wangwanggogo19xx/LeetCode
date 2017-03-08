package com.zw.leetCode_38;


public class Solution {
    public String countAndSay(int n) {
    	String string = "1";
        for(int i=1;i<n;i++){
        	string = newString(string);
        }
        return string;
    }
    public String newString(String string){
    	if(string.length() == 0) return "";
    	else if(string.length() == 1) return "1"+string;
    	else {
    		int count = 1 ;
    		for(int i=1;i<string.length();i++){
    			if(string.charAt(i) != string.charAt(i-1)){
    				return String.valueOf(i)+String.valueOf(string.charAt(i-1)) + newString(string.substring(i));
    			}
    			count++;
    		}
    		return String.valueOf(count)+string.substring(string.length()-1);
    	}
    	
    }
}