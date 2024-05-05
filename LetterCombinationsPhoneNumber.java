package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

**/
public class LetterCombinationsPhoneNumber {
    class Solution {

        HashMap<Character, String> map = new HashMap<>();

        public void init(){
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
        }

        public List<String> letterCombinations(String digits) {
            init();
            List<String> result = new ArrayList<>();
            if(digits.length() == 0) return result;

            dfs(0,"",digits.toCharArray(),result);
            return result;
        }

        public void dfs(int index, String s,char[] arr, List<String> result){
            if(index == arr.length){
                result.add(s);
                return;
            }

            char ch = arr[index];
            String nextList = map.getOrDefault(ch,"");
            for(char next : nextList.toCharArray()){
                dfs(index+1,s+next,arr,result);
            }
        }
    }
}
