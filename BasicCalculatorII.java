package com.leetcode;

import java.util.Stack;

public class BasicCalculatorII {

    //https://leetcode.com/problems/basic-calculator-ii/

    class Solution {
        public int calculate(String s) {

            int result = 0;
            int n = s.length();

            Stack<Integer> stack = new Stack<>();
            int num = 0;
            int op = '+';
            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);
                if(i != n-1 && ch == ' ') continue;//ignore blank. for n-1 we need operation
                if(Character.isDigit(ch)){
                    num = num*10 + ch -'0';
                }
                if(!Character.isDigit(ch) || i == n-1){
                    if(op == '+'){
                        stack.push(num);
                    }if(op == '-'){
                        stack.push(-num);
                    }
                    if(op == '*'){
                        stack.push(stack.pop() * num);
                    }
                    if(op == '/'){
                        if(num == 0) return Integer.MAX_VALUE;
                        stack.push(stack.pop() / num);
                    }
                    op = ch;
                    num = 0;//reset for new number
                }
            }

            while(stack.size() > 0){
                result += stack.pop();
            }
            return result;
        }
    }
}
