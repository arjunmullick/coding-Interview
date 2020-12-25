package interview;

public class PeakIndexMountainArray {

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/

    class Solution {
        public int peakIndexInMountainArray(int[] arr) {

            int n = arr.length;
            int l = 0;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;

                if(arr[mid] < arr[mid+1]){
                    //number are increasin so peak is on right
                    l = mid +1;
                }else{
                    //mid or number before it is peak
                    r = mid;
                }
            }
            return r;
        }
    }

    //when length >=3
    class Solution2 {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int l = 0;
            int r = n -1;

            while(l<=r){
                int mid = l + (r-l)/2;
                if(arr[mid] < arr[mid+1]){
                    l = mid + 1; //we are going -ve slope so peak on left
                }else{
                    r = mid -1; // we are on +ve slope so peak on right
                }
            }

            return r < n-1 ? r+1 : n-1; //end of loop we cross over the peak so r+1 .
        }
    }
}
