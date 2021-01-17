package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class PrefixSuffixSearch {
    //https://leetcode.com/problems/prefix-and-suffix-search/
    class WordFilter {
        Trie trie;
        public WordFilter(String[] words) {
            this.trie = new Trie();
            for(int i = 0 ; i < words.length ; i++){
                trie.insert(words[i],i);
            }
        }

        public int f(String prefix, String suffix) {
            HashSet<Integer> prefixIndex = trie.existPrefix(prefix);
            HashSet<Integer> suffixIndex = trie.existSuffix(suffix);
            int max = -1;
            for(int n : prefixIndex){
                if(n> max && suffixIndex.contains(n))
                    max = Math.max(n,max);
            }
            return max;
        }
    }

    class Trie{

        TrieNode rootPrefix;
        TrieNode rootSuffix;

        public Trie(){
            this.rootPrefix = new TrieNode();
            this.rootSuffix = new TrieNode();
        }

        public void insert(String word, int index){
            TrieNode nodePrefix = rootPrefix;
            TrieNode nodeSuffix = rootSuffix;
            for(char ch : word.toCharArray()){
                TrieNode next = nodePrefix.childs.getOrDefault(ch, new TrieNode());
                next.ch = ch;
                HashSet<Integer> indexs = next.index;
                indexs.add(index);
                nodePrefix.childs.put(ch,next);
                nodePrefix = next;
            }
            nodePrefix.isWord = true;


            for(int i = word.length() -1 ; i>=0 ; i--){
                char ch = word.charAt(i);
                TrieNode next = nodeSuffix.childs.getOrDefault(ch, new TrieNode());
                next.ch = ch;
                HashSet<Integer> indexs = next.index;
                indexs.add(index);
                nodeSuffix.childs.put(ch,next);
                nodeSuffix = next;
            }
            nodeSuffix.isWord = true;
        }

        public HashSet<Integer> existPrefix(String prefix){
            TrieNode nodePrefix = rootPrefix;
            for(char ch : prefix.toCharArray()){
                TrieNode next = nodePrefix.childs.get(ch);
                if(next == null) return new HashSet<>();
                nodePrefix = next;
            }

            return nodePrefix.index;
        }


        public HashSet<Integer> existSuffix(String suffix){
            TrieNode nodeSuffix = rootSuffix;
            for(int i = suffix.length()-1 ; i >= 0 ; i--){
                char ch = suffix.charAt(i);
                TrieNode next = nodeSuffix.childs.get(ch);
                if(next == null) return new HashSet<>();
                nodeSuffix = next;
            }
            return nodeSuffix.index;
        }
    }


    class TrieNode{

        char ch;
        HashMap<Character,TrieNode> childs;
        boolean isWord;
        HashSet<Integer> index;//index of inserted word

        public TrieNode(){
            this.childs = new HashMap<>();
            this.index = new HashSet();
            //this.index = new PriorityQueue<>((a,b) -> (b-a));//max heap
        }
    }
/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */

}
