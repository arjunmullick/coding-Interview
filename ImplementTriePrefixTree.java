package com.leetcode;

import java.util.HashMap;

public class ImplementTriePrefixTree {
    class Trie {

        TrieNode root;

        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node.childs.put(ch,next);
                node = next;
            }
            node.isWord = true;
            node.word = word;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                if(!node.childs.containsKey(ch)) return false;
                TrieNode next = node.childs.get(ch);
                node = next;
            }
            return node.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(int i = 0 ; i < prefix.length() ; i++){
                char ch = prefix.charAt(i);
                if(!node.childs.containsKey(ch)) return false;
                TrieNode next = node.childs.get(ch);
                node = next;
            }
            return true;
        }
    }

    class TrieNode{

        boolean isWord;
        String word;
        HashMap<Character,TrieNode> childs;
        public TrieNode(){
            childs = new HashMap<>();
            word = "";
        }

    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
