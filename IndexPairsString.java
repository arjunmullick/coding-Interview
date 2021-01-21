/**
Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring text[i]…text[j] is in the list of words. 

Example 1:

Input: text = “thestoryofleetcodeandme”, words = [“story”,”fleet”,”leetcode”]
Output: [[3,7],[9,13],[10,17]]
Example 2:

Input: text = “ababa”, words = [“aba”,”ab”]
Output: [[0,1],[0,2],[2,3],[2,4]]
Explanation: 
Notice that matches can overlap, see “aba” is found in [0,2] and [2,4].
Note:

All strings contains only lowercase English letters.
It’s guaranteed that all strings in words are different.
1 <= text.length <= 100
1 <= words.length <= 20
1 <= words[i].length <= 50
Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties sort them by their second coordinate).

**/

package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class IndexPairsString {

    //https://leetcode.com/problems/index-pairs-of-a-string/
    class Solution {
        public int[][] indexPairs(String text, String[] words) {
            Trie trie = new Trie();

            for(String w : words){
                trie.insertword(w);
            }

            List<int[]> resultList = new LinkedList<>();

            int n = text.length();

            for(int i = 0 ; i < n ; i++){
                TrieNode node = trie.root;

                int j = i;

                while(j < n){
                    char ch = text.charAt(j);
                    if(node.childs.containsKey(ch)){
                        TrieNode child = node.childs.get(ch);
                        if(child.isWord){//we found a word starting at i and ending at j
                            resultList.add(new int[]{i,j});
                        }
                        node = child;
                        j++;
                    }else {
                        break; // if no more trie to traverse break and move to next work
                    }
                }
            }
            int [][] result = new int[resultList.size()][2];
            int count = 0;
            for(int[] pair : resultList){
                result[count] = pair;
                count++;
            }
            return result;
        }
    }

    class Trie{

        TrieNode root;

        public Trie(){
            root = new TrieNode();
            root.isWord = true;
            root.word = "";
        }

        public void insertword(String word){
            TrieNode node = this.root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
                node.childs.put(ch,next);
                node = next;// very important I forget !!!!
            }
            node.word = word;
            node.isWord = true;
        }

        public boolean contains(String word){
            TrieNode node = this.root;
            for(int i = 0 ; i < word.length() ; i++){
                char ch = word.charAt(i);
                if(node.childs.get(ch)== null)
                    return false;
                else
                    node = node.childs.get(ch);

            }
            if(node.isWord)
                return true;
            return false;
        }
    }

    class TrieNode{

        String word;
        boolean isWord;
        HashMap<Character,TrieNode> childs;

        public TrieNode(){
            childs = new HashMap<>();
        }

    }
}
