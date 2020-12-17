package com.leetcode;

public class PeakIndexMountainArray {

    class Solution {
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
