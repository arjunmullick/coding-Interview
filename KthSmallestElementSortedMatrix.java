package com.leetcode;

import java.util.PriorityQueue;

public class KthSmallestElementSortedMatrix {
    //https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    /**
        Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
        Output: 13
        Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
    **/
    //at any time minHeap will not exceed N/2. X < n/2
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



/// Alternative Binary Search 

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n - 1][n - 1];

        while(left <= right){
            int mid = left + ((right - left) >> 1);

            if(check(mid, k , matrix, n)) // Check if we have more number before mid greater than K 
                right = mid - 1;
            else 
                left = mid + 1;
        }

        return left;
    }
    
    // Check if we have more number before mid greater than K 
    public boolean check(int mid, int k, int[][] arr, int n){
        int size = 0;
        int i = 0, j = n - 1; // start from top right . 

        while(i < n && j >=0){
            if(mid >= arr[i][j]){
                size += j+1; // all row is smaller than mid  
                i++;
            }else   j--;
        }

        return size >= k; 
    }
}
