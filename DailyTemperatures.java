package com.leetcode;

import java.util.Stack;

public class DailyTemperatures {
    //https://leetcode.com/problems/daily-temperatures/
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            Stack<Integer> stack = new Stack<>();//keeps index
            int[] result = new int[T.length];
            for(int i = T.length-1 ; i >=0 ;i--){
                int t = T[i];
                while(!stack.isEmpty() && t >= T[stack.peek()]){
                    stack.pop();
                }
                int count = 0;
                if(!stack.isEmpty())
                    count = stack.peek() -i;
                result[i] = count;
                stack.push(i);
            }
            return result;
        }
    }
}
