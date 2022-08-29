package br.com.challenges.medium;

import br.com.challenges.aux.ListNode;
import br.com.challenges.medium.linkedlist.singly.LinkedListCycle;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    public void teste() {
        ListNode four = new ListNode(-4, null);
        ListNode three = new ListNode(0, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(3, two);

        LinkedListCycle cycle = new LinkedListCycle();
        cycle.detectCycle(head);

    }

}