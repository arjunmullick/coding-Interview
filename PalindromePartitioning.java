package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    //https://leetcode.com/problems/palindrome-partitioning/
    //Time Complexity :O (N  * 2^N) where N is the length of string ss.
    /**
    Time complexity: O(2^n*n)
        The time complexity is O(2^n) because for each character in the input string, the algorithm generates two recursive calls, one for including the character in the current partition and one for not including it. Since the input string can have up to n characters, this results in 2^n possible partitions. The algorithm must check each partition to see if it is a palindrome, and therefore the time complexity is O(2^n)and O(N) time to generate the substring and determine if it is a palindrome or not. So overall time complexity is O(2^n*n).
    Space complexity: O(n)
    **
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>();
            backtrack(0,s,new ArrayList<>() , result);
            return result;
        }

        public void backtrack(int index, String s, List<String> list , List<List<String>> result){

            if(index >= s.length()){
                result.add(new ArrayList<>(list));
            }

            for(int i = index ; i < s.length() ; i++){
                String s1 = s.substring(index,i+1);
                if(isPalindrome(s1)){
                    list.add(s1);
                    backtrack(i+1,s,list,result);
                    list.remove(list.size()-1);
                }
            }
        }

        public boolean isPalindrome(String s){
            int l = 0;
            int r = s.length()-1;
            while(l<r){
                if(s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
            }
            return true;
        }
    }
}
