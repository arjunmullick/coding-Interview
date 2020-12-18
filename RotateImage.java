package com.leetcode;

public class RotateImage {

    //https://leetcode.com/problems/rotate-image/
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            if(n == 0) return;

            //Transpose
            for(int i = 0 ; i < n;i++){
                for(int j = i ; j < n ; j++){ // j = 1 important
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            //reverse every row in place
            for(int i = 0 ; i < n;i++){
                for(int j = 0 ; j < n/2 ; j++){// j< n/2 not =n/2
                    int temp =  matrix[i][j];
                    matrix[i][j] = matrix[i][n-1 -j];
                    matrix[i][n-1 -j] = temp;
                }
            }
        }
    }
}
