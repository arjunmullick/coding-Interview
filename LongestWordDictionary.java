package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestWordDictionary {

    //https://leetcode.com/problems/longest-word-in-dictionary/

    class Solution {

        public String longestWord(String[] words) {
            Trie trie = new Trie();
            for(String w : words){
                trie.insert(w);
            }
            return trie.longestWordCreate();
        }


    }

    class TrieNode{
        String word;
        boolean isWord;
        HashMap<Character,TrieNode> child;

        public TrieNode(){
            child = new HashMap<>();
        }
    }

    class Trie{

        TrieNode root;

        public Trie(){
            root = new TrieNode();
            root.isWord = true;// to make BFS work
            root.word = "";// to make BFS work
        }

        public void insert(String word){
            TrieNode node = this.root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.child.getOrDefault(ch,new TrieNode());
                node.child.put(ch,next);
                node = next;
            }
            node.isWord = true;
            node.word = word;
        }

        public String longestWordCreate(){

            //do DFS/BFS and check at each node a word is found
            Queue<TrieNode> queue = new LinkedList<>();
            queue.offer(root);
            String longestWord = "";

            while(queue.size() > 0){
                Queue<TrieNode> level = new LinkedList<>();
                while(queue.size() >0){
                    TrieNode node = queue.poll();

                    if(node.word.length() > longestWord.length()){
                        longestWord = node.word;
                    }else if(node.word.length() == longestWord.length() && node.word.compareTo(longestWord) <0){//for lexicographically order
                        longestWord = node.word;
                    }

                    if(node.isWord){//if its not a word dont check child
                        HashMap<Character,TrieNode> childs = node.child;
                        for(Character c : childs.keySet()){
                            TrieNode child = childs.get(c);
                            if(child.isWord)
                                level.add(child);
                        }
                    }
                }
                queue = level;
            }

            return longestWord;

        }

    }
}

/**
    class Solution {
        public String longestWord(String[] words) {
            String ans = "";
            Set<String> wordset = new HashSet();
            for (String word: words) wordset.add(word);
            for (String word: words) {
                if (word.length() > ans.length() ||
                        word.length() == ans.length() && word.compareTo(ans) < 0) {
                    boolean good = true;
                    for (int k = 1; k < word.length(); ++k) {
                        if (!wordset.contains(word.substring(0, k))) {
                            good = false;
                            break;
                        }
                    }
                    if (good) ans = word;
                }
            }
            return ans;
        }
    }
 **/