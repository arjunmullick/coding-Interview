package com.leetcode;

public class WordSearch {
    //https://leetcode.com/problems/word-search/

    class Solution {
        boolean seen[][];
        public boolean exist(char[][] board, String word) {
            if(board == null || board.length == 0 || board[0].length == 0) return false;
            seen= new boolean[board.length][board[0].length];
            for(int i = 0 ; i < board.length ; i++){
                for(int j = 0 ; j < board[0].length ; j++){
                    char ch = board[i][j];
                    if(word.charAt(0) == ch && dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean dfs(char[][] board , String word , int x , int y , int pos){

            if(pos == word.length()) return true;

            if(x < 0 || y < 0 || x >= board.length || y >= board[0].length || pos > word.length() || seen[x][y] || board[x][y] != word.charAt(pos))
                return false;


            seen[x][y] = true;

            if(dfs(board,word,x+1,y,pos+1) ||
                    dfs(board,word,x,y+1,pos+1) ||
                    dfs(board,word,x-1,y,pos+1) ||
                    dfs(board,word,x,y-1,pos+1)
            ){
                return true;
            }

            seen[x][y] = false;
            return false;

        }
    }
}

/*
class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        if(n == 0) return false;
        int m = board[0].length;
        if(m == 0) return false;

        if(word == null || word.length() == 0) return false;

        boolean [][] visited = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                char ch = board[i][j];
                if(ch == word.charAt(0)){
                    if(dfs(board,i,j,0,word,visited)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board , int r , int c , int pos , String word , boolean[][] visited){

        int n = board.length;
        int m = board[0].length;


        if(r < 0 || c < 0 || r >= n || c >= m)
            return false;

        if(visited[r][c]) return false;

        visited[r][c] = true;
        char ch = board[r][c];

        if(ch != word.charAt(pos)){
            visited[r][c] = false;
            return false;
        }


        pos++;

        if(pos == word.length()){
            visited[r][c] = false;
            return true;
        }


        boolean result =  dfs(board,r+1,c,pos,word,visited) ||
                dfs(board,r,c+1,pos,word,visited) ||
                dfs(board,r-1,c,pos,word,visited) ||
                dfs(board,r,c-1,pos,word,visited);

        visited[r][c] = false;//unmark once branch is over
        return result;
    }
}
*/
