package com.sbabenko.lc.t559;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumDepthNTree {

    private Set<Integer> depth = new HashSet<>();

    public int maxDepth(Node root) {

        if (root != null) {
            depth.add(1);
            if (root.children != null) {
                treeWalker(root, 0);
            }
        }
        return depth.stream().mapToInt(i -> i).max().orElse(0);
    }

    private void treeWalker(Node node, int level) {

        depth.add(level + 1);
        if (node.children != null) {
            for (int i = node.children.size() - 1; i >= 0; i--) {
                treeWalker(node.children.get(i), level + 1);
            }
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

}
