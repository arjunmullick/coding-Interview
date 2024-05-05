package com.leetcode;

public class ReorderList {

    /**
    Input: head = [1,2,3,4,5]
    Output: [1,5,2,4,3]
    **/
    class Solution {

        //Find the middle of the list
        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;

            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode fast = dummy;
            ListNode slow = dummy;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            //reverse second half in place [1,2,3,4,5,6] -> [1,2,3,6,5,4]
            slow.next = reverseList(slow.next);

            // to end of first list swap items from second list
            ListNode p1=head;
            ListNode p2=slow.next;
            while(p1!=slow){
                slow.next=p2.next;
                p2.next=p1.next;
                p1.next=p2;
                p1=p2.next;
                p2=slow.next;
            }

        }

        //4->5->6 to  6->5->4
        //6->5->4->null and return 6
        public ListNode reverseList(ListNode start){
            ListNode node = start;
            ListNode prev = null;
            while(node != null){
                ListNode next = node.next;
                node.next = prev;
                prev = node;
                node = next;
            }
            return prev;
        }
    }

    /**
     * Definition for singly-linked list.
     */
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
