package br.com.challenges.easy.linkedlist.singly;

import br.com.challenges.aux.ListNode;

/**
 * @leetcode https://leetcode.com/problems/roman-to-integer/ (Roman numbers to int)
 * @author jonathan
 * @Date August, 23th 2022
 */
public class MergeTwoSortedLinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy.next;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
        }

        if(l1 != null)
            head = l1.next;
        else head = l2.next;

        return head.next;
    }

}

