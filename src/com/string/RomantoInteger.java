package com.string;

public class RomantoInteger {

	public static void main(String[] args) {
		
// III
		
		System.out.println(romanToInt("MCMXCIV"));
	}
	
    public static int romanToInt(String s) {
    	int ans = 0;
    	int n = s.length();
    	for(int i=0;i<n;i++) {
    		char next = '0';
    		char ch = s.charAt(i);
    		if(i+1<n) {
    			next = s.charAt(i+1);
    		}
    		
    	    switch(ch) {
    	    case 'I':
    	    	if(next == 'V' || next == 'X') {
    	    		ans = ans - 1;
    	    	}else {
    	    		
    	    		ans = ans + 1;
    	    	}
    	    	break;
    	    case 'V':
    	    	ans = ans + 5;
    	    	break;
    	    case 'X':
    	    	if(next == 'C' || next == 'L') {
    	    		ans = ans - 10;
    	    	}else {
    	    		ans = ans + 10;
    	    	}
    	    	break;
    	    case 'L':
    	    	ans = ans + 50;
    	    	break;
    	    case 'C':
    	    	if(next == 'D' || next == 'M') {
    	    		ans = ans - 100;
    	    	}else {
    	    		ans = ans + 100;
    	    		
    	    	}
    	    	break;
    	    case 'D':
    	    	ans = ans + 500;
    	    	break;
    	    case 'M':
    	    	ans = ans + 1000;
    	    	break;
    	    }
    	}
    	
        return ans;
    }

}
