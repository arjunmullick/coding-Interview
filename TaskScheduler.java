package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    class Solution {
        //Complete the task type(A-Z) with max count first followed by second most
        //complete n such operations unless we encounter first task type. if incounter add n time
        //to check encounter or not better poll the task from DS to another DS.
        //We only require count if we are using 2 datascructure to see visited and to be done
        public int leastInterval(char[] tasks, int n) {
            Map<Character,Integer> charCount= new HashMap<>();

            for(char ch : tasks){
                charCount.put(ch,charCount.getOrDefault(ch,0)+1);
            }

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
            for(char key : charCount.keySet()){
                int value = charCount.get(key);
                maxHeap.offer(value);
            }

            int result = 0;
            while(maxHeap.size() >0){
                int count = n;
                List<Integer> nextCycle = new ArrayList<>();
                while(maxHeap.size() > 0 && count >= 0){
                    int val = maxHeap.poll();
                    count --;
                    val--;//for next cycle;
                    if(val > 0){
                        nextCycle.add(val);
                    }

                }
                if(nextCycle.size() == 0){
                    result +=  (n-count);
                }else{
                    result+= n+1;// n+1 task in each cycle
                }


                for(int next : nextCycle){
                    maxHeap.offer(next);
                }
            }
            return result;
        }
    }
}
