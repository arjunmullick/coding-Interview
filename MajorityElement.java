package com.leetcode;

public class MajorityElement {

    //https://leetcode.com/problems/majority-element/
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int result = nums[0];
            for(int i = 0 ; i < nums.length ; i++){
                if(count == 0){
                    result = nums[i];
                }
                if(nums[i] == result){
                    count++;
                }else{
                    count--;
                }
            }
            return result;
        }
    }


// https://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html#step13



/**With sort
 public int majorityElement(int[] nums) {
 Arrays.sort(nums);
 return nums[nums.length/2];
 }
 **/
}
