/**


https://leetcode.com/problems/connecting-cities-with-minimum-cost/

Exmaple 
N = 4
connections = [[1,2,1],[1,3,2],[3,4,4],[1,4,3]]

**/
class Solution {
    public int minimumCost(int N, int[][] connections) {
        
        //sort by weight , min weight as first so to choose minimum path
        Arrays.sort(connections , (a,b) -> (a[2]-b[2]));
        //boolean visited[] = new boolean[N+1];
        UnionFind uf = new UnionFind(N+1);
        
        int totalCost = 0;
        for(int[] conn : connections){
            int a = conn[0];
            int b = conn[1];
            int w = conn[2];
            
            if(uf.merge(a,b)){
                totalCost+= w;
            }
        }
        
        for(int i = 2 ; i < N+1 ; i++){
            
            if(uf.find(i) != uf.find(i-1)) return -1;
        }
        
        return totalCost;
    }
}


class UnionFind{
    
    int [] parent;
    public  UnionFind(int n){
        parent = new int[n];
        for(int i = 0 ; i < n ; i++){
            parent[i] = i;
        }
    }
    
    //retrun parent 
    public int find(int a){
        
        while(parent[a] != a){
            a = parent[a];
        }
        return a;
        
    }
    
    public boolean merge(int a , int b){
        
        int parentA = find(a);
        int parentB = find(b);
        
        if(parentA == parentB) return false; // cant merge if part of same parent
        parent[parentA] = parentB;// important
        
        return true;
    }
    
    
    
    
}
