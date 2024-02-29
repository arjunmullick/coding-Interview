package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    //https://leetcode.com/problems/fruit-into-baskets
    class Solution {
        // This is Longest Subarray with 2 Elements
        //You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.
        //starting at any type of tree find maz fruit can be collected

        public int totalFruit(int[] tree) {
            Map<Integer, Integer> count = new HashMap<>();
            int max = 0;
            int l = 0;
            int r = 0;
            int n = tree.length;
            while(l < n && r < n) {
                count.put(tree[r], count.getOrDefault(tree[r], 0) + 1);
                while(count.size() > 2) {
                    count.put(tree[l], count.get(tree[l]) - 1);
                    count.remove(tree[l++], 0); // remove(Object key, Object value) - Removes the entry for the specified key only if it is currently mapped to the specified value.
                }
                r++;
                max = Math.max(max,r-l);

            }
            return max;
        }
    }


    //Alternatively we dont need a left pointer to traverse till all tree[l] are removed
    class Solution2 {

        public int totalFruit(int[] tree) {
            Map<Integer, Integer> count = new HashMap<>();
            int l = 0;
            int r = 0;
            int n = tree.length;
            while(l < n && r < n) {
                count.put(tree[r], count.getOrDefault(tree[r], 0) + 1);
                if(count.size() > 2) {//max is just difference of r and l
                    count.put(tree[l], count.get(tree[l]) - 1);
                    count.remove(tree[l++], 0); //remove when match
                }
                r++;
            }
            return r-l;
        }
    }
}
