package com.leetcode;

public class FindSmallestLetterGreaterThanTarget {

    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int n = letters.length;
            int l = 0;
            int r = n -1;
            int t = target;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(letters[mid] > t){
                    r = mid -1;
                }else{
                    l = mid+1;//increase even if equal;
                }
            }

            int next = l; // this is last match + 1
            if(next>= 0 && next < n && letters[next] != t) return letters[next];
            return letters[0];
        }
    }

/**
 * //inverted condition
 * class Solution {
 *     public char nextGreatestLetter(char[] letters, char target) {
 *         int n = letters.length;
 *         int l = 0;
 *         int r = n-1;
 *
 *         while(l<=r){
 *             int mid = l + (r-l)/2;
 *             char ch = letters[mid];
 *             if(ch <= target){//even equal then increase ["e","e","e","e","e","e","n","n","n","n"] and search 'e'
 *                 l = mid+1;
 *             }else{
 *                 //if greater
 *                 r = mid-1;
 *             }
 *         }
 *
 *         if(l>=0 && l<= n-1) return letters[l];
 *         return letters[0];
 *     }
 * }

 //---
 * using first match binary search
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l = 0;
        int r = n -1;
        int t = target;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(letters[mid] < t){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }

        int match = r == n-1 ? 0: r+1; // first matching character if exist else a character just < target
        // find last match
        while(match < n && letters[match] == t){
            match++;
        }
        if(match < n)
            return letters[match];// match is last match +1
        else
            return letters[0];
    }


 **/


}
