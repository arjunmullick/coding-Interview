package com.leetcode;

public class RemoveDuplicatesFromSortedList {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode start = new ListNode(-999);
            start.next = head;
            ListNode prev = start;
            while(head != null){
                if(prev.val == head.val){
                    prev.next = head.next;
                }else{//important
                    prev = head;
                }
                head = head.next;
            }
            return start.next;
        }
    }

    // * Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
