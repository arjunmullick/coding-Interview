package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
*/
public class WordLadder {
    //https://leetcode.com/problems/word-ladder/
    //BFS on all possibility O(N * K*K) N words and each word with K length
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if(beginWord.equals(endWord)) return 1;
            HashSet<String> visited = new HashSet<>();

            int result = 1;
            Queue<String> queue = new LinkedList<>();
            queue.offer(beginWord);

            while(queue.size() > 0){
                Queue<String> nextLevel = new LinkedList<>();
                while(queue.size() > 0){
                    String w = queue.poll();
                    if(w.equals(endWord)) return result;
                    for(String next : wordList){
                        if(!visited.contains(next) && isOneDiff(w,next)){
                            nextLevel.offer(next);
                            visited.add(next);//adding here is better vs when poll. Avoids checks in same level
                        }
                    }

                }
                result++;
                queue = nextLevel;
            }

            return 0;
        }

        public boolean isOneDiff(String w1, String w2){
            if(w1.length() != w2.length()) return false;
            int count = 0;
            for(int i = 0 ; i < w2.length(); i++){
                if(w1.charAt(i) != w2.charAt(i)) count++;
            }

            return count == 1;
        }
    }
}
