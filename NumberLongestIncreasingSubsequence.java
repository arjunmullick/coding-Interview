package com.leetcode;

import java.util.Arrays;


/*

One way to look for LIS is below, start  search starting at each j from i+1 to n
            for(int i = 0 ; i < nums.length ; i++)
                for(int j = i+1 ; j < nums.length ; j++)
                    if(nums[j] > nums[i]){
                        memo[j] = Math.max(memo[j] , memo[i]+1);
and other  way could be to see sequence ending at i instead of tarting at j
            for (int i = 0; i < n; i++) {
                for (int j = i-1; j >= 0; j--)
                  if (nums[j] < nums[i])
                    memo[i] = Math.max(memo[j]+1,memo[i])

The second help get the count at i much easily
 */

public class NumberLongestIncreasingSubsequence {
    //https://leetcode.com/problems/number-of-longest-increasing-subsequence/
    class Solution {
        public int findNumberOfLIS(int[] nums) {
            int n = nums.length, max = 0;

            int[] len = new int[n]; // the longest increasing subsequence array dp
            int[] cnt = new int[n]; // the number of the longest increasing subsequence that ends at i
            Arrays.fill(len,1);
            Arrays.fill(cnt,1);
            for (int i = 0; i < n; i++) {
                for (int j = i-1; j >= 0; j--) {
                    if (nums[j] < nums[i]) {
                        //concept len[i] = Math.max(len[j]+1,len[i])
                        // if combining with i makes a longer increasing subsequence
                        if (len[j]+1 > len[i]) {
                            len[i] = len[j]+1;
                            cnt[i] = cnt[j];
                        }
                        // if combining with i makes another longest increasing subsequence
                        else if (len[j]+1 == len[i]) {
                            cnt[i] += cnt[j];
                        }
                    }
                }
                max = Math.max(max, len[i]);
            }

            int res = 0;
            for (int i = 0; i < n; i++) {
                if (len[i] == max) {
                    res += cnt[i];
                }
            }
            return res;
        }
    }
}
