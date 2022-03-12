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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(queue.size() > 0){
            LinkedList<TreeNode> nextLevel = new LinkedList<>();
            List<Integer> level = new ArrayList<>();
            while(queue.size() > 0){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null) nextLevel.add(node.left);
                if(node.right != null) nextLevel.add(node.right);
            }
            result.add(level);
            queue = nextLevel;
        }
        
        return result;
    }
}
