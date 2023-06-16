package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class CombinationSumII {
    public static void main(String[] args) {
		
		/*
		 * 7 8
10 1 2 7 6 1 5
*/
		List<Integer> temp = Arrays.asList(10 ,1,2, 7, 6, 1, 5);
		
		ArrayList<Integer> arr = new ArrayList<>(temp);
		
		ArrayList<ArrayList<Integer>> result = combinationSum2(arr,7,8);
	
	}
    
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++) {
        	hs.add(arr.get(i));
        }
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int e : hs) {
        	arr2.add(e);
        }
        findSubset(arr2,0,new ArrayList<>(),0,target,result);
    	return result;
    }
    
    public static void findSubset(ArrayList<Integer> arr,int i, ArrayList<Integer> ds,int sum,int target,ArrayList<ArrayList<Integer>> result) {
		  if(i==arr.size()) {
			  if(sum==target) {
				  System.out.println(ds);
				  result.add(new ArrayList<>(ds));
			  }
			 
			  return;
		  }
		  
		  ds.add(arr.get(i));
		  findSubset(arr,i+1,ds,sum+arr.get(i),target,result);
		  ds.remove(ds.size()-1);
		  findSubset(arr,i+1,ds,sum,target,result);
	  }
}
