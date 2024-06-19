/**
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]

**/

class Solution {
    //number of days you have to wait after the ith day to get a warmer temperature
    /**
    Input: temperatures = [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]

    **/
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();//stores index 
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i = n -1 ; i >=0 ; i--){
            int t = temperatures[i];
            while(stack.size() > 0 && temperatures[stack.peek()] <= t){//even remove when equal 
                stack.pop();
            }
            int count = 0;
            if(stack.size() > 0){
                count = stack.peek() - i;
            }
            result[i] = count;
            stack.push(i);
        }
        
        return result;
    }
}
