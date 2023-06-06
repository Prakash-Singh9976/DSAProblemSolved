package com.binarySearch;
import java.util.ArrayList;
public class MedianofTwoSortedArrays {

	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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
        
        double ans = 0.0;
        
        int size = result.size();
  
        if(size%2==1){
            ans = result.get(size/2);
        }else{
            double m = result.get(size/2 - 1);
            double n = result.get(size/2);
            ans = (m + n )/2;
     }
        
        return ans;
    }
}
