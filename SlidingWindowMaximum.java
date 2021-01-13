package com.leetcode;

import java.util.LinkedList;

public class SlidingWindowMaximum {

    //https://leetcode.com/problems/sliding-window-maximum/
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;

            if(n == 0) return nums;

            int[] result = new int[n-k+1];

            LinkedList<Integer> queue = new LinkedList<>();
            for(int i = 0 ; i < n ; i++){
                if(queue.size() > 0 && i-k+1 > queue.peek()){ // or  [i - queue.peek + 1 > k] // make sure window size = k
                    queue.poll();
                }
                // find max in window
                while (queue.size() > 0 && nums[i] >= nums[queue.peekLast()]) queue.pollLast(); // delete smaller value than current

                queue.offer(i);
                if(i-k+1 >= 0){
                    result[i-k+1] = nums[queue.peek()];
                }
            }

            return result;
        }
    }
}
