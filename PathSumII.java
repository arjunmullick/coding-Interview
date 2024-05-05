package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    //root-to-leaf paths where the sum of the node values in the path equals target sum.
    
    //https://leetcode.com/problems/path-sum-ii/
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> result = new ArrayList<>();
            dfs(root,new ArrayList<>(),0,sum,result);
            return result;
        }

        public void dfs(TreeNode node , List<Integer> path,int sum, int target, List<List<Integer>> result){
            if(node == null){
                return;
            }
            path.add(node.val);
            sum += node.val;//can have negative valuses so continue till leaf

            //this question explictly wants path to leaf
            if(sum == target && node.left == null && node.right == null){
                result.add(new ArrayList<>(path));//do not return , can have more in path + need to clear path temp list
            }
            dfs(node.left,path,sum,target,result);
            dfs(node.right,path,sum,target,result);
            path.remove(path.size()-1);
        }
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
