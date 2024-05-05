package com.leetcode;

public class ReverseLinkedListII {


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
    //https://leetcode.com/problems/reverse-linked-list-ii/
    /**
    Example 1:

        Input: head = [1,2,3,4,5], left = 2, right = 4
        Output: [1,4,3,2,5]
    **/
    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode ptr = dummy;
            for(int i = 1 ; i < m ; i++){
                ptr = ptr.next;
            }
            ListNode prev = ptr;// at 1
            ListNode ptr2 = ptr.next;//at 2
            ListNode end = ptr2; // at 2
            //reverse next m to n in place
            // 1->2->3->4->5-null
            //1 ->4->3->2->
            for(int i = m ; i <=n; i++){
                ListNode temp = ptr2.next;
                ptr2.next = prev;
                prev = ptr2;
                ptr2 = temp;
            }
            //prev = 4
            //ptr2 = 5
            ptr.next = prev;
            end.next = ptr2;
            return dummy.next;
        }
    }
}
