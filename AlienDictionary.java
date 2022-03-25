package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {

    class Solution {
        // Get all unique characters . Create a map / graph with relationships by comparing adjacent words.
        // Count of in-degree for starting of topological sort ( BFS on graph to avoid cycle.)
        // if all character in words are in result return formed order

        public String alienOrder(String[] words) {
            int n = words.length;
            if(n==0 || words[0].length() == 0) return "";
            //in ideal case by description of question. Accepted to return all letters
            //if(n == 1 && words[0].length() > 0) return  "" + words[0].charAt(0);

            //build map
            HashMap<Character,List<Character>> adj = new HashMap<>();
            HashMap<Character,Integer> inDegree = new HashMap<>();
            for(int i = 0 ; i < n ; i++){//build empty degree and adj list map // to avoid failure of case ["z","z"]
                String w = words[i];
                for(char ch : w.toCharArray()){
                    adj.put(ch,new LinkedList<>());
                    inDegree.put(ch , 0);
                }
            }
            // compare adjacent word to populate degree and adj map
            for(int i = 1 ; i < n ; i++){
                String w1 = words[i-1];
                int len1 = w1.length();
                String w2 = words[i];
                int len2 = w2.length();
                if(len1 > len2 && w1.substring(0,len2).equals(w2)) return "";// bad input edge case
                //first mismatch
                int k = 0;
                while(k < len1 && k < len2){
                    if(w1.charAt(k) != w2.charAt(k)){
                        List<Character> list = adj.get(w1.charAt(k));
                        list.add(w2.charAt(k));
                        adj.put(w1.charAt(k) , list);
                        inDegree.put(w2.charAt(k),inDegree.get(w2.charAt(k))+1);
                        break;
                    }
                    k++;
                }
            }

            Queue<Character> queue = new LinkedList<>();
            for(Character ch : inDegree.keySet()){
                if(inDegree.get(ch) == 0){
                    queue.offer(ch);
                }
            }
            String result = "";
            while(queue.size() > 0){
                char ch = queue.poll();
                result += ch;
                for(Character next : adj.get(ch)){
                    inDegree.put(next , inDegree.get(next) -1);
                    if(inDegree.get(next) == 0) queue.offer(next);
                }
            }
            if(inDegree.size() == result.length()) return result; // required to cover all character discovered

            return "";
        }
    }
}
