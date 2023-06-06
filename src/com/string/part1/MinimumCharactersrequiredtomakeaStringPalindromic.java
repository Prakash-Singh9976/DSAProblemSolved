package com.string.part1;

public class MinimumCharactersrequiredtomakeaStringPalindromic {

	public static void main(String[] args) {
		String s = "BABB";
        System.out.println(solve(s));
	}
	 public static  int solve(String s) {
		String rev = "";
		int count = 0;
		
		if(checkPalindrome(s)) {
			return 0;
		}
		int i=0,j=s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i) == s.charAt(j)) {
				s = s.substring(i+1,j);
				i++;j--;
			}else {
				break;
			}
		}
		System.out.println(s);
		for( i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
	   //	System.out.println(rev);
	   	String ans = rev.substring(0,rev.length()-1) + s.substring(0);
	   
		 return ans.length()-s.length();
	    }
	 
	 public static boolean checkPalindrome(String s) {
		 
		 int i = 0,j=s.length()-1;
		 while(i<=j) {
			 if(s.charAt(i)==s.charAt(j)) {
				 i++;
				 j--;
			 }else {
				 return false;
			 }
		 }
		 return true;
	 }
}
