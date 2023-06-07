package com.string;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.*/
		String haystack = "adbutsad", needle = "sad";
		System.out.println(strStr(haystack,needle));
	}
	
	 public static  int strStr(String haystack, String needle) {
		
		 if(haystack.length()<needle.length()) {
			 return -1;
		 }
	     int i=0;
	     int n = needle.length();  
	     while(i<=haystack.length()-n) {
	    	
	    	 String sub = haystack.substring(i,n+i);
	    	
	    	 if(sub.equals(needle)) {
	    		 return i;
	    	 }
	    	 i++;
	     }
		 
	       return -1; 
	    }

}
