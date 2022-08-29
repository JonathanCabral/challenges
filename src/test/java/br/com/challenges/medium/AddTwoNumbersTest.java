package br.com.challenges.medium;

import br.com.challenges.aux.ListNode;
import br.com.challenges.medium.linkedlist.singly.AddTwoNumbers;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void teste1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    @Test
    public void teste2() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))) );

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    @Test
    public void teste3() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode listNode = addTwoNumbers.addTwoNumbersFasterSolution(l1, l2);
        System.out.println(listNode);
    }

}