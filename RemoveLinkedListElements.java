package com.leetcode;

public class RemoveLinkedListElements {

    //https://leetcode.com/problems/remove-linked-list-elements/

    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode start = new ListNode(0);
            start.next = head;
            ListNode prev = start;
            while(head!= null){
                if(head.val == val){
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
