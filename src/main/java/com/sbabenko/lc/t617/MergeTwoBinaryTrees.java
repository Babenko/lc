package com.sbabenko.lc.t617;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) {
            t1 = t2;
        }  else if (t2 != null) {
            t1.val += t2.val;
            merge(t1, t2);
        }
        return t1;
    }

    public void merge(TreeNode t1, TreeNode t2) {

        if(t1 != null && t2 != null) {
            if (t1.left != null && t2.left != null) {
                t1.left.val += t2.left.val;
                merge(t1.left, t2.left);
            }
            if (t1.left == null && t2.left != null) {
                t1.left = t2.left;
                merge(t1.left, null);
            }
            if (t1.right != null && t2.right != null) {
                t1.right.val += t2.right.val;
                merge(t1.right, t2.right);
            }
            if (t1.right == null && t2.right != null) {
                t1.right = t2.right;
                merge(t1.right, null);
            }
        }
    }


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

}
