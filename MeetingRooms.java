package com.leetcode;

import java.util.PriorityQueue;

public class MeetingRooms {
    //https://leetcode.com/problems/meeting-rooms/
    class Solution {
        public boolean canAttendMeetings(int[][] intervals) {

            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b)->(a[0] - b[0]));

            for(int[] i : intervals){
                minHeap.offer(i);
            }
            int[] prev = new int[]{-1,-1};
            while(minHeap.size() >0){
                int next[] = minHeap.poll();
                //as sorted due to heap prev[0] <= next[0] always
                if(next[0] < prev[1] ) return false;
                prev = next;
            }

            return true;
        }
    }

/**

 |---------|
     |---------|

 |-------|
 |-----------|

 **/
}
