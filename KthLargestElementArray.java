package com.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementArray {
    //https://leetcode.com/problems/kth-largest-element-in-an-array/

    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for(int n : nums){
                minHeap.offer(n);
                if(minHeap.size() > k) minHeap.poll();
            }
            return minHeap.peek();
        }
    }
}
