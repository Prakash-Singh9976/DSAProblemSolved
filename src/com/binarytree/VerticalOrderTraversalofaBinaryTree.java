package com.binarytree;

import java.util.*;

public class VerticalOrderTraversalofaBinaryTree {
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
	  
	  //1st approach
	  public List<List<Integer>> verticalTraversal(TreeNode root) {
	        
	        List<List<Integer>> result = new ArrayList<>();
	        
	        if(root == null)return result;
	        
	        Queue<Pair> q = new LinkedList<Pair>();
	        TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<>();
	        
	        q.add(new Pair(0,root));
	        
	       
	        while(!q.isEmpty()){
	            Pair temp = q.remove();
	            int hd = temp.hd;
	    
	             System.out.println("hd "+temp.hd+ " Node "+temp.node.val);
	            
	         
	            if(mp.containsKey(hd)){
	                ArrayList<Integer> ans = mp.get(hd);
	                ans.add(temp.node.val);
	                
	                Collections.sort(ans);
	      
	                mp.put(hd,ans);
	            }else{
	              
	                mp.put(hd, new ArrayList<>(Arrays.asList(temp.node.val)));
	            }
	            
	            System.out.println(" Node "+temp.node.val);
	            if(temp.node.left != null){
	               
	                q.add(new Pair(hd-1,temp.node.left));
	            }
	            
	             if(temp.node.right != null){
	    
	                 q.add(new Pair(hd+1,temp.node.right));
	            }  
	        }
	        
	        for(Map.Entry<Integer,ArrayList<Integer>> entry : mp.entrySet()){
	           // System.out.println(entry.getKey()+" "+entry.getValue());
	            result.add(entry.getValue());
	        }
	        
	        return result;
	    }
	 class Pair{
	        int hd ;
	        TreeNode node;
	        
	        Pair(int hd , TreeNode node){
	            this.hd = hd;
	            this.node = node;
	        }
	        
	     }
}
