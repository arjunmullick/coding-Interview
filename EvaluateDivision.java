/* 
//create graph as a/b = 2 means node a and node b are connected with a->b = 2 and b->a = .5
// Remember to Do Backtraking DFS. Terminate search once dound
// Why backtrack - when searching from a node clear after all DFS to child so that other siblings to this node can use it to reach other node
Make sure 
*/


class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        if(equations == null) return null;
        
        int n = equations.size();
        
        if(n == 0 ) return null;
        if(n != values.length) return null;
        
        //create graph as a/b = 2 means node a and node b are connected with a->b = 2 and b->a = .5
        HashMap<String , List<String>> adj = new HashMap<>();
        HashMap<String,Double> weight = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            List<String> eq = equations.get(i);
            String node1 = eq.get(0);
            String node2 = eq.get(1);
            List<String> to = adj.getOrDefault(node1,new LinkedList<>());
            List<String> from = adj.getOrDefault(node2,new LinkedList<>());
            to.add(node2);
            from.add(node1);
            
            adj.put(node1,to);
            adj.put(node2,from);
            
            double value = values[i];
            
            weight.put(node1+","+node2, value);
            weight.put(node2+","+node1, (double)(1/value));
        }
        
        double[] result = new double[queries.size()];
        for(int c = 0 ; c < queries.size(); c++){
            List<String> query = queries.get(c);
            double val = -1.0;
            
            String start = query.get(0);
            String target = query.get(1);
            
            /* 
            if(weight.containsKey(start+","+target)){
                val = weight.get(start+","+target);
                result[c] = val;
                continue;
            }
            */
            
            //else do dfs and add computed weight to weights
            //make sure query is part of graph
            if(adj.containsKey(target) && adj.containsKey(start)){
                HashSet<String> seen = new HashSet<>();
                val = dfs(start,target,adj,weight,1.0,seen);
            }
            //weight.put(start+","+target , val); // optimization
            result[c] = val;
        }
        
        /*
        System.out.println(adj);
        System.out.println("-----");
        for(String key : weight.keySet()){
             System.out.println(key + "=" + weight.get(key));
        }
       */
        
        return result;   
    }
    
    
    public double dfs(String node , String target , HashMap<String , List<String>> adj , HashMap<String,Double> weight , double multiply , HashSet<String> seen){
        seen.add(node);
        if(node == target){
            return multiply;
        } 
        
        /* if(!adj.containsKey(node)){
            return -1.0;
        }*/
        
        if(weight.containsKey(node+","+target)){
                return weight.get(node+","+target) * multiply;
        }
        
        double val = -1;
        List<String> list = adj.get(node);
        for(String next : list){
            double wg = weight.get(node+","+next);
            if(!seen.contains(next)){
                val = dfs(next,target,adj,weight,wg*multiply,seen);
                if(val != -1) {
                    break;// VVV important . Will need to terminate earch once found a solution
                }
            }
        }
        // unmark the visit, for the next backtracking
        seen.remove(node);
        return val;
    }
}
