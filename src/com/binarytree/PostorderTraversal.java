package com.binarytree;

import java.util.*;

public class PostorderTraversal {
	

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
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null){
            return ans;
        }
        
        postOrderTraversal(root, ans);
        return ans;
    }
    public static void postOrderTraversal(TreeNode root, List < Integer > ans){
        if(root.left == null && root.right == null){
            ans.add(root.data);
            return;
        }
		 
if(root.left != null){
postOrderTraversal(root.left,ans);
}
        
       
        if(root.right != null){
postOrderTraversal(root.right,ans);
}
       ans.add(root.data);
    }
}
