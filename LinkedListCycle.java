package com.leetcode;

public class LinkedListCycle {

    //https://leetcode.com/problems/linked-list-cycle/

    // * Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode fast = head.next;// remember this is important to not start at same location. As first condition would terminate
            ListNode slow = head;
            while(fast!=slow){
                if(fast == null || fast.next == null){
                    return false; // no loop
                }
                fast = fast.next.next;
                slow = slow.next;
            }
            return true;
        }
    }


}
