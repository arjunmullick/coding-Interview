package com.leetcode;

public class TrappingRainWater {

    //https://leetcode.com/problems/trapping-rain-water/
    class Solution {
        public int trap(int[] height) {
            int n = height.length;
            int l = 0;
            int r = n-1;
            int result = 0;
            int ledge = 0;//max at left
            int redge = 0;//max at right
            while(l<r){
                ledge = Math.max(ledge , height[l]);
                redge = Math.max(redge , height[r]);
                int fill = 0;
                if(height[l] < height[r]){
                    fill = Math.min(ledge,redge) - height[l];
                    l++;
                }else{
                    fill = Math.min(ledge,redge) - height[r];
                    r--;
                }
                result = result + fill;
            }

            return result;
        }
    }
}
