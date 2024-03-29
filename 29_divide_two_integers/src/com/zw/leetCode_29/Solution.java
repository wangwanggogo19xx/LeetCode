package com.zw.leetCode_29;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int divide(int dividend,int divisor){
		int sign=-1;
		if((dividend>0 && divisor>0)||(dividend<0 && divisor<0)){
			sign = 1;
		}
		long result =0;
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		List<Long> list = new ArrayList<Long>();
		long rest = ldividend - ldivisor;
		if(rest < 0){
			return 0;
		}
		if(rest < ldivisor){
			return sign == 1? 1:-1;
		}
		list.add(ldivisor);
		result = 1;
		while(ldividend>=list.get(list.size()-1)+list.get(list.size()-1)){
			list.add(list.get(list.size()-1)+list.get(list.size()-1));
			result += result;
			rest = ldividend - list.get(list.size()-1);
		}
		long result2 = 0;
		while(rest >= list.get(0)){
			for(int i=0;i<list.size();i++){
				if( rest >= list.get(i) ){
					if(i==0){
						result2 = 1;
					}else{
						result2 += result2;
					}
				}else{
					result += result2;
					rest = rest - list.get(i-1);
					break;
				}
			}
		}
		result= sign == 1? result:-result;
		if(result>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		return (int)result;
		
		
	}
}
