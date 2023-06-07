package com.binarytree;
import java.util.* ;
public class LeftViewOfaBinaryTree {
	   class TreeNode<T> 
	    {
	       public T data;
	       public    TreeNode<T> left;
	      public  TreeNode<T> right;

	        TreeNode(T data) 
	        {
	            this.data = data;
	            left = null;
	            right = null;
	        }
	    };
	    
	    
	    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
	    {
	          ArrayList<Integer> ds = new ArrayList<Integer>();
	        if(root == null){
	            return ds;
	        }
	        
	        leftView(root,0,ds);
	        return ds;
	    }

	    public static void leftView(TreeNode<Integer> root,int height,ArrayList<Integer> ds){
	        if(root.left == null && root.right == null){
	       
	         if(ds.size()==height){
	            ds.add(root.data);
	        }
	            return;
	        }

	        if(ds.size()==height){
	            ds.add(root.data);
	        }
	        if(root.left != null){
	          leftView(root.left,height+1,ds);
	        }
	        if(root.right != null){
	          leftView(root.right,height+1,ds);
	        }
	    }
}
