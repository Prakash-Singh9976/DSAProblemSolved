package com.string.part1;

public class StringtoInteger_atoi {

	public static void main(String[] args) {
		
		System.out.println(myAtoi("493aaa"));
	}

    public static int myAtoi(String s) {
        int result = 0;
        boolean flag = false;
        char lastCh = '.';
        char ch ='.' ;
        for(int i=0;i<s.length();i++){
      	
            ch = s.charAt(i);
           if(ch == '-') 
           {
        	   flag = true;
            }
            int no  = ch-'0';
           
            if(no >=0 && no <= 9){
            	lastCh = ch;
                result = result*10 + no;
            }
            
        }
//        System.out.println(lastCh);
//        System.out.println(ch-'0');
        if(lastCh-'0'>=0 && lastCh-'0'<=9 && ch-'0'<0 || ch-'0'>9 ) {
        	return -1;
        }
        if(flag) {
        	return (-1)*result;
        }
       return result;
    }
}
