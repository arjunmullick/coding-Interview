package com.leetcode;

import java.util.HashSet;

public class SetMatrixZeroes {
    //https://leetcode.com/problems/set-matrix-zeroes/
    class Solution {

        //constant space
        //note -inf <= matrix[i][j] <= inf so not dfs
        public void setZeroes(int[][] matrix) {
            int n = matrix.length;
            if(n == 0) return;
            int m = matrix[0].length;
            if(m == 0) return;

            //first row and first col have same location so we use flag : example [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
            boolean isCol = false;
            boolean isRow = false;

            //set if first row need to be zero
            for(int i = 0 ; i < n ;i++){
                if(matrix[i][0] == 0){
                    isRow = true;
                    break;
                }
            }

            //set if first col need to be zero
            for(int j = 0 ; j < m ; j++){
                if(matrix[0][j] == 0){
                    isCol = true;
                    break;
                }
            }

            //process calculation expect first row and col
            for(int i = 1 ; i < n ;i++){
                for(int j = 1 ; j < m ; j++){
                    if(matrix[i][j] == 0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            //now process all except first row and col
            for(int i = 1 ; i < n ;i++){
                for(int j = 1 ; j < m ; j++){
                    if(matrix[i][0] == 0 ||matrix[0][j] ==0 ){
                        matrix[i][j] = 0;
                    }
                }
            }

            //check if first row need to be zeroed [0,n)
            if(isRow){
                for(int i = 0 ; i < n ;i++){
                    matrix[i][0] = 0;
                }
            }

            //check if first col need to be zeroed [0,m)
            if(isCol){
                for(int j = 0 ; j < m ; j++){
                    matrix[0][j] = 0;
                }
            }
        }
    }
}

//Alternate O(m+n) space and O(mn) time
    /**
        public void setZeroes(int[][] matrix) {
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();
            int n = matrix.length;
            if(n == 0) return;
            int m = matrix[0].length;
            if(m == 0) return;
            for(int i = 0 ; i < n ;i++){
                for(int j = 0 ; j < m ; j++){
                    if(matrix[i][j] == 0){
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }

            for(int i = 0 ; i < n ;i++){
                for(int j = 0 ; j < m ; j++){
                    if(rows.contains(i) || cols.contains(j)){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
     **/

