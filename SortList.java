package com.leetcode;

public class SortList {
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

    /**
     * Merge sort use bottom-up policy,
     * so Space Complexity is O(1)
     * Time Complexity is O(NlgN)
     * stable sort
     */

    class Solution {
        public ListNode sortList(ListNode head) {
            if(head == null){
                return head;
            }
            if(head.next == null){
                return head;
            }


            ListNode prev = null;//dummy init
            ListNode fast = head;
            ListNode slow = head;

            //split list in 2 equal parts
            while(fast!=null && fast.next!=null){
                prev = slow;//this node is one node behind slow at each step.
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;//break list at position before l2

            ListNode l1 = sortList(head); // list first
            ListNode l2= sortList(slow);//starting from middle
            return mergeLogN(l1,l2);
        }

        public ListNode mergeLogN(ListNode l1 , ListNode l2){
            ListNode dummy = new ListNode();
            ListNode result = dummy;
            while(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    dummy.next = l1;
                    l1 = l1.next;
                }else{
                    dummy.next = l2;
                    l2=l2.next;
                }

                dummy = dummy.next;
            }
            if(l2 != null){
                dummy.next = l2;
            }
            if(l1 != null){
                dummy.next = l1;
            }
            return result.next;
        }
    }
}
