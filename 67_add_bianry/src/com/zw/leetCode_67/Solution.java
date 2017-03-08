package com.zw.leetCode_67;

public class Solution {
    public String addBinary(String a, String b) {
    	return addSingleString(a, b, false);
    }
    public String addSingleString(String a,String b,boolean isCarry){
    	if(a.length() == 0 && b.length() == 0) return isCarry?"1":"";
    	else if(b.length() == 0){
    		if(a.charAt(a.length()-1) == '1'){
    			return addSingleString(a.substring(0,a.length()-1), b, isCarry)+(isCarry? "0":"1");
    		}else{
    			return addSingleString(a.substring(0,a.length()-1), b, false)+(isCarry? "1":"0");
    		}
    	}else if(a.length() == 0){
    		return addSingleString(b, a, isCarry);
    	}else{
    		if(a.charAt(a.length()-1) == b.charAt(b.length()-1)){
    			return addSingleString(a.substring(0,a.length()-1),  b.substring(0,b.length()-1), a.charAt(a.length()-1)=='1')+(isCarry?"1":"0");
    		}else{
    			return addSingleString(a.substring(0,a.length()-1),  b.substring(0,b.length()-1), isCarry)+(isCarry?"0":"1");
    		}
    	
    	}
    	
    }
}