class MedianFinder {

    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>((n1,n2) -> (n1-n2)); // second half max elements 
        maxHeap = new PriorityQueue<>((n1,n2) -> (n2-n1)); // first half min elements 
    }
    
    public void addNum(int num) {
        
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());
        
        if(maxHeap.size() > minHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return 0.5 * (maxHeap.peek() + minHeap.peek());
        }else{
            return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */