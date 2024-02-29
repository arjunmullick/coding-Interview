package com.leetcode;

public class PermutationString {
    //https://leetcode.com/problems/permutation-in-string/
    /**
    Example 1:

        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").
    Example 2:
        
        Input: s1 = "ab", s2 = "eidboaoo"
        Output: false
    **/
    class Solution {
        public boolean checkInclusion(String s1, String s2) {

            int n1 = s1.length();
            int n2 = s2.length();
            if(n2 < n1) return false;

            int[] count1 = new int[26];
            for(char ch : s1.toCharArray()){
                int val = ch - 'a';
                count1[val] = count1[val]+1;
            }

            for(int i = 0 ; i < n2-n1+1 ; i++){
                char ch = s2.charAt(i);
                if(count1[ch-'a'] != 0){
                    String toCompare = s2.substring(i,i+s1.length());
                    if(isPurmutation(toCompare,count1)){
                        return true;
                    }
                }
            }
            return false;
        }


        private boolean isPurmutation(String s ,int[] count1){
            int[] count2 = new int[26];

            for(char ch : s.toCharArray()){
                int val = ch - 'a';
                count2[val] = count2[val]+1;
            }

            for(int i = 0 ; i < 26 ; i++){
                if(count1[i] != count2[i]) return false;
            }
            return true;
        }
    }

    //Do we really need 2 Array for count
    //We can use sliding window itself to keep adding and removing character
    class Solution2Optimized {
        public boolean checkInclusion(String s1, String s2) {

            int n1 = s1.length();
            int n2 = s2.length();
            if(n2 < n1) return false;

            int[] count = new int[26];
            for(int i = 0 ; i< n1 ; i++){
                int val1 = s1.charAt(i) - 'a';
                int val2 = s2.charAt(i) - 'a';
                count[val1] = count[val1]+1;
                count[val2] = count[val2]-1;
            }
            if(allZeors(count)) return true;

            for(int i = n1 ; i < n2 ; i++){
                int right = s2.charAt(i) - 'a';//
                int left = s2.charAt(i-n1) - 'a';
                count[right] = count[right]-1;
                count[left] = count[left]+1;
                if(allZeors(count)) return true;

            }
            return false;
        }

        private boolean allZeors(int[] count){
            for(int i = 0 ; i < 26 ; i++){
                if(count[i] != 0) return false;
            }
            return true;
        }
    }
}
