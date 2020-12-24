package com.leetcode;

public class SwapNodesInPairs {

    //https://leetcode.com/problems/swap-nodes-in-pairs/
    class Solution {
        //Tip : draw on paper

        /**
         [dummy -> 1 ->  2    ->3 ->4]
         [ prev  next   swap             ]


         [dummy -> 2 ->  1    ->3 ->4]
         [ prev  swap   next             ]

         [dummy -> 2 ->  1    ->3   ->4  -> null     ]
         [                   prev  next   swap      ]
         prev = next;
         next = prev.next;
         swap = next.next;
         **/
        public ListNode swapPairs(ListNode head) {
            if(head == null) return head;
            ListNode dummy = new ListNode();
            dummy.next = head;

            ListNode prev = dummy;
            ListNode next = dummy.next;
            ListNode swap = next.next;

            if(swap == null) return dummy.next;

            while(next.next != null){ // or swap != null
                prev.next = swap;
                next.next = swap.next;
                swap.next = next;

                prev = next;
                next = prev.next;
                if(next == null) break;
                swap = next.next;
            }

            return dummy.next;
        }
    }
    /**
     * Definition for singly-linked list
     */
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
