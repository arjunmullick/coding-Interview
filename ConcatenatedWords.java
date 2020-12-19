package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ConcatenatedWords {

    class Solution {

        // Insert all in trie
        // For each word starting at root check till end
        // whenever we find a word-end start verify next string as subproblem
        // if one recursion stack is true we add that string in result
        public List<String> findAllConcatenatedWordsInADict(String[] words) {

            List<String> result = new LinkedList<>();

            //build trie
            Trie trie = new Trie();
            for( String w : words){
                trie.insert(w);
            }

            //for each word verify if its made up of sub words
            for(String w : words){
                if(trie.verify(w,0,0)){
                    result.add(w);
                }
            }
            return result;
        }
    }

    class Trie{

        TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            TrieNode node = root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch , new TrieNode());
                node.childs.put(ch , next);
                node = next;
            }
            node.isWord = true;//no duplicate word so count is not needed
        }

        public boolean verify(String word ,int index, int count){
            TrieNode node = root;
            for(int i = index ; i < word.length() ; i++){
                char ch = word.charAt(i);
                if(!node.childs.containsKey(ch)) return false;
                TrieNode next = node.childs.getOrDefault(ch , new TrieNode());
                node = next;
                if(node.isWord){
                    if(i == word.length()-1){
                        // this is end of this word
                        return count >=1; // there was one word before and we reached the end. This is sub problem
                    }

                    //verify next word from here
                    if(verify(word,i+1,count+1)) return true;
                    //Continue to next character
                }
            }
            return false;
        }
    }

    class TrieNode{

        boolean isWord;
        String word;
        HashMap<Character,TrieNode> childs;

        public TrieNode(){
            childs = new HashMap<>();
        }
    }
}
