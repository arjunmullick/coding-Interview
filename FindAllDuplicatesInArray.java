package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInArray {
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
    class Solution {

        // [4,3,2,7,8,2,3,1]
        //8/2 = 4 - 6 , 2 - 3  ,1 - 1 , 2 - found
        // start another bs l = 3 r = 8 and  l =1  r =1 so we are stuck . for O(n) change array itself to use index value

        // [4,3,2,7,8,2,3,1]  -
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new LinkedList<>();

            for(int i = 0 ; i < nums.length ; i++){
                int val = nums[i];
                int absVal = Math.abs(val);
                if(nums[absVal-1] < 0){
                    result.add(absVal);
                }
                nums[absVal-1] = -1 * nums[absVal -1];
            }

            return result;
        }
    }
}
