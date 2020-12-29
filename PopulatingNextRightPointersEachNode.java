package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersEachNode {
    //https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

    class Solution {
        public Node connect(Node root) {
            if(root == null) return null;

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while(queue.size() >0){
                LinkedList<Node> level = new LinkedList<>();
                while(queue.size() > 0){
                    Node node = queue.poll();
                    if(node.left != null) level.add(node.left);
                    if(node.right != null) level.add(node.right);
                }
                for(int i = 0 ; i < level.size() -1 ; i++){
                    Node n = level.get(i);
                    n.next = level.get(i+1);
                }
                queue = level;
            }
            return root;
        }
    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
