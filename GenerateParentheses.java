package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /**
        Example 1:
            
            Input: n = 3
            Output: ["((()))","(()())","(())()","()(())","()()()"]
            Example 2:
            
            Input: n = 1
            Output: ["()"]

    **/
    //https://leetcode.com/problems/generate-parentheses/
    // String is not passed as reference so no need to backtrack . Branch can end
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack(0,0,"",n,result);
            return result;
        }

        public void backtrack(int open , int close , String s,  int n , List<String> result){
            if(close > open) return;
            if(open > n) return;
            if(open > 0 && open == close && open == n){
                result.add(s);
            }

            backtrack(open+1 , close , s + '(' , n , result);
            backtrack(open , close+1 , s + ')' , n , result);
        }
    }
}

/*
// Alternate
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n <= 0){
            return result;
        }
        generateParenthesis("", n , 0 , 0 , result);
        //Collections.sort(result);//only to match
        return result;
    }


    public void generateParenthesis(String subString , int n ,int open , int close ,  List<String> result) {
        if(subString.length() == 2*n){
            result.add(subString);
            return;
        }
        if(subString.length() > 2*n){
            return;
        }
        if(open < n){
            generateParenthesis(subString+"(",n,open+1,close,result);
        }
        if(close < open){//important condition to remember
            generateParenthesis(subString+")",n,open,close+1,result);
        }
    }
}
 */
