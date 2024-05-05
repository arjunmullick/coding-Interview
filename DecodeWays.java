package com.leetcode;

public class DecodeWays {
    //https://leetcode.com/problems/decode-ways/
    /**
    Example 1:

    Input: s = "12"
    Output: 2
    Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
    Example 2:
    
    Input: s = "226"
    Output: 3
    Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
    Example 3:
    
    Input: s = "06"
    Output: 0
    Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
    **/
    public class Solution {
        public int numDecodings(String s) {
            if(s == null || s.length() == 0) {
                return 0;
            }
            int n = s.length();
            int[] dp = new int[n+1];
            dp[0] = 1;
            dp[1] = s.charAt(0) != '0' ? 1 : 0;
            for(int i = 2; i <= n; i++) {
                int first = Integer.parseInt(s.substring(i-1, i));
                int second = Integer.parseInt(s.substring(i-2, i));
                if(first !=0) {//if(first >= 1 && first <= 9) {
                    dp[i] += dp[i-1];
                }
                if(second >= 10 && second <= 26) {
                    dp[i] += dp[i-2];
                }
            }
            return dp[n];
        }
    }
}
