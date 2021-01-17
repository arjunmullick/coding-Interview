package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeDeserializeBinaryTree {

    //https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            String result = "";
            if(root == null){
                return "null";
            }
            return Integer.toString(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String [] arr = data.split(",");
            List<String> list = new LinkedList<String>(Arrays.asList(arr));
            TreeNode root = helper(list);
            return root;
        }

        private TreeNode helper(List<String> list){
            if(list.size() == 0){
                return null;
            }
            String val = list.remove(0);
            if(val.equalsIgnoreCase("null")){
                return null;
            }
            TreeNode next = new TreeNode(Integer.valueOf(val));
            next.left = helper(list);
            next.right = helper(list);
            return next;
        }
    }
    /**
     * Definition for a binary tree node.
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
