package com.leetcode;

public class MinimumNumberKConsecutiveBitFlips {

    class Solution {

        //https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/
        //if A[i] = 0 & flip = 0 || A[i] = 1 & flip = 1 then need flip
        public int minKBitFlips(int[] A, int K) {
            int n = A.length;
            int isFlipped[] = new int[n];
            int flip = 0;
            int result = 0;
            for(int i = 0 ; i < n ; i++){
                if(i>=K)
                    flip = flip ^ isFlipped[i-K];
                if(A[i] == flip){
                    if(i+K > n) return -1; //cannot flip K bits
                    isFlipped[i] = 1;
                    flip = flip ^ 1;//invert flip
                    result++;
                }
            }
            return result;
        }
    }
}
