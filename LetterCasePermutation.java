package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCasePermutation {
    //https://leetcode.com/problems/letter-case-permutation/

    class Solution {

        // Optimized backtracking recursion with toUpperCase and toLowerCase
        public List<String> letterCasePermutation(String S) {
            if(S == null || S.length() == 0) return new LinkedList<>();
            List<String> result = new LinkedList<>();
            dfs(S,0,"",result);
            return result;
        }

        public void dfs(String str , int pos , String path, List<String> result){

            if(pos == str.length()){
                result.add(path);
                return ;
            }

            char ch = str.charAt(pos);
            pos++;
            if(Character.isAlphabetic(ch)){
                dfs(str,pos,path + Character.toUpperCase(ch),result);
                dfs(str,pos,path + Character.toLowerCase(ch),result);
            }else{
                dfs(str,pos,path + ch,result);
            }


        }
    }
}

/**

// Recursion  2^N with backtracking
class Solution {

    //a1b2 - > a,A -> a1,A1 -> a1b,a1B,A1b,A1B,
    public List<String> letterCasePermutation(String S) {
        if(S == null || S.length() == 0) return new LinkedList<>();

        List<String> result = new LinkedList<>();
        dfs(S,0,"",result);
        return result;
    }

    public void dfs(String str , int pos , String path, List<String> result){

        if(pos == str.length()){
            result.add(path);
            return;
        }

        char ch = str.charAt(pos);
        pos++;
        if(Character.isDigit(ch)){
            path = path+ ch;
            dfs(str,pos,path,result);
        }else{
            if(ch >= 'A' && ch <= 'Z'){
                String path1 = path+ ch;
                dfs(str,pos,path1,result);
                int val2 = ch -'A' + 'a';
                char ch2 = (char)val2;
                String path2 = path + ch2;
                dfs(str,pos, path2 ,result);
            }else{
                String path1 = path+ ch;
                dfs(str,pos,path1,result);
                int val2 = ch -'a' + 'A';
                char ch2 = (char)val2;
                String path2 = path + ch2;
                dfs(str,pos,path2 ,result);
            }
        }
    }
}

// Recursive 2^N * N
class Solution {

    public List<String> letterCasePermutation(String S) {
        List<String> list = new LinkedList<>();
        list.add("");
        for(int i = 0 ; i < S.length() ; i++){
            char ch = S.charAt(i);
            List<String> next = new LinkedList<>();
            for(String n : list){

                if(Character.isDigit(ch)){
                    String s1 = n + ch;
                    next.add(s1);
                }else{
                    String s1 = n + Character.toUpperCase(ch);
                    String s2 = n + Character.toLowerCase(ch);
                    next.add(s1);
                    next.add(s2);
                }
            }
            list = next;
        }

        return list;
    }
}

//Most optimized . less memory and backtracking
class Solution {

    public List<String> letterCasePermutation(String S) {
        if(S.length() == 0) return new ArrayList<>();

        List<String> list = new ArrayList<>();

        backtrack(list, S.toCharArray(), 0);
        return list;
    }

    public void backtrack(List<String> list, char[] letters, int pos){
        if(pos == letters.length) {
            list.add(new String(letters));
            return;
        }

        if(Character.isDigit(letters[pos])) {
            backtrack(list, letters, pos+1);
            return;
        }

        letters[pos] = Character.toUpperCase(letters[pos]);
        backtrack(list, letters, pos+1);

        letters[pos] = Character.toLowerCase(letters[pos]);
        backtrack(list, letters, pos+1);

    }
}
*/