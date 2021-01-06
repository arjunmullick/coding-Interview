package com.leetcode;

public class ContainerWithMostWater {

    class Solution {
        int max;
        public int maxArea(int[] height) {
            max = 0;
            int n = height.length;
            int l = 0;
            int r = n-1;
            while(l<=r){
                int area = 0;
                if(height[l]<height[r]){
                    area = height[l] * (r-l);
                    l++;
                }else{
                    area = height[r] * (r-l);
                    r--;
                }
                max = Math.max(area,max); //maxArea = Math.max(maxArea, (Math.min(height[l]  , height[r]) * (r-l)));
            }
            return max;
        }
    }
}
