package com.leetcode;

import java.util.Random;

public class RandomPickWeight {

    //https://leetcode.com/problems/random-pick-with-weight/
    /**
    You need to implement the function pickIndex(), 
    which randomly picks an index in the range [0, w.length - 1] (inclusive) and returns it. T
    he probability of picking an index i is w[i] / sum(w).

    [1,3,6] -> [0,1,1,1,2,2,2,2,2,2] 
    Total sum = 10
    this can be divided as buckets = [0,1],[2,4],[5,10]
    pick a number between 0 to 9 then I need to see which bucket above it correspond to and return the bucket index. 

    lets say my random is 5 , then I want to return bucket #3. 
    we create a cumulative sum array like this and run binary search. 
    Then I find index closest to a number > target. the index is our result
    cdf = [1,4,10]
    
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
