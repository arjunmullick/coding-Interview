package com.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    //https://leetcode.com/problems/sort-characters-by-frequency/
    class Solution {
        public String frequencySort(String s) {
            HashMap<Character,Integer> charCount = new HashMap<>();

            for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                charCount.put(ch,charCount.getOrDefault(ch,0)+1);
            }

            PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> (charCount.get(b) - charCount.get(a)));
            for(char ch : charCount.keySet()){
                maxHeap.offer(ch);
            }

            String result = "";
            while(maxHeap.size() > 0){
                char ch = maxHeap.poll();
                int count = charCount.get(ch);
                for(int i = 0 ; i < count ; i++){
                    result = result + ch;
                }

            }
            return result;
        }
    }


    class SolutionMoreMemory {
        public String frequencySort(String s) {
            HashMap<Character,Integer> charCount = new HashMap<>();

            for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                charCount.put(ch,charCount.getOrDefault(ch,0)+1);
            }

            PriorityQueue<Node> maxHeap = new PriorityQueue<>((a, b) -> (b.count - a.count));
            for(char ch : charCount.keySet()){
                Node node = new Node(ch , charCount.get(ch));
                maxHeap.offer(node);
            }

            String result = "";
            while(maxHeap.size() > 0){
                Node node = maxHeap.poll();
                char ch = node.ch;
                int count = node.count;
                for(int i = 0 ; i < count ; i++){
                    result = result + ch;
                }

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
