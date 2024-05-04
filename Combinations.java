package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    //https://leetcode.com/problems/combinations/
    /**
        Input: n = 4, k = 2
        Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        Explanation: There are 4 choose 2 = 6 total combinations.
        Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
    **/
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(1,n,k,new ArrayList<>(),result);
            return result;
        }

        public void backtrack(int start, int n , int k, List<Integer> list, List<List<Integer>> result){

            if(list.size() == k){
                result.add(new ArrayList<>(list));

            }

            for(int i= start ; i <=n ; i++){
                list.add(i);
                backtrack(i+1,n,k,list,result);
                list.remove(list.size()-1);
            }
        }
    }
}
