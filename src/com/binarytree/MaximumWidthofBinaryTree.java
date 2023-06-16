package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import com.binarytree.SameTree.TreeNode;

public class MaximumWidthofBinaryTree {
 
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
    class Pair{
        int index;
        TreeNode node;
        
       public Pair(TreeNode node , int index ){
           this.node = node;
           this.index = index;
       }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        
        while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().index; //to make index start from zero
            int first = 0, last = 0;
            for(int i=0;i<size;i++){
                int cur_id = q.peek().index - mmin;
                TreeNode node = q.peek().node;
                q.poll();
                
                if(i==0){
                    first =  cur_id;
                }
               if(i==size-1){
                   last = cur_id;
               }
                if(node.left != null){
                    q.offer(new Pair(node.left,2*cur_id+1));
                }
                if(node.right != null){
                    q.offer(new Pair(node.right,2*cur_id+2));
                }
            }
            ans = Math.max(ans,last-first +1);
        }
        
        return ans;
    }
}}
