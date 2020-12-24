package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfConnectedComponentsUndirectedGraph {
    //https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/

    class SolutionDFS{
        //DFS
        public int countComponents(int n, int[][] edges) {
            boolean visited[] = new boolean[n];

            HashMap<Integer, List<Integer>> adj = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                adj.put(i,new ArrayList<>());//safe option to avoid null pointer if no edge is present
            }
            for(int[] edge : edges){
                int n1 = edge[0];
                int n2 = edge[1];
                List<Integer>l1 = adj.getOrDefault(n1 , new ArrayList<>());
                List<Integer>l2 = adj.getOrDefault(n2 , new ArrayList<>());
                l1.add(n2);
                l2.add(n1);
            }

            int component = 0;
            for(int i = 0 ; i < n ; i++){
                if(dfs(i,adj,visited)){
                    component++;
                }
            }

            return component;
        }

        public boolean dfs(int node , HashMap<Integer, List<Integer>> adj,  boolean [] visited){
            if(visited[node]) return false;//already visited so not a new component
            visited[node] = true;
            List<Integer> neighbour = adj.get(node);
            for(int n : neighbour){
                dfs(n,adj,visited);
            }
            return true;
        }
    }


    class SolutionBFS {
        //BFS - DFS is slightly better
        public int countComponents(int n, int[][] edges) {
            boolean visited[] = new boolean[n];

            HashMap<Integer, List<Integer>> adj = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                adj.put(i,new ArrayList<>());//safe option to avoid null pointer if no edge is present
            }
            for(int[] edge : edges){
                int n1 = edge[0];
                int n2 = edge[1];
                List<Integer>l1 = adj.getOrDefault(n1 , new ArrayList<>());
                List<Integer>l2 = adj.getOrDefault(n2 , new ArrayList<>());
                l1.add(n2);
                l2.add(n1);
            }

            int component = 0;
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0 ; i < n ; i++){
                if(visited[i]) continue;
                component++;
                queue.offer(i);
                while(queue.size() > 0){
                    int node = queue.poll();
                    if(visited[node]) continue;
                    List<Integer> neighbour = adj.get(node);
                    visited[node] = true;
                    queue.addAll(neighbour);
                }
            }

            return component;
        }
    }


    //O(N)
    class Solution {
        //UnionFind
        public int countComponents(int n, int[][] edges) {
            int count = 0;
            UnionFind unionFind = new UnionFind(n);
            for(int[] edge : edges){
                int node1 = edge[0];
                int node2 = edge[1];
                if(unionFind.union(node1,node2)){
                    count++;//a union operation
                }
            }
            //n-1 connection means fully connected
            return n - count;
        }
    }



    class UnionFind {
        int [] parent;

        public UnionFind(int n){
            parent = new int[n];
            for(int i = 0 ; i < n ; i++){
                parent[i] = i;//all new set
            }
        }

        //find parent and update
        public int find(int node){
            while(parent[node] != node){
                node = parent[node];
            }
            return node;
        }

        public boolean union(int a , int b){
            int parentA = find(a);
            int parentB = find(b);

            if(parentA == parentB){
                return false;//no merge needed, same set
            }

            //merge
            parent[parentA] = parentB;
            return true;//we merged

        }
    }
}
