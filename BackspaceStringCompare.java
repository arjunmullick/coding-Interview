package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BackspaceStringCompare {

    //https://leetcode.com/problems/backspace-string-compare/

    class Solution {

        /**
         * "ab##"
         * "c#d#"
         * <p>
         * or
         * <p>
         * "bxj##tw"
         * "bxo#j##tw"
         * Special case
         **/

        //Follow up: O(1) Space
        public boolean backspaceCompare(String S, String T) {
            int ns = S.length();
            int nt = T.length();
            int i = ns - 1;
            int j = nt - 1;

            while (true) {//cannot check i>=0 and j>=0 as both shoud finish
                int back = 0;
                while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                    if (S.charAt(i) == '#') {
                        back++;
                    } else {
                        back--;
                    }
                    i--;
                }

                back = 0;

                while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                    if (T.charAt(j) == '#') {
                        back++;
                    } else {
                        back--;
                    }
                    j--;
                }

                if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                    i--;
                    j--;
                } else {
                    break;
                }


            }
            //System.out.print(i + "" + j);
            return i == -1 && j == -1;//covered all index

        }
    }
}

/**
 //With Memory and use of List
    String sT = trasnform(S);
        String tT = trasnform(T);
            System.out.print(sT+" " + tT);
            return sT.equals(tT);


        public String trasnform(String s){
            int n = s.length();
            List<Character> ch = new LinkedList<>();
            for(char c : s.toCharArray()){
                if(c != '#'){
                    ch.add(c);
                }else{
                    if(ch.size() > 0)
                        ch.remove(ch.size()-1);
                }
            }
            return String.valueOf(ch);
        }
    }
 **/
