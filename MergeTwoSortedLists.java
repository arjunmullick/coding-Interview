package com.leetcode;

import java.util.PriorityQueue;

public class MergeTwoSortedLists {
    //https://leetcode.com/problems/merge-two-sorted-lists/
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null) return l2;
            if(l2 == null) return l1;

            ListNode result = new ListNode(0);
            ListNode p = result;

            PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b)->(a.val - b.val));//always be <= 2 so constant space.
            minHeap.offer(l1);
            minHeap.offer(l2);

            while(minHeap.size() >0){
                ListNode next = minHeap.poll();
                p.next = next;
                if(next.next != null)
                    minHeap.offer(next.next);
                p = p.next;
            }



            return result.next;

        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

