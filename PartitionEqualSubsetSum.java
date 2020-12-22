package com.leetcode;

import java.util.HashMap;

public class PartitionEqualSubsetSum {
    /*
      In the worst case where there is no overlapping calculation,
      the maximum number of entries in the memo would be N * M where M is total sum / 2 and N is no of elements
     */
    //https://leetcode.com/problems/partition-equal-subset-sum/

    //map compare heavy
    class SolutionTLE {

        /**
         - Given total sum is even number find a subset whose sum - total/2 so other subset will be total/2 as well
         **/
        public boolean canPartition(int[] nums) {

            HashMap<Node,Boolean> memo = new HashMap<>();//memo to store at n and sum Pair has value computed

            int totalSum = 0;

            // find sum of all array elements
            for (int num : nums) {
                totalSum += num;
            }

            // if totalSum is odd,it cannot be partitioned into equal sum subset
            if (totalSum % 2 != 0) return false;
            int half = totalSum / 2;
            int n = nums.length;
            return canPartitionRec(nums, n - 1, half,memo);
        }

        public boolean canPartitionRec(int[] nums, int n, int subSetSum,  HashMap<Node,Boolean> memo) {
            // Base Cases
            if (subSetSum == 0)
                return true;
            if (n == 0 || subSetSum < 0)
                return false;
            Node node = new Node(n,subSetSum);
            if(memo.containsKey(node)) return memo.get(node);
            //choose or not to choose
            boolean result =  canPartitionRec(nums, n - 1, subSetSum - nums[n - 1],memo) || canPartitionRec(nums, n - 1, subSetSum,memo);
            memo.put(node,result);
            return result;
        }

        class Node{
            int n;
            int sum;
            public Node(int n , int sum){
                this.n = n;
                this.sum = sum;
            }

            public boolean equals(Node n , Node m){
                if(n.n != m.n || n.sum != m.sum) return false;
                return true;
            }
        }
    }


    class Solution {
        public boolean canPartition(int[] nums) {
            int totalSum = 0;
            // find sum of all array elements
            for (int num : nums) {
                totalSum += num;
            }
            // if totalSum is odd, it cannot be partitioned into equal sum subset
            if (totalSum % 2 != 0) return false;
            int subSetSum = totalSum / 2;
            int n = nums.length;
            Boolean[][] memo = new Boolean[n + 1][subSetSum + 1];
            return dfs(nums, n - 1, subSetSum, memo);
        }

        public boolean dfs(int[] nums, int n, int subSetSum, Boolean[][] memo) {
            // Base Cases
            if (subSetSum == 0)
                return true;
            if (n == 0 || subSetSum < 0)
                return false;
            // check if subSetSum for given n is already computed and stored in memo
            if (memo[n][subSetSum] != null)
                return memo[n][subSetSum];
            boolean result = dfs(nums, n - 1, subSetSum - nums[n - 1], memo) ||
                    dfs(nums, n - 1, subSetSum, memo);
            // store the result in memo
            memo[n][subSetSum] = result;
            return result;
        }
    }
}
