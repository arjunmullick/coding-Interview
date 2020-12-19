package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    //https://leetcode.com/problems/combinations/
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
