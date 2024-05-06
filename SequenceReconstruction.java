//https://leetcode.com/problems/sequence-reconstruction/submissions/
/**
Example 1:

Input:
org: [1,2,3], seqs: [[1,2],[1,3]]

Output:
false

Explanation:
[1,2,3] is not the only one sequence that can be reconstructed, because [1,3,2] is also a valid sequence that can be reconstructed.
Example 2:

Input:
org: [1,2,3], seqs: [[1,2]]

Output:
false

Explanation:
The reconstructed sequence can only be [1,2].
Example 3:

Input:
org: [1,2,3], seqs: [[1,2],[1,3],[2,3]]

Output:
true

Explanation:
The sequences [1,2], [1,3], and [2,3] can uniquely reconstruct the original sequence [1,2,3].
Example 4:

Input:
org: [4,1,5,2,6,3], seqs: [[5,2,6,3],[4,1,5,2]]

Output:
true
**/
class Solution {
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        if(org.length == 0 && seqs.size() == 0) return true;
        if(org.length == 0 || seqs.size() == 0) return false;
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        HashMap<Integer,Integer> inDegree = new HashMap<>();
        
        for(int n : org){
            adj.put(n,new LinkedList<>());
            inDegree.put(n,0);
        }
        
        for(List<Integer> seq : seqs){
            if(seq.size() == 1){
                 int node1 = seq.get(0);
                 if(!inDegree.containsKey(node1)) return false;
            }
            for(int i = 1 ; i < seq.size() ; i ++){
                int node1 = seq.get(i-1);
                int node2 = seq.get(i);
                if(adj.get(node1) == null) return false; // bakwas edge case 
                List<Integer> list = adj.get(node1);
                list.add(node2);
                adj.put(node1 , list);
                if(inDegree.get(node2) == null) return false; // bakwas edge case 
                inDegree.put(node2 ,inDegree.get(node2)+1);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int n : org){
            if(inDegree.get(n) == 0){
                queue.offer(n);
            }
        }
        List<Integer> orderList = new LinkedList<>();
        while(queue.size() > 0){
            if(queue.size() > 1) return false;
            int node = queue.poll();
            orderList.add(node);
            for(int next : adj.get(node)){
                inDegree.put(next , inDegree.get(next) -1);
                if(inDegree.get(next) == 0) 
                    queue.offer(next);
            }
        }
        if(orderList.size() !=org.length) return false;
        for(int i=0 ; i< org.length ; i++){
            if(org[i] != orderList.get(i)) return false;
        }
        return true;
    }
}
