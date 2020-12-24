package com.leetcode;

public class OddEvenLinkedList {

    // https://leetcode.com/problems/odd-even-linked-list/
    // here we are talking about the node number and not the value in the nodes.
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode list1 = head;//oad head
            ListNode list2 = head.next;//even head

            ListNode odd;
            ListNode even;
            odd = head;
            even = odd.next;

            while(odd != null && even != null){
                odd.next = even.next;
                if(odd.next == null) break;
                odd = odd.next;
                even.next = odd.next;
                if(even.next == null) break;
                even = even.next;
            }
            odd.next = list2;

            return head;//odd head
        }
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    //Compressed
    public class Solution2 {
        public ListNode oddEvenList(ListNode head) {
            if (head == null) return null;
            ListNode odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {//better check even and even.next as it comes always after odd
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }
}
