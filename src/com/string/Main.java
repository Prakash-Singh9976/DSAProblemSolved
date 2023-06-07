package com.string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(armstrongNo(153));
        
        for(int i=0;i<1000;i++) {
        	if(armstrongNo(i)) {
        		System.out.println(i);
        	}
        }
	}
	
	public static boolean armstrongNo(int n) {
		
		int k = n;
		
		int length = String.valueOf(n).length();
	
		int ans = 0;
		while(k>0) {
			int rem = k%10;
			ans = (int) (ans + Math.pow(rem, length));
			k = k/10;
		}
		
		if(ans==n)return true;
		
		return false;
	}
	
	
	public static boolean palindromeNo(int n) {
		
		int length = String.valueOf(n).length();
		for(int i=0;i<=length/2;i++) {
		
		}
		
		return true;
	}
}
