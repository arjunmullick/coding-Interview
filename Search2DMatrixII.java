package com.leetcode;

public class Search2DMatrixII {

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix == null  || matrix.length == 0 || matrix[0].length == 0) return false;
            int n = matrix.length;
            int m = matrix[0].length;
            int r = 0 ; int c = m-1;
            while(r < n && c < m && c >=0){
                int val = matrix[r][c];
                if(val == target)
                    return true;
                if(val > target){
                    c--;
                }else{
                    r++;
                }
            }
            return false;
        }
    }
}
