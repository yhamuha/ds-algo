package lc.bst.dfs.e1;

import lc.bst.TreeNode;

public class InvertBinaryTree {
    // O(n) O(n - for worst, log n - for balanced tree)
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void PreorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            PreorderTraversal(node.left);
            PreorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode invertedRoot = invertBinaryTree.invertTree(root);
        PreorderTraversal(invertedRoot);
    }
}

