class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> ans = new ArrayList<>();
        
        for(int[] in: intervals){
            if(in[1] < newInterval[0]){
                ans.add(in);
            }
            else if(in[0] > newInterval[1]){
                ans.add(newInterval);
                newInterval = in;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        
        ans.add(newInterval);
        
        return ans.toArray(new int[ans.size()][2]);
    }
}

/**
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        
        for(int in[] : intervals){
            minHeap.offer(in);
        }
        minHeap.offer(newInterval);
        
        List<int[]> output = new ArrayList<>();
        int [] prev = minHeap.poll();
        while(minHeap.size() > 0){
            int[] next = minHeap.poll();
            if(next[0] <= prev[1]){
                prev[1] = Math.max(prev[1],next[1]);
            }else{
                output.add(prev);
                prev = next;
            }
        }
        output.add(prev);
        
        int[][] result = new int[output.size()][2];
        for(int i = 0 ; i < output.size() ; i++){
            result[i] = output.get(i);
        }
        
        return result;
    }
}
**/
