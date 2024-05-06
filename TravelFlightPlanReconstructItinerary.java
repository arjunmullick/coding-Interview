/**

https://leetcode.com/problems/reconstruct-itinerary/description/

You are given a list of airline tickets where tickets[i] = [fromi, toi] represent the departure and the arrival airports of one flight. Reconstruct the itinerary in order and return it.

All of the tickets belong to a man who departs from "JFK", thus, the itinerary must begin with "JFK". If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.

For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
You may assume all tickets form at least one valid itinerary. You must use all the tickets once and only once.

 

Example 1:


Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
Output: ["JFK","MUC","LHR","SFO","SJC"]


**/


class Solution {

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> adj = new HashMap<>();
        int totalEdge = tickets.size();
        //build graph
        for(List<String> t : tickets){
            String s = t.get(0);
            String d = t.get(1);
            PriorityQueue<String> child;
            if(adj.get(s) == null){
                child = new PriorityQueue<>();
            }else{
                child = adj.get(s);
            }
            child.add(d);
            adj.put(s,child);  
        }    
        
        ArrayList<String> result = new ArrayList<>();
        dfs("JFK" , adj , result); 
        return result;
    }
    
    public void dfs(String source , Map<String,PriorityQueue<String>> adj ,  ArrayList<String> result){
        //System.out.println(source +" - "+adj);
        PriorityQueue<String> child = adj.get(source);//orignal
        while(child!= null && child.size() != 0){
            String next = child.poll();
            //String next = child.first();
            //child.remove(next);
            dfs(next , adj, result);  
        }
        result.add(0, source);
    }
}
