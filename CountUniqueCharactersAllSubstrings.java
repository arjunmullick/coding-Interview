package com.leetcode;

public class CountUniqueCharactersAllSubstrings {

    //https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
    /*             ""
                A.   B.    C  - N
              AB.  BC.       - N-1
              ABC            - 1

              depth = 1+2+3+N = N(N-1)/2
               N(N-1)/2 * N * 128 ~ O(N^3)
    */
    class SolutionTLE {
        int n;
        int result = 0;
        public int uniqueLetterString(String s) {
            n = s.length();
            for(int i = 0 ; i < n ; i++){
                dfs(s,i,"");
            }
            return result;
        }

        public void dfs(String s , int pos , String str){
            if(pos == n) return;
            str = str + s.charAt(pos);
            result = result + unique(str) ;
            dfs(s,pos+1,str);
        }

        public int unique(String str){
            int count = 0;
            int[] charExist = new int[128];
            for(char c : str.toCharArray()){
                charExist[c]++;
            }

            for(int i = 0 ; i < 128 ; i++){
                if(charExist[i] == 1){
                    count++;
                }
            }
            return count;
        }
    }
}
