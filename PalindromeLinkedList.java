package com.leetcode;

public class PalindromeLinkedList {

    //https://leetcode.com/problems/palindrome-linked-list/

    // * Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    //reverse while moving fast/slow pointer and then compare
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                ListNode next = slow.next;
                slow.next = prev;
                prev = slow;
                slow = next;
            }
            //odd
            if(fast != null){
                return isEqual(prev, slow.next);
            }else{
                return isEqual(prev, slow);
            }


        }

        public boolean isEqual(ListNode p1 , ListNode p2){
            while(p1 != null && p2 != null){
                if(p1.val != p2.val) return false;
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
        }
    }

    //Alternate way / reverse
    class Solution2 {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode secondHalf;//start of second
            //odd
            if(fast != null){
                secondHalf = slow.next;
            }else{
                secondHalf = slow;
            }


            ListNode p2 = reverseList(secondHalf);


            ListNode p1 = head;
            while(p2 != null){
                if(p1.val != p2.val) return false;
                p1 = p1.next;
                p2 = p2.next;
            }


            return true;
        }

        public ListNode reverseList(ListNode head){
            ListNode p = head;
            ListNode prev = null;
            while(p != null){
                ListNode next = p.next;
                p.next = prev;
                prev = p;
                p = next;
            }
            return prev;
        }
    }
}
