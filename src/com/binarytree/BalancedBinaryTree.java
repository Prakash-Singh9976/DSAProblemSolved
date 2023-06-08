package com.binarytree;



public class BalancedBinaryTree {
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	public boolean isBalanced(TreeNode root) {
	     if(root == null)return true;
	        
	        int leftHeight = getHeight(root.left);
	        int rightHeight = getHeight(root.right);
	        
	       // System.out.println(Math.abs(leftHeight- rightHeight));
	        if(Math.abs(leftHeight- rightHeight)>1)return false;
	        
	        return  isBalanced(root.left) && isBalanced(root.right);
	    }
	    
	    public static int getHeight(TreeNode root){
	        if(root == null)return 0;
	        
	        return Math.max(getHeight(root.left),getHeight(root.right))+1;
	    }
}
