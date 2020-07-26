package day22_binaryTreeZigzagLevelOrderTraversal;

import java.util.List;

public class Main {
	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 6, 3, 7, 4, 5, 9, 1, 8 };
		TreeNode root = null;
		for (int i = 0; i < input.length; i++) {
			root = insert(root, input[i]);
		}

		ZigzagLevelOrserTraversal zigzagLevelOrserTraversal = new ZigzagLevelOrserTraversal();
		List<List<Integer>> output = zigzagLevelOrserTraversal.zigzagLevelOrder(root);
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < output.get(i).size(); j++) {
				System.out.print(output.get(i).get(j) + ", ");
			}
			System.out.println();
		}
	}

	private static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data, null, null);
		} else {
			TreeNode cur;
			if (data <= root.val) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
}
