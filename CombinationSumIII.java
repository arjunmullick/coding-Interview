package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    //https://leetcode.com/problems/combination-sum-iii/
    /**

    Example 1:

        Input: k = 3, n = 7
        Output: [[1,2,4]]
        Explanation:
        1 + 2 + 4 = 7
        There are no other valid combinations.
        
    Example 2:
        
        Input: k = 3, n = 9
        Output: [[1,2,6],[1,3,5],[2,3,4]]
        Explanation:
        1 + 2 + 6 = 9
        1 + 3 + 5 = 9
        2 + 3 + 4 = 9
        There are no other valid combinations.
        
    Example 3:
        
        Input: k = 4, n = 1
        Output: []
        Explanation: There are no valid combinations.
        Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
    **/
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<Integer> nums = new ArrayList<>();
            for(int i = 1 ; i <=9 ; i++){
                nums.add(i);
            }
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0,nums,0,k,n,list,result);
            return result;
        }

        public void backtrack(int start,List<Integer> nums, Integer sum , int k , int n ,List<Integer> list, List<List<Integer>> result){
            if(list.size() == k && sum == n){
                result.add(new ArrayList<>(list));
            }

            for(int i = start ; i < nums.size() ; i++){
                list.add(nums.get(i));
                sum = sum + nums.get(i);
                backtrack(i+1,nums,sum,k,n,list,result);
                sum = sum - nums.get(i);
                list.remove(list.size()-1);
            }
        }
    }
}
