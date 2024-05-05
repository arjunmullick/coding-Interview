package com.leetcode;

public class CountingBits {

    //https://leetcode.com/problems/counting-bits/

    /**
    Example 1:
    
    Input: n = 2
    Output: [0,1,1]
    Explanation:
    0 --> 0
    1 --> 1
    2 --> 10
    Example 2:
    
    Input: n = 5
    Output: [0,1,1,2,1,2]
    Explanation:
    0 --> 0
    1 --> 1
    2 --> 10
    3 --> 11
    4 --> 100
    5 --> 101
 
    **/

    //O(N*K)
    class Solution {
        public int[] countBits(int num) {
            int result[] = new int[num+1];
            //O(N*K) where K is no of bits in n and N is nums+1
            for(int n = 0 ; n <= num ; n++){
                result[n] = count1(n);//count no of 1's
            }
            return result;
        }

        private int count1(int n){
            int count = 0;
            while(n!=0){
                n = n & n-1; //bit manupulation trick .
                //Flip least significant 1 to 0 and count operations
                // n = 110100 , n-1 will be  110011
                // & will give 110000 fliping least significcant 1 and rest remain same.
                // continue till all are 000000
                count++;
            }
            return count;
        }
    }
    //O(N)
    //Same concept as above , we used DP to store last result with one less 1 bit
    class SolutionOptimiaed {
        //optimized
        public int[] countBits(int num) {
            int[] result = new int[num+1];
            for(int i = 1 ; i <= num ; i++){
                result[i] = result[i & i-1] +1;
            }
            return result;
        }
    }
}
