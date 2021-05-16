//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int n : arr2)
            ts.add(n);
        
        for(int n : arr1){
            Integer higher = ts.ceiling(n);
            Integer lower = ts.floor(n);
            int diff = 0;
            if(higher == null){
                diff = Math.abs(lower - n);
            }else if(lower == null){
                diff = Math.abs(higher - n);
            }else{
                diff = Math.min(higher - n, n - lower);
            }
            if(diff > d)
                res++;
        }
        return res;
    }
}
