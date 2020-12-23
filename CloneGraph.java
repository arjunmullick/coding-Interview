package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {

    //O(V+E)
    class Solution {
        public Node cloneGraph(Node node) {
            if(node == null) return null;
            HashMap<Node,Node> visited = new HashMap<>();//keeps map to return copy
            return dfs(node,visited);
        }

        public Node dfs(Node node, HashMap<Node,Node> visited){
            if(visited.containsKey(node)) return visited.get(node);

            Node copy = new Node(node.val);
            visited.put(node,copy);
            List<Node> neighbors = node.neighbors;
            List<Node> neighborsCopy  = new ArrayList<Node>();
            for(Node next : neighbors){
                neighborsCopy.add(dfs(next,visited));
            }
            copy.neighbors = neighborsCopy;

            return copy;

        }
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
