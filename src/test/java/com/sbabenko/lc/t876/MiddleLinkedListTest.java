package com.sbabenko.lc.t876;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MiddleLinkedListTest {

    @ParameterizedTest
    @MethodSource("nodes")
    void middleNode(MiddleLinkedList.ListNode head, MiddleLinkedList.ListNode expected) {

        var middleLinkedList = new MiddleLinkedList();

        var result = middleLinkedList.middleNode(head);

        assertEquals(expected, result);

    }

    private static Stream<Arguments> nodes() {
        var node = new MiddleLinkedList.ListNode(2);
        var expected = new MiddleLinkedList.ListNode(4);
        node.next = new MiddleLinkedList.ListNode(3);
        node.next.next = expected;
        expected.next = new MiddleLinkedList.ListNode(5);
        expected.next.next = new MiddleLinkedList.ListNode(6);
        var first = new MiddleLinkedList.ListNode(1);
        first.next = node;
        return Stream.of(
                Arguments.of(node, expected),
                Arguments.of(first, expected));
    }
}