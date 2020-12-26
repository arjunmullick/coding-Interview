package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FindKClosestElements {

    /*
       By Closest value
        [1,2,3,4,10,12]
        k = 4
        x = 4
        Output = [1,2,3,4]

     */
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int n = arr.length;
            int l = 0;
            int r = n- k; // take 0 to  n-k search space. where x will be in between
            while(l<r){
                int mid = l + (r-l)/2;
                if(x - arr[mid] > arr[mid+k] - x){// not absolute value
                    l = mid +1;
                }else{
                    r = mid;
                }
            }
            int start = r;
            int end = r+k;
            List<Integer> result = new LinkedList<>();
            for(int i = start ; i < end ; i++){
                result.add(arr[i]);
            }
            return result;

        }
    }

    /*
    By Position
    [1,2,3,4,10,12]
     k= 4
     x= 4
     [2,3,4,10] - expand by position
     */

    class KClosestElementByPosition {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int n = arr.length;

            int l = 0;
            int r = n-1;

            while(l<r){
                int mid = l + (r-l)/2;
                int val = arr[mid];
                if(arr[mid] < x){
                    l = mid+1;
                }else{
                    r = mid;
                }
            }
            int pos = r;//equal or just greater
            List<Integer> result = new LinkedList<>();
            result.add(arr[pos]);
            int left = pos;
            int right = pos;
            while(result.size() <= k){
                if(right > 0){
                    result.add(0,arr[--right]);
                }
                if(result.size() == k) break;

                if(left< n-1){
                    result.add(arr[++left]);
                }
            }
            return result;
        }
    }
}
