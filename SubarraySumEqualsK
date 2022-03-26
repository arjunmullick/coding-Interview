// https://leetcode.com/problems/subarray-sum-equals-k/
//
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // one way to count 0 sum is before start []
        
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int diff = sum - k; //if this value is seen then we have a cont sub array with sum = k
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}




// Not optimized 
class Solution2 {
    public int subarraySum(int[] nums, int k) {
        int [] sums = new int[nums.length+1];
        sums[0] = 0;
        for(int i = 1 ; i <= nums.length ; i++){//1 to n included due to sum array is updating
            sums[i] = sums[i-1] + nums[i-1];
        }
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int end = i+1 ; end < sums.length ; end++){
                if(sums[end] - sums[i] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
