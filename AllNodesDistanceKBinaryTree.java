package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AllNodesDistanceKBinaryTree {

    //https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
    class Solution {

        int K;
        TreeNode target;
        HashMap<TreeNode,TreeNode> mapParent;
        HashSet<TreeNode> visited;
        List<Integer> result;


        public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
            this.K = K;
            result = new LinkedList<>();
            mapParent = new HashMap<>();
            visited = new HashSet<>();

            //Prepare Graph parent
            storeParent(root.left,root);
            storeParent(root.right,root);

            find(target,0);
            return result;
        }

        public void storeParent(TreeNode node,TreeNode parent){
            if(node == null) return;
            mapParent.put(node,parent);
            storeParent(node.left,node);
            storeParent(node.right,node);
        }

        public void dfsDown(TreeNode node , int depth){
            if(node == null)
                return;

            if(visited.contains(node))
                return;

            visited.add(node);
            if(depth == this.K){
                result.add(node.val);
            }
            dfsDown(node.left,depth+1);
            dfsDown(node.right,depth+1);
        }

        public void find(TreeNode node, int distance){
            if(distance > K)
                return;

            if(node == null)
                return;

            if(visited.contains(node))
                return;

            dfsDown(node,distance);

            if(distance == K){
                // no need to find more
                // dont add as dfsDown must have already added it 
                return;
            }

            visited.add(node);//so next find do not visit this node
            if(mapParent.containsKey(node)){
                TreeNode parent = mapParent.get(node);
                find(parent,distance+1);
            }
        }
    }


    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
