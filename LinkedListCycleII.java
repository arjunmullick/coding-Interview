package com.leetcode;

public class LinkedListCycleII {

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null || head.next == null) return null;

            ListNode fast = head.next.next;
            ListNode slow = head.next;

            while(fast != null && fast.next !=null && slow != fast){
                fast = fast.next.next;
                slow = slow.next;
            }

            if(slow != fast) return null;//not a cycle detected

            fast = head;//slow is intersect point for 2
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
         }
     }
}
