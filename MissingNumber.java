public class MissingNumber {
    //Find first non-matching index == nums[index] as we are searching distinct numbers in the range [0, n]
    //https://leetcode.com/problems/missing-number/
    class Solution {
        public int missingNumber(int[] nums) {
            if(nums.length == 0) return -1;

            Arrays.sort(nums);
            //int low = nums[0];///could always be 0 for this question
            int n = nums.length;

            if(nums[0]!=0) return 0;
            if(nums[n-1] ==  n-1) return n;

            int l = 0 ;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                int val = nums[mid];
                if(mid == val){
                    //its on right
                    l = mid+1;
                }else{
                    r = mid;
                }
            }
            return r;//index is 0 based so missing no is nums[r] - 1
        }
    }
}
