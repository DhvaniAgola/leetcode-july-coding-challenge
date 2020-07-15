package day13_sameTree;

import java.util.ArrayList;
import java.util.List;

import day13_sameTree.Main.TreeNode;

public class CheckTrees {
	public List<Integer> lst = new ArrayList<>();
	public List<Integer> lst2 = new ArrayList<>();

	public boolean isSameTree(TreeNode p, TreeNode q) {
		preorder(p);
		lst2.addAll(lst);
		lst.clear();
		preorder(q);
		return lst.equals(lst2);
	}

	public void preorder(TreeNode root) {
		if (root != null) {
			lst.add(root.val);
			if (root.left != null)
				preorder(root.left);
			else
				lst.add(-1);
			if (root.right != null)
				preorder(root.right);
			else
				lst.add(-1);
		}
	}
}
