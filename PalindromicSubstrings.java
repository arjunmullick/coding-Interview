package com.leetcode;

public class PalindromicSubstrings {

    class Solution {
        //https://leetcode.com/problems/palindromic-substrings/

        //Generating all palindrome recursion or iteration
        //for(i->0,n)->for(j-i,n)->check each is O(N^3)
        //Trick - we expand at each position https://leetcode.com/problems/longest-palindromic-substring/
        //while expanding count at each check

        int count = 0;
        public int countSubstrings(String s) {
            if(s.length() <= 1) return s.length();

            for(int i = 0 ; i < s.length() ; i++){//start from 0 and terminating conditions will be checked in extend
                extendAndVerify(i,i,s);//evn len
                extendAndVerify(i,i+1,s);//odd len
            }
            return count;
        }

        public void extendAndVerify(int l , int r , String s){
            int n = s.length();
            while(l>=0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                count++;
            }
        }
    }
}
