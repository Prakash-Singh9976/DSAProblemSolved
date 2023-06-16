package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnSubsetsSumtoK {
	public static void main(String[] args) {
    	/*
		6 
5 -1 8 2 7 0
7
		*/
		 ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		 ArrayList<Integer> arr = new ArrayList<>();
		 arr.add(5);
		 arr.add(-1);
		 arr.add(8);
		 arr.add(2);
		 arr.add(7);
		 arr.add(0);
		 findSubset(arr,0,new ArrayList<>(),0,7,result);
		 System.out.println(result);
		 
	}
	  public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
		{
		  ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		  findSubset(arr,0,new ArrayList<>(),0,k,result);
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
