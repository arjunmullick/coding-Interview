//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

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
    
    TreeMap<Integer , List<int[]>> colMap; // Treemap to sort by col and int[] {val , pos} of row to help sort later
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        colMap = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(root,0,0));
        
        while(queue.size() > 0){
            Queue<Node> level = new LinkedList<>();
            while(queue.size() > 0){
                Node node = queue.poll();
                int r = node.row;
                int c = node.col;
                TreeNode n = node.node;
                List<int[]> list = colMap.getOrDefault(c,new ArrayList<>());
                list.add(new int[]{n.val,r});
                colMap.put(c,list);
                
                if(n.left != null){
                    queue.offer(new Node(n.left,r+1,c-1));
                }
                if(n.right != null){
                    queue.offer(new Node(n.right,r+1,c+1));
                }
            }
            queue = level;
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        
        for(int i : colMap.keySet()){
            List<int[]> list = colMap.get(i);
            
            Collections.sort(list,(a,b)->((a[1] == b[1])? a[0]-b[0] : a[1]-b[1])); // if same row then sort by val
            List<Integer> r = new ArrayList<>();
            for(int[] arr : list){
                r.add(arr[0]);
            }
            result.add(r);
        }
        
        return result;
    }
}

class Node{
    TreeNode node;
    int row;
    int col;
    
    public Node(TreeNode node, int row , int col){
        this.node = node;
        this.col = col;
        this.row = row;
    }
}
