class Solution {

    Random random;
    int[] cdf;
    public Solution(int[] w) {
        random = new Random();
        cdf = new int[w.length];
        cdf[0] = w[0];
        for(int i = 1; i < w.length; i++) {
            cdf[i] = cdf[i - 1] + w[i];
        }
    }
    
    public int pickIndex() {
        int n = cdf.length;
        int target = random.nextInt(cdf[n - 1]) + 1;
        int left = 0;
        int right = n - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(cdf[mid] == target)
                return mid;
            if(cdf[mid] < target)
                left = mid + 1;
            else right = mid;
        }
        return right;
    }
}

/**
class Solution {
    int [] cf;
    int n;
    int sum;
    public Solution(int[] w) {
        n = w.length;
        cf = new int[n];
        cf[0] = w[0];
        for(int i = 1 ; i < n ; i++){
            cf[i] = cf[i-1] + w[i];
        }
        sum = cf[n-1];
    }
     
    
    // [1,2,5] -> [1,3,8] // generate index between 0-7. The index value if in array return else give next number
    public int pickIndex() {
        double random = Math.random() * (sum-1);
        int target = (int)Math.abs(random);

        int left = 0 ;
        int right = n-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(cf[mid] == target) return mid;
            if(cf[mid] < target){
                left = cf[mid+1];
            }else{
                right = cf[mid];
            }
        }
        return left;

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */


// Binaray search and probability 
/**
class Solution {
    private double[] probabilities;
    
    public Solution(int[] w) {
        double sum = 0;
        this.probabilities = new double[w.length];
        for(int weight : w)
            sum += weight;
        for(int i = 0; i < w.length; i++){
            w[i] += (i == 0) ? 0 : w[i - 1];//cumulative sum to have it always increasing
            probabilities[i] = w[i]/sum; 
        }
    }
     
    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(this.probabilities, Math.random())) - 1;
    }
}
**/



// Classic
/**

class Solution {

    int[] arr;
    int max = 0;
    Random random = new Random();
    public Solution(int[] w) {
        int[] arr = new int[w.length];
        arr[0] = w[0];
        max += w[0];
        for(int i=1; i<w.length; i++){
            arr[i] = arr[i-1] + w[i];
            max+=w[i];
        }
        this.arr = arr;
    }
    
    public int pickIndex() {
        int rnd = random.nextInt(max) + 1;  // generate random number in [1,max]
        //this returns the index of the random  number,
	//if the number does not exist in the array it returns  -(the position it should have been) - 1
        int ret = Arrays.binarySearch(arr, rnd); 
        if(ret < 0) ret = -ret - 1; //if not in the array 
        return ret;
    }
}

**/
