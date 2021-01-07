package com.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    //https://leetcode.com/problems/top-k-frequent-elements/
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int n : nums){
                map.put(n , map.getOrDefault(n,0)+1);
            }

            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b)->(map.get(a)- map.get(b)));
            for(int n : map.keySet()){
                minHeap.offer(n);
                if(minHeap.size() > k) minHeap.poll();
            }

            int result[] = new int[minHeap.size()];
            int i = k-1;
            while(minHeap.size() >0){
                result[i] = minHeap.poll();
                i--;
            }
            return result;
        }
    }
}
