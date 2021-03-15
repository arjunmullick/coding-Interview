class Solution {
    //__ 10   20   30    60
    //10 +60  +30  +30   +40
    //   10                   70           110
    
    
    
    //__ 10   20   30    60
    //10 +60  +30  +30   +10
    //   10                   70(choose max fule from past station)       100
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        int count = 0;
        int travel = startFuel;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
        
        for(int[] station : stations){
            if(travel>= target) return count; 
            int pos = station[0];
            int fuel = station[1];
            
            while(maxHeap.size() != 0 && pos > travel){ // try to reach the postion of next gas station , if alreay corssed travel > pos ignore
                travel += maxHeap.poll();
                count++;
            }
            
            if(pos > travel) return -1; // cant reach position and cant choose past fuel station
            maxHeap.offer(fuel);

        }
        
        while(maxHeap.size() != 0 && travel < target){
            travel += maxHeap.poll();
            count++;
        }

        if(travel >= target) return count; 
        return -1;
        
    }
}
