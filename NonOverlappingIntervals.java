package com.leetcode;

import java.util.Arrays;

public class NonOverlappingIntervals {
    //https://leetcode.com/problems/non-overlapping-intervals/

    class Solution {

        /*
            Condition 1 :
            |------------|
                |------------|*
                remove one ending later

            Condition 2
            |------------|
                           |------------|
             no overlap no removal

            Condition 3
            |------------|
            |------------------|*
            remove one ending later


            Condition 4
            |------------|*
            |--------|
            remove one ending later

            Condition 5 - Multiple overlap again remove ending later in first overlap
            |------------|*
            |---|  |-------|
        */
        //Time O(NlogN) and O(1) space
        public int eraseOverlapIntervals(int[][] intervals) {

            //From above condition sorting intervals first helps reduce condition
            //if overlap remove the one whose end time is greater remove b when b[1] > a[1]
            // [1,2][2,3] are not overlappiing
            if(intervals.length <= 1) return 0;
            Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));//sort by start time

            int count = 0;
            int prev[] = intervals[0];
            for(int i = 1 ; i < intervals.length ; i++){
                int[] next  = intervals[i];
                if(next[0] >= prev[1]){//no overlap
                    prev = next;
                    continue;
                }
                //overlap and ignore ending later
                prev[1] = Math.min(prev[1],next[1]);
                count++;

            }
            return count;
        }
    }
}
