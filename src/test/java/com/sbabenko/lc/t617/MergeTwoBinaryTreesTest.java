package com.sbabenko.lc.t617;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {

    @ParameterizedTest
    @MethodSource("trees")
    void mergeTrees(MergeTwoBinaryTrees.TreeNode n1, MergeTwoBinaryTrees.TreeNode n2, MergeTwoBinaryTrees.TreeNode expected) {

        var mergeBinary = new MergeTwoBinaryTrees();

        var result = mergeBinary.mergeTrees(n1, n2);

        assertTree(result, expected);
    }

    void assertTree(MergeTwoBinaryTrees.TreeNode n1, MergeTwoBinaryTrees.TreeNode n2) {

        assertEquals(n1.val, n2.val);

        if(n1.left != null && n2.left != null) {
            assertTree(n1.left, n2.left);
        }
        if(n1.right != null && n2.right != null) {
            assertTree(n1.right, n2.right);
        }

    }

    private static Stream<Arguments> trees() {
        var node1 = new MergeTwoBinaryTrees.TreeNode(1);
        var n1Left = new MergeTwoBinaryTrees.TreeNode(3);
        n1Left.left = new MergeTwoBinaryTrees.TreeNode(5);
        node1.left = n1Left;
        node1.right = new MergeTwoBinaryTrees.TreeNode(2);

        var node2 = new MergeTwoBinaryTrees.TreeNode(2);
        var node2Left = new MergeTwoBinaryTrees.TreeNode(1);
        node2Left.right = new MergeTwoBinaryTrees.TreeNode(4);
        node2.left = node2Left;
        var node2Right = new MergeTwoBinaryTrees.TreeNode(3);
        node2Right.right = new MergeTwoBinaryTrees.TreeNode(7);
        node2.right = node2Right;

        var merged = new MergeTwoBinaryTrees.TreeNode(3);
        var leftMerged = new MergeTwoBinaryTrees.TreeNode(4);
        leftMerged.left = new MergeTwoBinaryTrees.TreeNode(5);
        leftMerged.right = new MergeTwoBinaryTrees.TreeNode(4);
        merged.left = leftMerged;
        var mergedRight = new MergeTwoBinaryTrees.TreeNode(5);
        mergedRight.right = new MergeTwoBinaryTrees.TreeNode(7);
        merged.right = mergedRight;

        return Stream.of(Arguments.of(node1, node2, merged), Arguments.of(null, new MergeTwoBinaryTrees.TreeNode(1), new MergeTwoBinaryTrees.TreeNode(1)));
    }
}