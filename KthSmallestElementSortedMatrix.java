package com.leetcode;

import java.util.PriorityQueue;

public class KthSmallestElementSortedMatrix {
    //https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

    //at a time minHeap will not exceed N/2. X < n/2
    //K(log X) where X is item in minHeap at a time.
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            if(matrix.length == 0 || matrix[0].length ==0) return 0;

            int n = matrix.length;
            int m = matrix[0].length;

            boolean[][] visited = new boolean[n][m];

            PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> (a.val - b.val));//min by val of coordinate
            minHeap.offer(new Node(0,0,matrix[0][0]));
            int count = 0;
            int result = -1;
            while(count != k){
                Node node = minHeap.poll();
                int r = node.r;
                int c = node.c;
                if(visited[r][c]) continue;//not factored as its already counted

                result = node.val;
                visited[r][c] = true;
                if(r<n-1){
                    minHeap.offer(new Node(r+1,c,matrix[r+1][c]));
                }
                if(c<m-1){
                    minHeap.offer(new Node(r,c+1,matrix[r][c+1]));
                }
                count++;
            }
            return result;

        }

        class Node{
            int r;
            int c;
            int val;
            public Node(int r , int c , int val){
                this.r = r;
                this.c = c;
                this.val = val;
            }
        }
    }
}
