package com.leetcode;

public class LongestRepeatingCharacterReplacement {

    //https://leetcode.com/problems/longest-repeating-character-replacement/
    /**
    Example 1:

    Input: s = "ABAB", k = 2
    Output: 4
    Explanation: Replace the two 'A's with two 'B's or vice versa.
    Example 2:
    
    Input: s = "AABABBA", k = 1
    Output: 4
    Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
    The substring "BBBB" has the longest repeating letters, which is 4.
    There may exists other ways to achieve this answer too.

    **/
    class Solution {
        public int characterReplacement(String s, int k) {
            int left = 0;
            int right = 0;
            int n = s.length();
            int[] freq = new int[26];

            int maxCharCount = 0;
            int result = 0;
            while(right < n){
                int ch = s.charAt(right);
                freq[ch - 'A']++;
                maxCharCount = Math.max(maxCharCount , freq[ch - 'A']);
                int len = right - left +1;//window length
                while(len - maxCharCount > k){//char diff in window
                    freq[s.charAt(left) - 'A']--;
                    left++;
                    len = right - left +1;
                }
                result = Math.max(result , right - left +1);
                right++;
            }
            return result;
        }
    }
}
