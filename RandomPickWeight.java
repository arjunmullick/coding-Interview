package com.leetcode;

import java.util.Random;

public class RandomPickWeight {

    //https://leetcode.com/problems/random-pick-with-weight/
    /**
    You need to implement the function pickIndex(), 
    which randomly picks an index in the range [0, w.length - 1] (inclusive) and returns it. T
    he probability of picking an index i is w[i] / sum(w).
    */
    class Solution {

        Random random;
        int[] cdf;
        public Solution(int[] w) {
            random = new Random();
            cdf = new int[w.length];
            cdf[0] = w[0];
            for(int i = 1; i < w.length; i++) {
                cdf[i] = cdf[i - 1] + w[i];
            }
        }

        public int pickIndex() {
            int n = cdf.length;
            int target = random.nextInt(cdf[n - 1]) + 1;
            int left = 0;
            int right = n - 1;
            while(left < right) {
                int mid = (left + right) / 2;
                if(cdf[mid] == target)
                    return mid;
                if(cdf[mid] < target)
                    left = mid + 1;
                else right = mid;
            }
            return left;//or right
        }
    }
}
