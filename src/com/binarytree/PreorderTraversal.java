package com.binarytree;

import java.util.List;
import java.util.ArrayList;
public class PreorderTraversal {
	
	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}
	
	  public static List < Integer > getPreOrderTraversal(TreeNode root) {
	    	// Write your code here.
			  	List<Integer> ans = new ArrayList<Integer>();
	        if(root == null){
	            return ans;
	        }
	        
	        preOrderTraversal(root, ans);
	        return ans;
	    }
    public static void preOrderTraversal(TreeNode root, List < Integer > ans){
        if(root.left == null && root.right == null){
            ans.add(root.data);
            return;
        }
		 ans.add(root.data);
if(root.left != null){
preOrderTraversal(root.left,ans);
}
        
       
        if(root.right != null){
preOrderTraversal(root.right,ans);
}
    }
}
