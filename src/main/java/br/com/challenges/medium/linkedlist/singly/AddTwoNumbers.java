package br.com.challenges.medium.linkedlist.singly;

import br.com.challenges.aux.ListNode;

/**
 * @leetcode 2. Add Two Numbers
 * @Date August, 27th 22
 * @see "https://leetcode.com/problems/add-two-numbers/"
 */
public class AddTwoNumbers {

    /**
     * @TimeComplexity = O(n) we pass through each value just once
     * @MemoryComplexity =  O(n)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int aux = 0; //O(1)
        ListNode result = new ListNode(); //O(1)
        ListNode head = result; //O(1)

        while(l1 != null && l2 != null) { //O(n)
            int sum = l1.val + l2.val + aux; //O(n)
            aux=0; //O(n)
            if(sum >= 10) { //O(n)
                sum = sum - 10; //O(n)
                aux++; //O(n)
            }
            result.next = new ListNode(sum, null); //O(n)


            l1 = l1.next; //O(n)
            l2 = l2.next; //O(n)
            result = result.next; //O(n)
        }

        while (l1 != null) { //O(n)
            int sum = l1.val +  aux;//O(n)
            aux=0;//O(n)
            if(sum >= 10) {//O(n)
                sum = sum - 10;//O(n)
                aux++;//O(n)
            }
            result.next = new ListNode(sum, null);//O(n)
            l1 = l1.next;//O(n)
            result = result.next;//O(n)
        }

        while (l2 != null) {//O(n)
            int sum = l2.val +  aux;//O(n)
            aux=0;//O(n)
            if(sum >= 10) {//O(n)
                sum = sum - 10;//O(n)
                aux++;//O(n)
            }
            result.next = new ListNode(sum, null);//O(n)
            l2 = l2.next;//O(n)
            result = result.next;//O(n)
        }

        if(aux == 1) result.next = new ListNode(1, null);//O(1)

        return head.next;
    }

    public ListNode addTwoNumbersFasterSolution(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode  dummy= head;

        int reserve = 0;
        //while one of the listnodes are != then null
        while (l1 != null || l2 != null) {

            //if one node ends before the other,
            //we can assume the value for the null as 0.
            //So this while loops runs through all values from l1 and l2.
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            //sum l1 + l2 + reserve that is setted when a number is over 9
            int sum = l1_val + l2_val + reserve;
            //9 + 9 = 18 / 10 = 1 (our reserve to be used on the next iteration
            reserve = sum / 10;
            //9 + 9 = 18 % 10 = 8. Rest of the division of 18 by 10
            int lastDigit = sum % 10;

            //create a new ListNode with the last digit 8
            dummy.next = new ListNode(lastDigit);
            dummy = dummy.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(reserve > 0) dummy.next = new ListNode(reserve);

        return head.next;
    }

}
