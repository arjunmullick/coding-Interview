import java.io.*;
import java.util.HashMap;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

// Main class should be named 'Solution'
class Solution {
    
    public static HashMap<String,Integer> numbers = new HashMap<>();
    public static HashMap<String,Character> operations = new HashMap<>();
    
    public static void initMap(){
        numbers.put("zero", 0);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five",5);
        numbers.put("six",6);
        numbers.put("seven",7);
        numbers.put("eight",8);
        numbers.put("nine",9);
        numbers.put("ten", 10);
        
        operations.put("plus", '+');
        operations.put("times", '*');
        //operations.put("negative", '-');
    }
    
    
    public static int eval(String str){
        
        if(str == null || str.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        Character op = '+';//revisit
        int num = 0;
        String[] arr = str.split(" ");
        int n = arr.length;
        
        boolean negative = false;
        for(int i = 0 ; i < n ; i++){
            String word = arr[i];
            if(word.length() == 0) continue;
            
            if(numbers.containsKey(word)){
                 //System.out.println(word + " " + op);
                if(op == '+'){
                    num = numbers.get(word);
                    if(negative) {
                        stack.push(-num);
                    }else{
                        stack.push(num);
                    }
                    negative = false;//reset
                }else if(op == '*'){
                    int prev = stack.pop();
                    num = prev * numbers.get(word);
                    if(negative) {
                        stack.push(-num);
                    }else{
                        stack.push(num);
                    }
                    negative = false;//reset
                } else if(op == '-'){
                    num = -1 * numbers.get(word);
                    stack.push(num);
                }
            }else if(operations.containsKey(word)){
                op = operations.get(word);
            }else if(word.equals("negative")){
                negative = true;
            }
        }
        //System.out.println(stack);
        int ans = 0;
        while(stack.size() > 0){
            ans = ans + stack.pop();
        }
        
        return ans;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello, World");
        initMap();
    
        System.out.println(eval("one plus one"));
        System.out.println(eval("five plus two times negative one"));
        System.out.println(eval("negative three times ten"));
        System.out.println(eval("five times three plus one"));
        System.out.println(eval("two times three times four"));
        System.out.println(eval("two times three plus four times five"));
        System.out.println(eval("two plus three times four plus five"));
        System.out.println(eval("two times three times four plus five times six"));
        System.out.println(eval("two times three plus four plus five plus six times seven"));
    }  
    
}
