package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphValidTree {

    /*
     One graph theory optimization on DFS and BFS below is if(edges.length != n-1) return false;
     then check its connected by count visited == n
     */

    class SolutionBFS {

        //Because its un-directional store parent for cyclic check
        public boolean validTree(int n, int[][] edges) {
            //in BFS if we visit all node and no cyclic in graph its a tree.
            //check all nodes are part of tree
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            HashMap<Integer,Integer> parent = new HashMap<>();
            for(int[] edge : edges){
                List<Integer> l1 = map.getOrDefault(edge[0],new ArrayList<>());
                l1.add(edge[1]);
                map.put(edge[0],l1);
                List<Integer> l2 = map.getOrDefault(edge[1],new ArrayList<>());
                l2.add(edge[0]);
                map.put(edge[1],l2);
            }

            Queue<Integer> queue = new LinkedList<>();
            boolean [] visited = new boolean[n];
            queue.offer(0);
            while(queue.size() > 0){
                int node = queue.poll();
                visited[node] = true;
                List<Integer> childs = map.getOrDefault(node, new ArrayList<>());//to not give null pointer
                for(int next : childs){
                    if(!visited[next]){
                        queue.offer(next);
                        parent.put(next,node);
                    }else if(parent.get(node) != next){//To ensure a node has only one parent .  Check the node parent is market as child then then its ok 0-1 , 1-0 because of undirected
                        return false;//cyclic
                    }
                }

            }
            // All visited
            for(boolean e : visited){
                if(!e) return false;
            }

            return true;

        }
    }


    class SolutionDFS {

        //DFS
        public boolean validTree(int n, int[][] edges) {
            //in BFS if we visit all node and no cyclic in graph its a tree.
            //check all nodes are part of tree
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            HashMap<Integer,Integer> parent = new HashMap<>();
            for(int[] edge : edges){
                List<Integer> l1 = map.getOrDefault(edge[0],new ArrayList<>());
                l1.add(edge[1]);
                map.put(edge[0],l1);
                List<Integer> l2 = map.getOrDefault(edge[1],new ArrayList<>());
                l2.add(edge[0]);
                map.put(edge[1],l2);
            }

            Stack<Integer> stack = new Stack<>();
            boolean [] visited = new boolean[n];
            stack.push(0);
            while(stack.size() > 0){
                int node = stack.pop();
                visited[node] = true;
                List<Integer> childs = map.getOrDefault(node, new ArrayList<>());//to not give null pointer
                for(int next : childs){
                    if(!visited[next]){
                        stack.push(next);
                        parent.put(next,node);
                    }else if(parent.get(node) != next){//check the node parent is market as child then then its ok 0-1 , 1-0 because of undirected
                        return false;//cyclic
                    }
                }

            }
            // All visited
            for(boolean e : visited){
                if(!e) return false;
            }

            return true;

        }
    }
    //O(N)
    class SolutionDFSOptimized {

        //DFS/ BFS optimized
        public boolean validTree(int n, int[][] edges) {

            if(edges.length != n-1) return false;

            //in BFS if we visit all node and no cyclic in graph its a tree.
            //check all nodes are part of tree
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for(int[] edge : edges){
                List<Integer> l1 = map.getOrDefault(edge[0],new ArrayList<>());
                l1.add(edge[1]);
                map.put(edge[0],l1);
                List<Integer> l2 = map.getOrDefault(edge[1],new ArrayList<>());
                l2.add(edge[0]);
                map.put(edge[1],l2);
            }

            Stack<Integer> stack = new Stack<>();
            boolean [] visited = new boolean[n];
            stack.push(0);
            while(stack.size() > 0){
                int node = stack.pop();
                visited[node] = true;
                List<Integer> childs = map.getOrDefault(node, new ArrayList<>());//to not give null pointer
                for(int next : childs){
                    if(!visited[next]){
                        stack.push(next);
                    }
                }

            }
            // All visited
            for(boolean e : visited){
                if(!e) return false;
            }

            return true;

        }
    }
    //O(N) to verify . 

    // Complexity
/** 
    Time to build graph : O(nlog(n))
        Space: O(n) parent and size array
        n: the total number of nodes in the given graph
        
        Find operation
        Time: O(log(n)) log(n) is the height of the tree
        Space: O(1)
        Union operation
        Time: O(1)
        Space: O(1)
**/
    class SolutionUnionFind {
        public boolean validTree(int n, int[][] edges) {

            if(edges.length != n -1) return false;

            UnionFind unionFind = new UnionFind(n);

            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];
                if(!unionFind.union(a,b)){
                    return false;
                }
            }

            // If we are successfully able to merge all edges then no cycle
            return true;

        }

        class UnionFind{
            int[] parent;

            public UnionFind(int n){
                parent = new int[n];
                for(int i = 0 ; i < n ; i++){
                    parent[i] = i;//n disjoint sets with each node parent to self
                }
            }

            //find and merge the set
            public int find(int node){
                while(parent[node] != node){
                    node = parent[node];
                }
                return node;//trace the parent
            }

            public boolean union(int a , int b){
                int parentA = find(a);
                int parentB = find(b);
                //if same set already
                if(parentA == parentB){
                    return false;
                }
                //merge
                parent[parentA] = parentB;
                return true;
            }
        }
    }

}
