package com.leetcode;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    //https://leetcode.com/problems/k-closest-points-to-origin/
    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            int n = points.length;
            if(n<=K) return points;
            PriorityQueue<Node> maxHeap = new PriorityQueue<>((a, b)->(b.distance() - a.distance()));
            for(int[] p : points){
                maxHeap.offer(new Node(p[0],p[1]));
                if(maxHeap.size() > K)
                    maxHeap.poll();
            }

            int[][] result = new int[K][2];
            int i = K-1;//just for sorting , optional
            while(maxHeap.size() >0){
                Node node = maxHeap.poll();
                result[i][0] = node.x;
                result[i][1] = node.y;
                i--;
            }
            return result;

        }

        class Node{
            int x;
            int y;
            public Node(int x, int y){
                this.x = x;
                this.y = y;
            }

            public int distance(){
                return x*x + y*y;
            }
        }
    }

    class SolutionAlternative {
        public int[][] kClosest(int[][] points, int K) {
            if(K>points.length){
                return null;
            }
            PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>( (p1,p2) -> ((p2[0]*p2[0] + p2[1]*p2[1]) - (p1[0] * p1[0] + p1[1]*p1[1])) );
            for(int [] p : points){
                maxHeap.offer(p);
                if(maxHeap.size() > K){
                    maxHeap.poll();
                }
            }
            int[][] result = new int[K][2];
            int counter = 0;
            while(maxHeap.size() > 0){
                int[] p = (int[])maxHeap.poll();
                result[counter][0] = p[0];
                result[counter][1] = p[1];
                counter++;
            }
            return result;
        }
    }
}
