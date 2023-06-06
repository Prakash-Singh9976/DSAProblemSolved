package com.binarySearch;
import java.util.ArrayList;
public class KthelementoftwosortedArrays {

    public long kthElement( int nums1[], int nums2[], int n, int m, int k) {
        int i=0,j=0;
       ArrayList<Integer> result = new ArrayList<>();
       while(i<nums1.length && j<nums2.length){
           if(nums1[i]<=nums2[j]){
               result.add(nums1[i]);
               i++;
             }else{
                 result.add(nums2[j]);
               j++;
           }
         }
       
       while(i<nums1.length){
           result.add(nums1[i]);
           i++;
       }
       
        while(j<nums2.length){
           result.add(nums2[j]);
           j++;
       }
       
       return result.get(k-1);
       
   }
}
