package com.binarytree;

import java.util.*;

public class InorderTraversal {

	public class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.data = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.data = val;
			this.left = left;
			this.right = right;
		}
	}

	public static List<Integer> getInOrderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		if (root == null) {
			return ans;
		}

		inOrderTraversal(root, ans);
		return ans;
	}

	public static void inOrderTraversal(TreeNode root, List<Integer> ans) {
		if (root.left == null && root.right == null) {
			ans.add(root.data);
			return;
		}
		if (root.left != null) {
			inOrderTraversal(root.left, ans);
		}

		ans.add(root.data);
		if (root.right != null) {
			inOrderTraversal(root.right, ans);
		}
	}
}
