package com.leetcode;

public class AddTwoNumbers {
    //Definition for singly-linked list
    //https://leetcode.com/problems/add-two-numbers/
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode result = new ListNode();//dummy head
            ListNode dummy = result;
            int rem = 0;
            while(l1 != null && l2 != null){
                int val = l1.val + l2.val + rem;
                rem = 0;//reset after add
                ListNode next = new ListNode();
                if(val <=9){
                    next.val = val;
                    result.next = next;
                }else{
                    next.val = val%10;
                    rem = 1;
                    result.next = next;
                }
                l1 = l1.next;
                l2 = l2.next;
                result = result.next;
            }

            while(l1 != null){
                int val = l1.val + rem;
                rem = 0;
                ListNode next = new ListNode();
                if(val <=9){
                    next.val = val;
                    result.next = next;
                }else{
                    next.val = val%10;
                    rem = 1;
                    result.next = next;
                }
                l1 = l1.next;
                result = result.next;
            }

            while(l2 != null){
                int val = l2.val + rem;
                rem = 0;
                ListNode next = new ListNode();
                if(val <=9){
                    next.val = val;
                    result.next = next;
                }else{
                    next.val = val%10;
                    rem = 1;
                    result.next = next;
                }
                l2 = l2.next;
                result = result.next;
            }

            if(rem > 0){
                int val = rem;
                rem = 0;
                ListNode next = new ListNode();
                next.val = val;
                result.next = next;
                result = result.next;
            }

            return dummy.next;
        }
    }


    // Alternate - Compress
    class Solution2 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(-1);
            ListNode start = temp;
            int carry = 0;
            while(l1 != null && l2 != null){
                int sum = l1.val + l2.val + carry;
                carry = sum/10;
                int val = sum%10;
                ListNode next = new ListNode(val);
                //System.out.println(sum +" "+val+" "+carry);
                temp.next = next;
                temp = temp.next;
                l1 = l1.next;
                l2 = l2.next;
            }

            if(l1 == null){
                l1 = l2;
            }

            while(l1 != null){
                int val = l1.val + carry;
                carry = val/10;
                l1 = l1.next;
                temp.next = new ListNode(val%10);
                temp = temp.next;
            }

            if(carry > 0 ){
                temp.next = new ListNode(carry);
            }

            return start.next;
        }
    }
}


