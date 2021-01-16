package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicCalculatorIII {

    //https://leetcode.com/problems/basic-calculator-iii/

    class Solution {
        public int calculate(String s) {
            Queue<Character> queue = new LinkedList<>();
            for(char c : s.toCharArray()){
                queue.offer(c);
            }
            queue.offer('+');
            return calculateQueue(queue);
        }

        public int calculateQueue(Queue<Character> queue){
            int result = 0;
            int op = '+';
            int num = 0;
            Stack<Integer> stack = new Stack<>();
            while(queue.size() > 0){
                char ch = queue.poll();
                if(ch == ' ') continue;
                if(Character.isDigit(ch)){
                    num = num * 10 + ch -'0';
                }else if(ch == '('){
                    num = calculateQueue(queue);//caclulate and update num
                }else if(!Character.isDigit(ch)){
                    if(op == '+'){
                        stack.push(num);
                    }else if(op == '-'){
                        stack.push(-num);
                    }else if(op == '*'){
                        stack.push(stack.pop() * num);
                    }else if(op == '/'){
                        stack.push(stack.pop() / num);
                    }
                    op = ch;
                    num = 0;
                }
                if(ch == ')'){
                    break;
                }
            }

            while(stack.size() > 0){
                result += stack.pop();
            }
            return result;
        }
    }
}
