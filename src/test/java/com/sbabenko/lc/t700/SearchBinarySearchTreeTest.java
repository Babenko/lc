package com.sbabenko.lc.t700;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchBinarySearchTreeTest {

    @ParameterizedTest
    @MethodSource("tree")
    void searchBST(SearchBinarySearchTree.TreeNode root, int value, SearchBinarySearchTree.TreeNode expected) {

        var searchTree = new SearchBinarySearchTree();

        var result = searchTree.searchBST(root, value);

        assertSame(expected, result);
    }

    private static Stream<Arguments> tree() {

        var root = new SearchBinarySearchTree.TreeNode(4);
        var leftPart = new SearchBinarySearchTree.TreeNode(2);
        leftPart.left = new SearchBinarySearchTree.TreeNode(1);
        leftPart.right = new SearchBinarySearchTree.TreeNode(3);
        root.left = leftPart;
        root.right = new SearchBinarySearchTree.TreeNode(7);

        var root2 = new SearchBinarySearchTree.TreeNode(18);
        var leftPart2 = new SearchBinarySearchTree.TreeNode(2);
        var rightPart2 = new SearchBinarySearchTree.TreeNode(22);
        var innerRightPart2 = new SearchBinarySearchTree.TreeNode(63);
        root2.right = rightPart2;
        root2.left = leftPart2;
        rightPart2.right = innerRightPart2;
        innerRightPart2.right = new SearchBinarySearchTree.TreeNode(84);

        return Stream.of(Arguments.of(root, 2, leftPart),
                Arguments.of(root2, 63, innerRightPart2));
    }
}