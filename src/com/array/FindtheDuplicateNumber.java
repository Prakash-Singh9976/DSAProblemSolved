package com.array;
import java.util.HashMap;
public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
	}
	
    public  static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
          if(hm.containsKey(nums[i]) && hm.get(nums[i])>1){
              return nums[i];
          }
          System.out.println("key : "+nums[i]+"Value : "+hm.get(nums[i]));
        }
        return -1;
    }

}
