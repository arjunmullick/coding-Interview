package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {

    //Recursion

    /**
        Input: "word"
        Output:
        ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
    **/
    class Solution {
        //https://leetcode.com/problems/generalized-abbreviation/
        //word - 11rd or 1111 is not valid
        // ["4","3d","2r1","2rd","1o2","1o1d","1or1","1ord","w3","w2d","w1r1","w1rd","wo2","wo1d","wor1","word"]

        
        public List<String> generateAbbreviations(String word) {
            List<String> result = new ArrayList<>();
            backtrack(result,word,0,"",0);
            return result;
        }

        private void backtrack(List<String> result, String word, int index, String current, int count){
            if(index==word.length()){
                if(count > 0) current += count;
                result.add(current);
            }
            else{
                backtrack(result, word, index+1, current, count + 1);
                if(count > 0){
                    current = current + count + word.charAt(index);
                }else{
                    current = current + word.charAt(index);
                }
                backtrack(result, word, index+1, current, 0);
            }
        }
    }
}
