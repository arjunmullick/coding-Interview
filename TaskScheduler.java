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
