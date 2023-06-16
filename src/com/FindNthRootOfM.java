package com;

public class FindNthRootOfM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(NthRoot(5,32768));
	}
    
    public static int NthRoot(int n, int m) {
        long start = 0;
        long end = m;

        while(start<=end){
            long mid  = start + (end - start)/2;
            long ans = 1;
            System.out.println("Mid : "+mid);
            for(int i = 0;i<n;i++){
            	if(ans*mid>Integer.MAX_VALUE) {
            		ans = Integer.MAX_VALUE;
            		break;
            	}else {
            		ans = ans*mid;
            	}
             
           }
            System.out.println("Ans : "+ans);
            if(ans == m)return (int)mid;
            else if(ans>m)end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
