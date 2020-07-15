package day13_sameTree;

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
		int input[] = { 6, 3, 7, 4, 5, 9, 1 };
		int input2[] = { 6, 3, 7, 4, 5, 9, 1 };
		TreeNode root = null;
		for (int i = 0; i < input.length; i++) {
			root = insert(root, input[i]);
		}
		TreeNode root2 = null;
		for (int i = 0; i < input2.length; i++) {
			root2 = insert(root2, input2[i]);
		}
		CheckTrees checkTrees = new CheckTrees();
		System.out.println(checkTrees.isSameTree(root, root2));
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
