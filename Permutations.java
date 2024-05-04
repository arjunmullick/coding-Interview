package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //https://leetcode.com/problems/permutations/
    /**
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    **/
    class Solution {
        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();//first list
            for(int n : nums){
                list.add(n);
            }
            backtrack(0,nums,list,result);
            return result;
        }

        public void backtrack(int index, int[] nums, List<Integer> list,  List<List<Integer>> result){
            if(index == list.size())//the recursion start swaping from last element
                result.add(new ArrayList<>(list));//copy and add
            for(int i = index ; i < nums.length ; i++){
                swap(list,index,i);//swap all other with this index
                backtrack(index+1,nums,list,result);
                swap(list,index,i);//reset
            }
        }

        private void swap(List<Integer> list , int index1 , int index2){
            int temp = list.get(index1);
            list.set(index1,list.get(index2));
            list.set(index2,temp);
        }
    }
}
