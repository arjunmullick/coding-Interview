package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordSquares {

    /**
     * Add a row in square and search on last added top down or left to right prefix to see next possible strings to add. 
     * Backtrack at each branch
     * 
     * | w  | a  | l  | l* |
     * | a  | r  | e  | a* |
     * | l  | e  | a  | d* |
     * | l* | a* | d* | y  |
     * 
     */

    //https://leetcode.com/problems/word-squares/
    class Solution {
        public List<List<String>> wordSquares(String[] words) {
            List<List<String>> result = new LinkedList<>();
            if(words == null || words.length == 0 || words[0] == null || words[0].length() == 0) return result;

            Trie trie = new Trie();
            for(String w : words){
                trie.insert(w);
            }

            for(int i = 0 ; i < words.length ; i++){
                List<String> square = new LinkedList<>();
                square.add(words[i]);
                backtrack(trie,square,words,result);// add first row of square / all possibility
                square.remove(square.size()-1);
            }
            return result;
        }


        public void backtrack(Trie trie, List<String> square, String[] words, List<List<String>> result){
            if(square.size() == words[0].length()){
                //added all words successfully in square.
                result.add(new ArrayList<>(square));
                return;
            }

            int pos = square.size();//no of words added
            int len = words[0].length();//max len of word
            String prefix = "";
            for(String s : square){
                prefix = prefix + s.charAt(pos); // top down and left to right string formed
            }
            if(trie.existPrefix(prefix)){
                List<String> next = trie.getAllPrefix(prefix);
                for(String n : next){
                    square.add(n);
                    backtrack(trie,square,words,result);
                    square.remove(square.size()-1);
                }
            }else{
                return;
            }
        }
    }

//create a prefix search Trie

    class Trie{
        TrieNode root;

        public Trie(){
            this.root = new TrieNode();
        }

        public void insert(String s){
            TrieNode node = root;
            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch, new TrieNode());
                node.childs.put(ch,next);
                node.words.add(s);
                node = next;
            }
            node.isWord = true;
        }

        public boolean exist(String s){
            TrieNode node = root;
            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                if(node.childs.get(ch) == null) return false;
                TrieNode next = node.childs.get(ch);
                node = next;
            }
            return node.isWord;
        }

        public boolean existPrefix(String s){
            TrieNode node = root;
            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                if(node.childs.get(ch) == null) return false;
                TrieNode next = node.childs.get(ch);
                node = next;
            }
            return true;
        }

        public List<String> getAllPrefix(String s){
            TrieNode node = root;
            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                if(node.childs.get(ch) == null) return new ArrayList<>();
                TrieNode next = node.childs.get(ch);
                node = next;
            }
            return node.words;
        }
    }

    class TrieNode{

        HashMap<Character,TrieNode> childs;
        Character ch;
        boolean isWord;
        List<String> words;

        public TrieNode(){
            this.childs = new HashMap<>();
            words = new ArrayList<>();
        }
    }
}