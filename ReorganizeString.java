package com.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {

    //https://leetcode.com/problems/reorganize-string/
    class Solution {
        public String reorganizeString(String S) {
            String result = "";

            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : S.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            PriorityQueue<Node> maxHeap = new PriorityQueue<>((a, b)->(b.count-a.count));
            for(char ch : map.keySet()){
                maxHeap.offer(new Node(ch,map.get(ch)));
            }
            char prev = ' ';
            while(maxHeap.size() >= 2){
                Node node1 = maxHeap.poll();
                Node node2 = maxHeap.poll();
                char ch1 = node1.ch;
                char ch2 = node2.ch;
                if(ch1 == ch2) return "";//break
                result += ch1 + "" +ch2;
                prev = ch2;
                node1.count = node1.count -1;
                node2.count = node2.count -1;
                if(node1.count > 0){
                    maxHeap.offer(node1);
                }
                if(node2.count > 0){
                    maxHeap.offer(node2);
                }
            }
            if(maxHeap.size() > 0){
                Node node = maxHeap.poll();
                char ch = node.ch;
                int count = node.count;
                if(ch == prev || count != 1) return "";//break
                result = result + ch;
            }

            return result;
        }
    }

    class Node{
        char ch;
        int count;
        public Node(char ch , int count){
            this.ch = ch;
            this.count = count;
        }
    }
}


/*
Note : how its different from https://leetcode.com/problems/task-scheduler/

1. input aaabc is accepted as abaca . // connot go level by level on unique character
2. End condition need all character completed . Equal length optput
3. Compare in pair if possible , In case on no pair like aaa -> a:3 return ""
 */
