package com.leetcode;

public class RotateList {

    //https://leetcode.com/problems/rotate-list/
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            //Loop all element to find size
            //join last to first to create a loop node,next = first
            //move n-k steps where k<n . if k>n move k%n
            if(head == null) return null;

            ListNode dummy = head;
            ListNode start = head;
            int n = 1;
            while(start.next != null){
                start = start.next;
                n++;
            }
            start.next = dummy;//create a loop

            //move n-k steps
            if(k >=n){
                k = k%n;
            }
            start = head;
            for(int i = 1 ; i < n-k ; i++){//start from 1 as we are alread on head
                start = start.next;
            }

            ListNode end = start;
            ListNode begin = start.next;
            end.next = null;
            return begin;
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
}
