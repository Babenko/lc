package com.sbabenko.lc.t590;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NTreePostorderTraversalTest {

    @ParameterizedTest
    @MethodSource("tree")
    void postorder(NTreePostorderTraversal.Node rootNode, List<Integer> expected) {

        var postOrder = new NTreePostorderTraversal();
        var result = postOrder.postorder(rootNode);
        System.out.println(result);
        assertIterableEquals(expected, result);
    }


    private static Stream<Arguments> tree() {

        var grandChildNode1 = new NTreePostorderTraversal.Node(5, null);
        var grandChildNode2 = new NTreePostorderTraversal.Node(6, null);
        var childNode1 = new NTreePostorderTraversal.Node(3, List.of(grandChildNode1, grandChildNode2));
        var childNode2 = new NTreePostorderTraversal.Node(2, null);
        var childNode3 = new NTreePostorderTraversal.Node(4, null);
        var node = new NTreePostorderTraversal.Node(1, List.of(childNode1, childNode2, childNode3));

        var node1 = node();

        return Stream.of(
                Arguments.of(node, List.of(5, 6, 3, 2, 4, 1)),
                Arguments.of(node1, List.of(5, 0, 10, 6, 3, 1)));
    }

    private static NTreePostorderTraversal.Node node() {
        var grandChildNode1 = new NTreePostorderTraversal.Node(5, null);
        var grandChildNode2 = new NTreePostorderTraversal.Node(0, null);
        var childNode1 = new NTreePostorderTraversal.Node(10, List.of(grandChildNode1, grandChildNode2));
        var childNode2 = new NTreePostorderTraversal.Node(3, List.of(new NTreePostorderTraversal.Node(6, null)));
        return new NTreePostorderTraversal.Node(1, List.of(childNode1, childNode2));
    }
}