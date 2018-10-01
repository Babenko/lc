package com.sbabenko.lc.t559;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthNTreeTest {

    @ParameterizedTest
    @MethodSource("tree")
    void maxDepth(MaximumDepthNTree.Node node, int expected) {

        var depthDetector = new MaximumDepthNTree();
        var result = depthDetector.maxDepth(node);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> tree() {

        var secondLevelNode1 = new MaximumDepthNTree.Node(3, List.of(new MaximumDepthNTree.Node(5, null), new MaximumDepthNTree.Node(6, null)));
        var node = new MaximumDepthNTree.Node(1, List.of(secondLevelNode1, new MaximumDepthNTree.Node(2, null), new MaximumDepthNTree.Node(4, null)));

        return Stream.of(Arguments.of(node, 3));
    }
}