//https://leetcode.com/problems/range-sum-of-bst/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int sum;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        
        if(root == null) return sum;
        
        rangeSumHelper(root,low,high);
        return sum;
    }
    
    public void rangeSumHelper(TreeNode node, int low, int high){
        if(node == null) return;
        
        int val = node.val;
        if(node.val >= low && node.val <= high){
            sum+=val;
        }
        
        if(val >= low){
            rangeSumHelper(node.left,low,high);
        }
        
        if(val <= high){
           rangeSumHelper(node.right,low,high);
        }
        
        
    }
}
