package com.leetcode;

public class LongestPalindromicSubstring {
    //https://leetcode.com/problems/longest-palindromic-substring/
    //Expand at each location O(n^2)
    /**
    Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.
    Example 2:
        Input: s = "cbbd"
        Output: "bb"
    **/
    class Solution {
        int l;
        int r;
        int max = 0;
        public String longestPalindrome(String s) {
            if(s == null || s.length() == 0) return "";

            if(s.length() == 1) return s;

            for(int i = 0 ; i < s.length() ; i++){
                findLongestPalindromicSubstring(s,i,i+1);
                findLongestPalindromicSubstring(s,i,i);
            }
            return s.substring(l,r);
        }

        public void findLongestPalindromicSubstring(String s, int left, int right ){
            while(left>=0 && right< s.length() &&  s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            int len = right - left - 1;
            if(len > max){
                max = len;
                this.l = left+1;
                this.r = right;
            }
        }
    }
}
