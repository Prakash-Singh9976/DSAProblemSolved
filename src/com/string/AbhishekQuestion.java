package com.string;

public class AbhishekQuestion {
   
	public static void main(String[] args) {
		
		String str = "I love this wor33ld";
		System.out.println('!'-'0');
		System.out.println(largestWord(str));
	}
	
	public static String largestWord(String str) {
		String ans = "";
		int max=0;
		String []s = str.split(" ");
		boolean flag = false;
		
		for(int i=0;i<s.length;i++) {
			String temp = s[i];
			
			for(int j=0;j<temp.length();j++) {
				char ch = temp.charAt(j);
				if(ch-'0'>=17 && ch-'0'<=74) {
					
				}else {
					flag = true;
				}
			}
			if(flag==true) {
				flag = false;
				continue;
			}else {
				if(temp.length()>max) {
					max = temp.length();
					ans = temp;
				}
			}
		
		}
		
		return ans;
	}
}
