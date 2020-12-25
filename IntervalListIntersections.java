package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class IntervalListIntersections {
    //https://leetcode.com/problems/interval-list-intersections/
    /*
    Condition 1 :
    |------------|
        |------------|
        |--------|

    Condition 2
    |------------|
                   |------------|
     no overlap

    Condition 3
    |------------|
    |------------------|
    |------------|

    Condition 4
    |------------|
    |--------|
    |--------|

    Condition 5 - Multiple overlap of second
    |------------|
    |---|  |-------|
*/

    //O(M+N) O(1) space
    class Solution {

        //O(M+N) O(1) space
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            int n = A.length;
            int m = B.length;
            if(n == 0) return A;
            if(m == 0) return B;

            int i=0; int j=0 ;
            List<int[]> result = new ArrayList<>();
            while(i<n && j<m){
                int[] a = A[i];
                int[] b = B[j];
                //if overlap
                if(isOverlap(a,b)){
                    int start = Math.max(a[0],b[0]);
                    int end = Math.min(a[1],b[1]);
                    result.add(new int[]{start,end});
                }
                //done incrreas  the one ending later
                if (a[1] < b[1]) {
                    i++;
                } else {
                    j++;
                }
            }

            int[][] resarr = new int [result.size()][2];
            for( i = 0 ; i < result.size() ; i++){
                resarr[i] = result.get(i);
            }

            return resarr;
        }

        public boolean isOverlap(int[] a , int [] b){

            if (a[0] > b[1] || b[0] > a[1]) return false;//condition 1 to 5

            return true;
        }
    }

    //Time O(MlogM + NlogN) Memory O(M+N)
    class SolutionMinHeap {
        //    After adding all in minHeap with startTime sorted

        public int[][] intervalIntersection(int[][] A, int[][] B) {
            if(A.length == 0) return A;//empty
            if(B.length == 0) return B;//empty
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
            for(int[] a : A){
                minHeap.offer(a);
            }
            for(int[] b : B){
                minHeap.offer(b);
            }

            List<int[]> resultList = new ArrayList<>();
            int prev[] = minHeap.poll();
            while(minHeap.size() > 0){
                int[] next = minHeap.poll();
                //find intersect only if it overlaps. Store overlap intersection
                if(next[0] <= prev[1]){
                    int[] r = new int [2];
                    r[0] = Math.max(next[0],prev[0]);
                    r[1] = Math.min(next[1],prev[1]);
                    resultList.add(r);
                }
                // due to condition 5
                if(prev[1] >= next[1]){
                    continue;//stay previous as is
                }
                prev = next;
            }

            int[][] result = new int [resultList.size()][2];
            for(int i = 0 ; i < resultList.size() ; i++){
                result[i] = resultList.get(i);
            }
            return result;
        }
    }
}
