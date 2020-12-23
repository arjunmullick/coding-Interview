package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

    //https://leetcode.com/problems/pacific-atlantic-water-flow/
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] matrix) {
            List<List<Integer>> result = new ArrayList<>();
            int n = matrix.length;
            if(n == 0) return result;
            int m = matrix[0].length;
            if(m == 0) return result;
            //why not try memo like 0 not visited , 1 atlantic and 2 pacific .
            //Still need 2 dfs to find overalp and difficult to see if its visited by atlantic or pacific during dfs
            boolean [][] pacific = new boolean[n][m];
            boolean [][] atlantic = new boolean[n][m];

            //start from pacific side to see all hills that flow here
            //note: important to pass correct row and col value and height . as == height can visit its ok to pass height
            for(int i = 0 ; i < n ; i++){
                dfs(i,0,matrix[i][0],matrix,pacific);//first col
            }
            for(int i = 0 ; i < m ; i++){
                dfs(0,i,matrix[0][i],matrix,pacific);//first row
            }
            for(int i = 0 ; i < m ; i++){
                dfs(n-1,i,matrix[n-1][i],matrix,atlantic);//last row
            }
            for(int i = 0 ; i < n ; i++){
                dfs(i,m-1,matrix[i][m-1],matrix,atlantic);//last col
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    if(atlantic[i][j] && pacific[i][j]){
                        List<Integer> list = new ArrayList<>();
                        list.add(i);list.add(j);
                        result.add(list);
                    }
                }
            }
            return result;
        }

        public void dfs(int r , int c , int height, int[][] matrix, boolean[][] visited){
            if(r<0 || c<0 || r >= matrix.length || c >= matrix[0].length || visited[r][c]){
                return;
            }
            if(height > matrix[r][c]) return;//we will only go to higher or equal peak from ocean
            visited[r][c] = true;
            dfs(r+1,c,matrix[r][c],matrix,visited);
            dfs(r,c+1,matrix[r][c],matrix,visited);
            dfs(r-1,c,matrix[r][c],matrix,visited);
            dfs(r,c-1,matrix[r][c],matrix,visited);

        }
    }
}
