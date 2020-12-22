package com.leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    //https://leetcode.com/problems/longest-increasing-subsequence/
    class Solution {

        //[10,9,2,5,3,7,101,18]
        //[1,1,1,2,2,3,4,1]
        //at value 3 we need visibility of value 2 and its longest sub seq count
        //We can always go back to index j where num[j] < num[i] - j<i . This search will N^2 why not calculate starting at each j
        // then search max in count array memo
        //N^2 better than 2^N brute force
        public int lengthOfLIS(int[] nums) {
            if(nums.length <=1) return nums.length;
            int memo[] = new int[nums.length];//to store value of LIS at index position
            for(int i = 0 ; i < memo.length ; i++){
                memo[i] = 1;
            }
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i+1 ; j < nums.length ; j++){
                    if(nums[j] > nums[i]){
                        memo[j] = Math.max(memo[j] , memo[i]+1);
                    }
                }
            }
            int result = 0;
            for(int i = 0 ; i < memo.length ; i++){
                //System.out.print(memo[i] + " ");
                result = Math.max(result,memo[i]);
            }
            return result;
        }
    }

}

/**
 * Good for discussion
 *
 *ALTERNATE APPROACH O(N LogN)
 *
 * insert first number in empty array at 0 pos .
 * Run binary search every time a new number is added . Find number just lesser than it
 * if found insert
 * else replace index 0 and start again
 * [10,9,2,5,3,7,101,18]
 * 10 0 0 0 0 0 0 0
 * 9 0 0 0 0 0 0 0
 * 2 0 0 0 0 0 0 0
 * 2 5 0 0 0 0 0 0
 * 2 3 0 0 0 0 0 0
 * 2 3 7 0 0 0 0 0
 * 2 3 7 101 0 0 0 0
 * 2 3 7 18 0 0 0 0
 */

/*
public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    int len = 0;
    for (int num : nums) {
        int i = Arrays.binarySearch(dp, 0, len, num);
        //System.out.println(num + " " + i+ " " + len + "  /");
        if (i < 0) {
            i = -(i + 1);
        }
        dp[i] = num;
        if (i == len) {
            len++;
        }
    }
    return len;
}



//OR

    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
 */
