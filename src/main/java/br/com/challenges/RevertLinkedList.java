package br.com.challenges;

import br.com.challenges.aux.ListNode;

/**
 * @leetcode https://leetcode.com/problems/reverse-linked-list/submissions/
 * @author jonathan
 * @Date August, 23th 2022
 */
public class RevertLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode node = new ListNode(head.val, null);
        head = head.next;
        while(head != null) {
            node = new ListNode(head.val, node);
            head = head.next;
        }

        return node;
    }
}
