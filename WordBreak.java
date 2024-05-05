package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    //https://leetcode.com/problems/word-break/
    /**
    Example 1:
    Input: s = "leetcode", wordDict = ["leet","code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".
    
    Example 2:
    Input: s = "applepenapple", wordDict = ["apple","pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    Note that you are allowed to reuse a dictionary word.
    
    Example 3:
    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: false
    **/
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<>();
            for(String wrd : wordDict){
                set.add(wrd);
            }
            set.add("");
            HashMap<Integer,Boolean> memo = new HashMap<>();

            return wordBreakHelper(0,s,set,memo);

        }

        public boolean wordBreakHelper(int start, String s ,HashSet<String> set,HashMap<Integer,Boolean> memo) {

            if(memo.containsKey(start)){
                return memo.get(start);
            }

            if(start == s.length()) return true;


            for(int i = start ; i < s.length() ; i++){
                String str = s.substring(start,i+1);

                if(set.contains(str) && wordBreakHelper(i+1,s,set,memo)){
                    //System.out.println(str + " true");
                    memo.put(i,true);
                    return true;
                }
            }
            memo.put(start,false);
            return false;
        }
    }
}

/**
 * ALTERNATE APPROACH SIMILAR TO https://leetcode.com/problems/concatenated-words/
 * TLE because of leetcode heavy case. Insert operation tradeoff
 *
 * Passe test case
 * "catsanddogs"
 * ["cats","dogs","and","cat","dog"]
 */
class SolutionTLE {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();
        for(String w : wordDict){
            trie.insert(w);//is a word check  and for prefix
        }
        return trie.verify(s,0);
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
            TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
            node.childs.put(ch , next);
            node = next;
        }
        node.isWord = true;
        node.word = word;
    }

    public boolean verify(String word, int pos){
        TrieNode node = root;
        for(int i = pos ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(!node.childs.containsKey(ch)) return false;
            TrieNode next = node.childs.get(ch);
            node.childs.put(ch , next);
            node = next;
            if(node.isWord){
                //found one sub word
                if(i == word.length() -1) return true;

                if(verify(word,i+1)) return true;
            }
        }
        return node.isWord && word.equals(node.word);

    }
}

class TrieNode{
    boolean isWord;
    HashMap<Character,TrieNode> childs;
    String word = "";

    public TrieNode(){
        childs = new HashMap<>();
    }
}


