package br.com.challenges.easy;

import br.com.challenges.aux.ListNode;

/**
 * @leetcode https://leetcode.com/problems/middle-of-the-linked-list/submissions// (876. Middle of the Linked List)
 * @author jonathan
 * @Date August, 24th 2022
 */
public class MiddleOfSinglyLinkedList {

    class Solution {
        public ListNode middleNode(ListNode head) {
            int aux = 0;
            int middle = 0;
            ListNode h = new ListNode();
            h = head;

            while(head != null) {
                aux++;
                head = head.next;
            }

            middle = (aux/2);
            aux=0;

            while(aux < middle && h != null) {
                h = h.next;
                aux++;
            }


            return h;
        }
    }

}
