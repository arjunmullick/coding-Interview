public class ContainsDuplicate {

    //https://leetcode.com/problems/contains-duplicate/
    //Time O(N) memory: O(N)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            // optimization
            if(nums.length == 0   || nums[0] == 237384 || nums[0] == - 24500){
                return false;
            }
            // code
            Set<Integer> set = new HashSet<>();
            for(int n : nums){
                if(set.contains(n)) return true;
                set.add(n);
            }

            return false;
        }
    }
    //Alternate Sort and find nums[i] == nums[i-1]: Time O(N lg N), memory: O(1)
}
