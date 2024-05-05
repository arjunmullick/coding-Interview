package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//root is the node with most child. 

public class MinimumHeightTrees {


    // Optimized Topological sort, start from leaf and reduce tree
    class Solution {

        public List<Integer> findMinHeightTrees(int n, int[][] edges) {

            LinkedList<Integer> result = new LinkedList<>();
            if(edges.length != n-1) return result;//not a tree

            //one or 2 nodes are both MHT's
            if(n <= 2){
                for(int i = 0 ; i < n ; i++){
                    result.add(i);
                }
                return result;
            }


            //Build adj list
            HashMap<Integer, HashSet<Integer>> adj = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                adj.put(i,new HashSet<>());//set so removal is easy
            }
            for(int[] edge : edges){
                int node1 = edge[0];
                int node2 = edge[1];
                HashSet<Integer> set1 = adj.get(node1);
                HashSet<Integer> set2 = adj.get(node2);
                set1.add(node2);
                set2.add(node1);
                adj.put(node1,set1);
                adj.put(node2,set2);
            }

            Queue<Integer> queueLeaf = new LinkedList<>();
            //inDegree == outDegree as bi-directional
            for(int i = 0 ; i < n ; i++){
                if(adj.get(i).size() == 1) queueLeaf.add(i);
            }

            LinkedList<Integer> nextLeaf = new LinkedList<>();
            while(queueLeaf.size() > 0){
                nextLeaf = new LinkedList<>();
                while(queueLeaf.size() > 0){
                    int node = queueLeaf.poll();
                    for(int next : adj.get(node)){
                        adj.get(next).remove(node);//remove leaf
                        if(adj.get(next).size() == 1) nextLeaf.add(next);
                    }
                    adj.remove(node);
                }
                if(nextLeaf.size() != 0)
                    result = new LinkedList<>(nextLeaf);//store last leaf level
                queueLeaf = nextLeaf;
            }

            return result;
        }

    }

    // Find height for each node by O(V * (V+E))
    class BruteForce {

        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> adj = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                adj.put(i,new ArrayList<>());
            }
            for(int[] edge : edges){
                int node1 = edge[0];
                int node2 = edge[1];
                List<Integer> list1 = adj.get(node1);
                List<Integer> list2 = adj.get(node2);
                list1.add(node2);
                list2.add(node1);
                adj.put(node1,list1);
                adj.put(node2,list2);
            }
            int min = n+1;
            int heightByRoot [] = new int[n];
            for(int i = 0 ; i < n ; i++){
                boolean[] visited = new boolean[n];
                int height = dfs(i,0,adj,visited);//i is root
                heightByRoot[i] = height;
                min = Math.min(height,min);
            }
            List<Integer> result = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                if(heightByRoot[i] == min) result.add(i);
            }
            return result;
        }

        public int dfs(int node , int depth, HashMap<Integer, List<Integer>> adj  , boolean[] visited){
            if(visited[node]) return depth;
            visited[node] = true;
            List<Integer> neighbours = adj.get(node);
            int max = depth;
            for(int next : neighbours){
                max = Math.max(dfs(next,depth+1 , adj,visited),max);
            }
            return max;
        }
    }
}
