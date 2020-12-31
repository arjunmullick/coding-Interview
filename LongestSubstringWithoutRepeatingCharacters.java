package com.leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s == null || s.length() == 0) return 0;
            int n = s.length();
            int l = 0 ; int r = 0 ; int max = 1;
            int maxl = 0;
            int maxr = 0;
            HashSet<Character> charSet = new HashSet<>();
            while(r < n && l <= r){
                char c = s.charAt(r);
                if(charSet.contains(c)){
                    charSet.remove(s.charAt(l));
                    l++;
                }else{
                    charSet.add(c);
                    r++;
                    max = Math.max(max,charSet.size());
                }
            }
            return max;
        }
    }

}
