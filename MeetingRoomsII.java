package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...](si< ei), find the minimum number of conference rooms required.
**/
public class MeetingRoomsII {

    class Solution {

        /**

         |---------|
         |---------|

         |-------|
         |-----------|

         more than one overlap
         |-------|
         |---------------|
         |--------|

         |-------| - room 1
              |---------------| - room 2
                          |--------|  - this will free room 1 and heap size is 2 again

         **/

        public int minMeetingRooms(int[][] intervals) {
            if(intervals.length  <= 1) return intervals.length;  // 0 means no meeting room.

            Arrays.sort(intervals,(a,b)->(a[0] - b[0]));//sort them by start time
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(a[1] - b[1])); // minHeap by end time

            minHeap.offer(intervals[0]);//first room with min start time
            int n = intervals.length;
            for(int i = 1 ; i < n ; i++){
                int prev[] = minHeap.peek();//last event about to end or ended
                int next[] = intervals[i];//next upcoming event
                if(prev[1] <= next[0]){
                    // no overlap mean prev meeting ended and we have a free room for the 'next' interval
                    minHeap.poll();
                }
                //IMP : if room not free(poll) then we are increasing a count of room
                // to easily understand its just count++ but its same as items remaining in minHeap
                minHeap.offer(next);
            }

            return minHeap.size();

        }
    }
}
