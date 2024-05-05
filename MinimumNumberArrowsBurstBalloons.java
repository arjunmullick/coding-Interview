package com.leetcode;

import java.util.Arrays;

public class MinimumNumberArrowsBurstBalloons {

 /*

    Sorting by start need backtracking as we may miss
       0 9,0 6,2 9,2 8,3 9,3 8,3 9,6 8,7 12,9 10

       0------------------------------------9
       0---------------6
        2--------------------------------9
        2-----------------------------8
            3----------------------------9
            3-------------------------8
            3----------------------------9
                    6-----------------8
                       7------------------------12
                                        9---10




    Sorting by end helps apply greedy approach to consume interval
            0-------------6
                    3----------8
                          6----8
                 2-------------8
                    3------------9
                 2---------------9
            0--------------------9
                    3------------9
                                 9--10
                            7------------12
        */

    class Solution {
    public int findMinArrowShots(int[][] points) {
        

        if(points == null || points.length == 0) return 0;
        Arrays.sort(points,(a, b)->(Integer.compare (a[1] , b[1])));// .compare because testcase has int maxValue

        //Arrays.sort(points,(a,b)->(a[1]-b[1]));
        int count = 1;
        int[] prev = points[0];
        for(int i = 1 ; i < points.length ; i++){
            int[] next = points[i];
            if(isOverlap(prev,next)){
                prev[0] = Math.max(prev[0],next[0]);
                prev[1] = Math.min(prev[1],next[1]);
            }else{
                count++;
                prev = next;
            }
 
        } 
        return count;

    }

    public boolean isOverlap(int[] a , int[] b){
        if((a[0] > b[1]) || (b[0] > a[1])) return false; // one is starting after other ends then no overlap
        return true;
    }
}

    

    class Solution2 {

       
        public int findMinArrowShots(int[][] points) {

            if(points.length <= 1) return points.length;

            //sort by end time
            Arrays.sort(points,(a, b)->(Integer.compare (a[1] , b[1])));// .compare because testcase has int maxValue

            int count = 1;
            int [] prev = points[0];
            for(int i = 0 ; i < points.length ; i++){
                int start = prev[0];
                int end = prev[1];
                int next[] = points[i];
                if(next[0] > prev[1] || next[1] < prev[0]){//no overlap
                    count++;
                    prev = next; // as next[1] is greater
                }
            }
            return count;
        }
    }
}


//Alternate sort by start time 

    public int findMinArrowShots(int[][] points) {
        if(points.length <= 1) return points.length;

            //sort by end time
            Arrays.sort(points,(a, b)->(Integer.compare (a[0] , b[0])));// .compare because testcase has int maxValue

            int count = 1;
            int [] prev = points[0];
            for(int i = 0 ; i < points.length ; i++){
                int start = prev[0];
                int end = prev[1];
                int next[] = points[i];
                if(next[0] > prev[1]){//no overlap
                    count++;
                    prev = next;
                }else{
                    prev[0] = Math.max(prev[0], points[i][0]);
                    prev[1] = Math.min(prev[1], points[i][1]);
                }
            }
            return count;
    }
}
