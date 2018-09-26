package com.sbabenko.lc.t590;

import java.util.*;

public class NTreePostorderTraversal {

    private final LinkedList<Integer> list = new LinkedList<>();

    public List<Integer> postorder(Node root) {

        if (root != null) {
            list.add(root.val);
            if (root.children != null) {
                order(root.children);
            }
        }

        return list;
    }

    private void order(List<Node> root) {

        for (int i = root.size() - 1; i >= 0; i--) {
            Node node = root.get(i);
            list.addFirst(node.val);
            if (node.children != null) {
                order(node.children);
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
