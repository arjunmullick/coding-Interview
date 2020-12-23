package com.leetcode;

public class NumberofIslands {

    class Solution {
        //https://leetcode.com/problems/number-of-islands/
        //dfs = sink island
        public int numIslands(char[][] grid) {
            int count = 0;
            for(int i = 0 ; i < grid.length ; i++){
                for(int j = 0 ; j < grid[0].length ; j++){
                    if(grid[i][j] == '1'){
                        dfs(i,j,grid);
                        count ++;
                    }
                }
            }
            return count;
        }

        public void dfs(int x , int y , char[][] grid){
            if(x >= grid.length || y >= grid[0].length || x < 0 || y < 0) return;
            if(grid[x][y] == '0') return;
            grid[x][y] = '0';
            dfs(x-1,y,grid);
            dfs(x,y-1,grid);
            dfs(x+1,y,grid);
            dfs(x,y+1,grid);
        }
    }
}
