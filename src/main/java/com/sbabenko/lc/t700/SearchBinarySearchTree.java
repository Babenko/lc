package com.sbabenko.lc.t700;

public class SearchBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root.val == val) {
            return root;
        }

        TreeNode leftNode;
        if (root.left != null && (leftNode = searchBST(root.left, val)) != null) {
            return leftNode;
        }

        TreeNode rightNode;
        if (root.right != null && (rightNode = searchBST(root.right, val)) != null) {
            return rightNode;
        }

        return null;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
