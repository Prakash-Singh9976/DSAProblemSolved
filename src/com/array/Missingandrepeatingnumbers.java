package com.array;

import java.util.*;

public class Missingandrepeatingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int[] missingAndRepeating(ArrayList<Integer> list, int n) {
        
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int []ans = new int[2];
        for(int i=0;i<n;i++){
            int no = list.get(i);
            hm.put(no,hm.getOrDefault(no,0)+1);
        }
     
        for(int i=1;i<=n;i++){
            if(!hm.containsKey(i)){
               ans[0] = i;
            }else if(hm.get(i)>1){
              ans[1] = i;
            }
        }
        
        return ans;
    }

}
