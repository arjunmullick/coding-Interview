//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(queue.size() >0){
            LinkedList<Node> level = new LinkedList<>();
            while(queue.size() > 0){
                Node node = queue.poll();
                if(queue.size() > 0){
                    node.next = queue.peek();
                }
                if(node.left != null) level.add(node.left);
                if(node.right != null) level.add(node.right);
            }
            //for(int i = 0 ; i < level.size() -1 ; i++){
            //    Node n = level.get(i);
            //    n.next = level.get(i+1);
            //}
            queue = level;
        }
        return root;
    }
}
