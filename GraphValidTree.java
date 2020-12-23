package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphValidTree {


    class SolutionBFS {
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
}
