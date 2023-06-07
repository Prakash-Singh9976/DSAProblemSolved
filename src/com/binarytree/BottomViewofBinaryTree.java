package com.binarytree;

import java.util.ArrayList;
import java.util.*;

public class BottomViewofBinaryTree {
	
	class Node{
		int data;
		int hd;
		Node left,right;
		
		Node(int key){
			this.data = key;
			hd = Integer.MAX_VALUE;
			right = left = null;
		}
	}
	  public ArrayList <Integer> bottomView(Node root)
	    {
	        ArrayList<Integer> ans = new ArrayList<>();
	        
	        TreeMap<Integer,Integer> mp = new TreeMap<>();
	        Queue<Node> q = new LinkedList<Node>();
	        root.hd = 0;
	        q.add(root);
	        
	        while(!q.isEmpty()){
	            Node temp = q.remove();
	            int hd = temp.hd;
	            
	            mp.put(hd,temp.data);
	            
	            if(temp.left != null){
	                temp.left.hd = hd -1; 
	                q.add(temp.left);
	            }
	            if(temp.right != null){
	                temp.right.hd = hd + 1; 
	                 q.add(temp.right);
	            }
	        }
	        
	        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
	            ans.add(it.getValue());
	        }
	        
	        return ans;
	    }
}
