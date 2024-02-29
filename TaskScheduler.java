package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
    You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. 
    Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: identical tasks must be separated by at least n intervals due to cooling time.
    ​Return the minimum number of intervals required to complete all tasks.

    Example 1:
    
    Input: tasks = ["A","A","A","B","B","B"], n = 2  
    Output: 8
    Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
**/

public class TaskScheduler {
    class Solution {
        //Complete the task type(A-Z) with max count first followed by second most
        //complete n such operations unless we encounter first task type. if incounter add n time
        //to check encounter or not better poll the task from DS to another DS.
        //We only require count if we are using 2 datascructure to see visited and to be done
            public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0) return 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : tasks){
            map.put(ch , map.getOrDefault(ch,0) +1);
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        for(char ch : map.keySet()){
            maxHeap.offer(map.get(ch));
        }
        
        int result = 0;
        
        while(maxHeap.size() > 0){
            List<Integer> nextCycle = new ArrayList<>();
            int cycle = n+1;
            while(cycle > 0 && maxHeap.size() > 0){
                int t = maxHeap.poll();
                t--;
                cycle--;
                if(t>0){
                    nextCycle.add(t);
                }
            }
            if(nextCycle.size() == 0){
                result+= n+1-cycle;
            }else{
                result += n+1;
            }
            for(int t : nextCycle){
                maxHeap.offer(t);
            }
        }
        
        return result;
    }
}
    
}
