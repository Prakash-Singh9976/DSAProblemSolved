package com.string;

public class LongestCommonPrefix { 

        public static void main(String[] args) {
	        String []strs = {"flower","flow","flight"};
	        System.out.println(longestCommonPrefix(strs));
         }
	
        public static String longestCommonPrefix(String[] strs) {
            
            if(strs.length == 0 ){
                return "";
            }else if(strs.length ==1 && strs[0].equals("")){
                return "";
            }
            String result = "";
            int min = minLength(strs);
            
            if(min < 1){
                return "";
            }
            
             char current;
            for(int i=0;i<min;i++){
        
              current = strs[0].charAt(i);
     
                for(int j=1;j<strs.length;j++){
                    
                    if(current != strs[j].charAt(i)){
                        return result;
                    }
                }
                
                result += current;
            }
            
            return result;
        }
        
        
        public static int minLength(String[] strs){
            
            //int min = Integer.MAX_VALUE;
             int min = strs[0].length();
            
            for(String str : strs){
                if(str.length()<min){
                    min = str.length();
                }
            }
            return min;
        }
}
