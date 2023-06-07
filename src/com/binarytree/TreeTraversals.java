package com.binarytree;
import java.util.* ;
public class TreeTraversals {
	
	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

	 public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
     	List<List<Integer>> result = new ArrayList<>();
     if(root == null){
         return result;
     }
		List<Integer> in = new ArrayList<Integer>();
     inOrderTraversal(root, in);
		result.add(in);
		List<Integer> pre = new ArrayList<Integer>();
     preOrderTraversal(root, pre);
     result.add(pre);
		List<Integer> post = new ArrayList<Integer>();
     postOrderTraversal(root, post);
     result.add(post);
     return result;
 }
	 
	 public static void inOrderTraversal(BinaryTreeNode<Integer> root, List < Integer > in){
	        if(root.left == null && root.right == null){
	            in.add(root.data);
	            return;
	        }
	       if(root.left != null){
	          inOrderTraversal(root.left,in);
	        }
	        
	        in.add(root.data);
	        if(root.right != null){
	          inOrderTraversal(root.right,in);
	        }
	    }

		  public static void preOrderTraversal(BinaryTreeNode<Integer> root, List < Integer > pre){
	        if(root.left == null && root.right == null){
	            pre.add(root.data);
	            return;
	        }
			 pre.add(root.data);
	        if(root.left != null){
	         preOrderTraversal(root.left,pre);
	        }
	        
	       
	        if(root.right != null){
	         preOrderTraversal(root.right,pre);
	        }
	    }

			    public static void postOrderTraversal(BinaryTreeNode<Integer> root, List < Integer > post){
	        if(root.left == null && root.right == null){
	            post.add(root.data);
	            return;
	        }
			 
	       if(root.left != null){
	           postOrderTraversal(root.left,post);
	        }
	        
	       
	        if(root.right != null){
	        postOrderTraversal(root.right,post);
	         }
	       post.add(root.data);
	    }
}
