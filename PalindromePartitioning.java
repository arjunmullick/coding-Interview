package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

//Time Complexity :O (N  * 2^N) where N is the length of string ss.
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>();
            dfs(0,s,new ArrayList<>() , result);
            return result;
        }

        public void dfs(int index, String s, List<String> list , List<List<String>> result){

            if(index >= s.length()){
                result.add(new ArrayList<>(list));
            }

            for(int i = index ; i < s.length() ; i++){
                String s1 = s.substring(index,i+1);
                if(isPalindrome(s1)){
                    list.add(s1);
                    dfs(i+1,s,list,result);
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
