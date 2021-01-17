package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SubstringConcatenationAllWords {
    //https://leetcode.com/problems/substring-with-concatenation-of-all-words/
    //All words are equal length
    //Match by map equals
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> result = new LinkedList<>();
            if(s == null || s.length() == 0 || words == null || words.length == 0 ) return result;

            int n = s.length();
            int wCount = words.length;
            int wlen = words[0].length();

            HashMap<String,Integer> wMap = new HashMap<>();
            for(String w : words){
                wMap.put(w,wMap.getOrDefault(w,0)+1);
            }
            int matchLen = wCount * wlen;

            for(int i = 0 ; i < n-matchLen+1; i++){
                String toMatch = s.substring(i,i+matchLen);
                if(match(toMatch,wMap,wlen)){
                    result.add(i);
                }
            }
            return result;
        }

        public boolean match(String str , HashMap<String,Integer> wMap, int wlen){
            HashMap<String,Integer> seenMap = new HashMap<>();
            for(int i = 0 ; i < str.length() ; i=i+wlen){
                String w = str.substring(i,i+wlen);
                seenMap.put(w,seenMap.getOrDefault(w,0)+1);
            }
            return seenMap.equals(wMap);
        }
    }
}
