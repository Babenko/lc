package com.sbabenko.lc.t876;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {

        List<ListNode> list = new ArrayList<>();

        for (; head != null; head = head.next) {
            list.add(head);
        }
        return list.get(list.size() / 2);
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

}
