package com.leetcode;

import java.util.Arrays;

public class MinimumNumberArrowsBurstBalloons {

    class Solution {

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
