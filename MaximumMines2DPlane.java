// "static void main" must be defined in a public class.
import java.util.ArrayList;

/**
A minefield is made up of mines placed on a continuous 2D plane. A mine is 
represented as a tuple with the values (x, y, blast_radius). When a mine blows up,
all other mines whose coordinates are within the blast radius also blow up. When 
those mines blow up, any mines within their blast radius also blow up, and so on 
and so on, triggering a chain reaction.

Given a list of mines, determine which mine would blow the most total number of 
mines if it were to blow up. The output should be a pair of the mine and the
total number of mines that it blows up, including itself.

double[][] mines = new double[][]{
   {1.01, 1, 2},
   {6, 6, 1},
   {1, 2, 3},
   {-1, -1, 3},
**/

//https://leetcode.com/playground/9QkVKNoP
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double[][] mines = new double[][]{
           {1.01, 1, 2},
           {6, 6, 1},
           {1, 2, 3},
           {-1, -1, 3}
        };
        
        int max = maxMines(mines);
        System.out.println(max);
    }
    
    public static int maxMines(double[][] mines){
        int n = mines.length;
        
        Map<Integer , Set<Integer>> adj = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            adj.put(i, new HashSet<>());
        }
        //prepared connected graph
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==j) continue;
                double[] mine1 = mines[i];
                double[] mine2 = mines[j];
                double diff = distance(mine1[0],mine1[1],mine2[0],mine2[1]);
                //mine 1 active will make mine 2 detonate 
                if(diff <= mine1[2]){
                    Set<Integer> set1 = adj.get(i);
                    set1.add(j);
                    adj.put(i,set1);
                }
            }
        }
        
        System.out.println(adj);
        
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            while(queue.size() > 0){
                int node = queue.poll();
                count++;
                visited.add(node);
                Set<Integer> neighbour = adj.get(i);

                for(int next : neighbour){
                    if(visited.contains(next)) continue;
                    queue.offer(next);
                }
            }
            max = Math.max(max,count);
        }
        
        return max;
    }
    
    public static double distance(double x1, double y1 , double x2 , double y2){
        double distance = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        return Math.pow(distance,.5);
    }
}
