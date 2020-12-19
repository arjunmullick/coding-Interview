package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DesignSearchAutocompleteSystem {

    class AutocompleteSystem {
        Trie trie;
        String str; // sentance user is typing
        List<String> result;

        public AutocompleteSystem(String[] sentences, int[] times) {
            this.trie = new Trie();
            result = new LinkedList<>();
            str = "";
            for(int i = 0 ; i < sentences.length ; i++){
                trie.insert(sentences[i],times[i]);
            }
        }

        public List<String> input(char c) {

            //string end record the string before # and return result
            if(c == '#'){
                trie.insert(str);
                str = "";
                //return result
            }

            //this is a bad string do not record
            if(!Character.isAlphabetic(c) && c != ' '){
                str = "";
                return new LinkedList<>();
            }

            str = str + c;
            // no suggestions
            if(!trie.contains(str))
                return new LinkedList<>();

            return trie.top3HotWords(str);
        }
    }

    class Trie{

        TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        //for initial insert by weight
        public void insert(String word, int weight){
            TrieNode node = this.root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node.childs.put(ch , next);
                node = next;
            }
            node.isWord = true;
            node.word = word;
            node.weight = weight;
        }

        //insert to update a historical count - mostly copy of above
        public void insert(String word){
            TrieNode node = this.root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node.childs.put(ch , next);
                node = next;
            }
            node.isWord = true;
            node.word = word;
            node.weight = node.weight+1;
        }

        //contains prefix
        public boolean contains(String prefix){
            TrieNode node = this.root;
            for(int i = 0 ; i < prefix.length() ; i++){
                char ch = prefix.charAt(i);
                if(!node.childs.containsKey(ch)) return false;
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node = next;
            }
            return true;
        }

        //
        public List<String> top3HotWords(String prefix){
            if(!contains(prefix)) return new LinkedList<>();
            TrieNode node = this.root;
            for(int i = 0 ; i < prefix.length() ; i++){
                char ch = prefix.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node = next;
            }
            //get all words starting at node
            //search all string with prefix and keep them in min Heap for size 3
            PriorityQueue<PQNode> minHeap = new PriorityQueue<>((a, b) -> (compare(a,b)));
            Queue<TrieNode> queue = new LinkedList<>();
            queue.offer(node);//starting root is node
            while(queue.size() >0){
                Queue<TrieNode> level = new LinkedList<>();
                while(queue.size() >0){
                    node = queue.poll();
                    if(node.isWord)
                        minHeap.add(new PQNode(node.word,node.weight));
                    if(minHeap.size() > 3)
                        minHeap.poll();
                    for(TrieNode child : node.childs.values()){
                        level.offer(child);
                    }
                }
                queue = level;
            }

            List<String> result = new LinkedList<>();
            while(minHeap.size() > 0){
                PQNode n = minHeap.peek();
                result.add(0,n.word);
                minHeap.poll();
            }
            return result;
        }

        private int compare(PQNode a, PQNode b){
            int diff = (a.count - b.count);
            if(diff != 0) return diff;
            return b.word.compareTo(a.word);//lexi order if count equal

        }

    }

    class TrieNode{

        String word;
        boolean isWord;
        int weight;
        HashMap<Character,TrieNode> childs;

        public TrieNode(){
            childs = new HashMap<>();
            word = "";
        }
    }

    class PQNode{
        String word;
        int count;

        public PQNode(String word , int count){
            this.word = word;
            this.count = count;
        }
    }




/**
 * Your AutocompleteSystem object will be instantiated and called as such:
 * AutocompleteSystem obj = new AutocompleteSystem(sentences, times);
 * List<String> param_1 = obj.input(c);
 */
}
