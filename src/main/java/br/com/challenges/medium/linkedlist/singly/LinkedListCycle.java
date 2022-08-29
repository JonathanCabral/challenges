package br.com.challenges.medium.linkedlist.singly;

import br.com.challenges.aux.ListNode;

/**
 * @hackerrank https://leetcode.com/problems/linked-list-cycle-ii/ (142. Linked List Cycle II)
 * @author jonathan
 * @Date August, 25th 2022
 */
public class LinkedListCycle {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}
