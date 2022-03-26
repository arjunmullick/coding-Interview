class Solution {
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
