package day22_binaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import day22_binaryTreeZigzagLevelOrderTraversal.Main.TreeNode;

/**
 * Your runtime beats 100.00 % of java submissions. Your memory usage beats
 * 83.14% of java submissions.
 * 
 * @author dhvaniagola
 * @since 25-07-2020
 */
public class ZigzagLevelOrserTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> output = new ArrayList<>();
		if (root != null) {
			List<Integer> lstInt = new ArrayList<>();
			List<TreeNode> lstNode = new ArrayList<>();
			lstNode.add(root);
			lstInt.add(root.val);
			output.add(lstInt);
			lstInt = new ArrayList<>();

			int i = lstNode.size() > 0 ? 0 : -1;
			int j = lstNode.size() - 1;
			boolean leftToRight = false;
			int k = j;
			while (i < lstNode.size()) {
				if (i > j) {
					if (leftToRight)
						leftToRight = false;
					else
						leftToRight = true;
					k = j;
					j = lstNode.size() - 1;
					output.add(lstInt);
					lstInt = new ArrayList<>();
				}
				if (leftToRight) {
					if (j == k) {
						addLeftToRight(lstNode.get(i), lstNode, lstInt);
					} else {
						for (int m = j; m > k; m--) {
							addLeftToRight(lstNode.get(m), lstNode, lstInt);
						}
					}
					i = j;
				} else {
					if (j == k) {
						addRightToLeft(lstNode.get(i), lstNode, lstInt);

					} else {
						for (int m = j; m > k; m--) {
							addRightToLeft(lstNode.get(m), lstNode, lstInt);

						}
					}
					i = j;
				}
				i++;
			}
		}
		return output;
	}

	private void addRightToLeft(TreeNode treeNode, List<TreeNode> lstNode, List<Integer> lstInt) {
		if (treeNode.right != null) {
			lstNode.add(treeNode.right);
			lstInt.add(treeNode.right.val);
		}
		if (treeNode.left != null) {
			lstNode.add(treeNode.left);
			lstInt.add(treeNode.left.val);
		}
	}

	private void addLeftToRight(TreeNode treeNode, List<TreeNode> lstNode, List<Integer> lstInt) {
		if (treeNode.left != null) {
			lstNode.add(treeNode.left);
			lstInt.add(treeNode.left.val);
		}
		if (treeNode.right != null) {
			lstNode.add(treeNode.right);
			lstInt.add(treeNode.right.val);
		}
	}
}
