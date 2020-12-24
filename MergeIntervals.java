package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeIntervals {
    //https://leetcode.com/problems/merge-intervals/
    class Solution {
        public int[][] merge(int[][] intervals) {
            if(intervals == null || intervals.length <= 1) return intervals;

            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));//compare and sort by start time

            for(int[]interval : intervals){
                minHeap.offer(interval);
            }

            List<int[]> merged = new ArrayList<>();
            int[] prev = minHeap.poll();
            while(minHeap.size() > 0){
                int[] interval = minHeap.poll();
                if(interval[0] <= prev[1]){ // condition 1,3,4 is merge needed
                    // change to prev[0] is redundant as prev[0] <= interval[0]
                    prev[1] = Math.max(prev[1] , interval[1]);
                }else{
                    merged.add(prev);
                    prev = interval;
                }
            }
            merged.add(prev);

            int[][] result = new int[merged.size()][2];
            for(int i = 0 ; i <  merged.size() ; i++){
                result[i] = merged.get(i);
            }

            return result;
        }
    }

    /*
    After adding all in minHeap with startTime sorted
    Condition 1 :
    |------------|
        |------------|

    Condition 2
    |------------|
                   |------------|

    Condition 3
    |------------|
    |------------------|

    Condition 4
    |------------|
    |--------|
    */

    //Alternate iterative
    class Solution2 {
        public int[][] merge(int[][] intervals) {
            if(intervals == null || intervals.length == 0 || intervals[0].length <= 1){
                return intervals;
            }

            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0]-b[0]));

            for(int [] i : intervals){
                minHeap.offer(i);
            }

            List<int[]> resultList = new ArrayList<>();
            int[] prev = minHeap.poll();
            while(minHeap.size() > 0){
                int [] next = minHeap.poll();
                if(prev[1] >= next[0]){
                    //if overlap then merge
                    next[0] = Math.min(prev[0],next[0]);
                    next[1] = Math.max(prev[1],next[1]);
                }else{
                    resultList.add(prev);
                }
                prev = next;
            }
            resultList.add(prev);
            int result[][] = new int [resultList.size()][2];
            for(int i = 0 ; i <resultList.size() ; i++){
                result[i]  = resultList.get(i);
            }
            return result;
        }
    }
}
