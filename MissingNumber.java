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
// Alternate 1 (Math)
// expectedSum - actualSum . Expected is (n*(n+1))/2

// Alternate 2 (Bitwise property)
//a^b^b = a (xor with itself will reveal orignal number )   . if we xor all number i,i+1 , i+2 ---- n with itself we will get zero . Using this concept xor all number with index and remaining result will be missing number.

class Solution2 {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++){
            x = x ^ nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            x = x ^ i;
        }
        return x;
    }
}

/** Simplified 
class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        for (int i = 0; i < nums.length; i++)
            miss ^= i ^ nums[i];
        return miss;
    }
}
**/
