package com.leetcode;

public class Search2DMatrix {

    class Solution {
        //https://leetcode.com/problems/search-a-2d-matrix/
        //O(N+M) Time and O(1) space
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            if(n == 0) return false;
            int m = matrix[0].length;
            if(m == 0) return false;

            int r = 0;
            int c = m-1;

            while(c>=0 && r<=n-1){
                if(matrix[r][c] == target) return true;
                if(target < matrix[r][c]){
                    c--;
                }else{
                    r++;
                }
            }
            return false;
        }
    }
}
