package com.string;

import java.util.HashSet;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s = "acvghgvpbab";
		//String s = "aaaa";
		System.out.println(longestPalindrome(s));
		
	}
//	  public static String longestPalindrome(String s) {
//
//	        if( s.length()==1){
//	            return s;
//	        }else if(s.length()==2){
//	            
//	            if(s.charAt(0)==s.charAt(1)){
//	                return s;
//	            }
//	            
//	            String ans = "";
//	            ans = ans + s.charAt(0);
//	            return ans;
//	        }
//	            String ans = "";
//			    String temp = "";
//			    int n = s.length();
//		   
//			    int right = 0,left = 0;
//			    
//			    for(int i=1;i<n-1;i++) {
//			    	
//			    	
//			    	if(s.length()%2==0) {
//			    		left = i;
//			    		right = i + 1;
//			    	}else {
//			    		left = i-1;
//				    	right = i+1;
//			    	}
//			   
//			    	while(left>=0 && right <= n-1) {
//			    		
//			    		if(s.charAt(left) == s.charAt(right)) {
//			    			temp = s.substring(left,right+1);
//			    		}else if(s.charAt(i) == s.charAt(right)){
//	                        temp = s.substring(i,right+1);
//	                    }else if(s.charAt(left) == s.charAt(i)){
//	                        temp = s.substring(left,i+1);
//	                    }
//			    		left--;
//			    		right++;
//			    	}
//	
//			    	
//			    	if(temp.length()>ans.length()) {
//			    		ans = temp;
//			    	}
//			    }
//	
//		        return ans;
//	    }
//	  
//	  public static boolean checkPalindrome(String s) {
//		  
//		  int n = s.length();
//		  for(int i=0;i<n/2;i++) {
//			  char startch = s.charAt(i);
//			  char endch = s.charAt(n-i-1);
//			  
//			  if(startch != endch) {
//				  return false;
//			  }
//		  }
//		  
//		  return true;
//	  }

	 public static String longestPalindrome(String s) {
	     int n = s.length();
		 int len1=0,len2=0,maxLen=0,start=0,end=0;
		 for(int i=0;i<n;i++) {
			 len1 = checkSubstringfromCentre(s,i,i+1);
			 len2 = checkSubstringfromCentre(s,i,i);
			 maxLen = Math.max(len1, len2);
			 
			 if(end - start < maxLen) {
				 start = i- (maxLen - 1)/2;
				 end = i + maxLen/2;
			 }
		 }

		return s.substring(start,end+1) ;
	}

   private static int checkSubstringfromCentre(String s,int i, int j) {
	   int n = s.length();
	while(i>=0 && j<n && s.charAt(i)== s.charAt(j)) {
		i--;j++;
	}
	return j-i-1;
}
	 
	 

}
