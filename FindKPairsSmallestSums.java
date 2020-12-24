package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsSmallestSums {

    class Solution {
        /**
         nums1 = [1,1,2], nums2 = [1,2,3], k = 2
         1    2    3
         1  (1,1) (1,2) (1,3)

         1  (1,1) (1,2) (1,3)

         2  (2,1) (2,2) (2,3)

         use Node as coordinate with location and value (r,c (val1+val2))


         **/
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            int n = nums1.length;
            int m = nums2.length;

            List<List<Integer>> result = new ArrayList<>();
            if(n == 0 || m == 0) return result;
            PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> (a.val - b.val));//min by val of coordinate

            minHeap.offer(new Node(0,0,nums1[0] + nums2[0]));//start with min 0,0
            int count = 0;
            boolean visited[][] = new boolean[n][m];
            while(count < k && minHeap.size() > 0){// its possible K > total possible pair
                Node node = minHeap.poll();
                System.out.println(node.r+ " " + node.c);
                int r = node.r;
                int c = node.c;
                if(visited[r][c]) continue; // already added this pair

                visited[r][c] = true;

                List<Integer> list = new ArrayList<>();
                list.add(nums1[r]);
                list.add(nums2[c]);
                result.add(list);
                //next min's  to be added
                if(r < n-1){
                    minHeap.offer(new Node(r+1,c,nums1[r+1] + nums2[c]));
                }
                if(c < m-1){
                    minHeap.offer(new Node(r,c+1,nums1[r] + nums2[c+1]));
                }
                count++;
            }

            return result;

        }

        class Node{
            int r;
            int c;
            int val;
            public Node(int r , int c , int val){
                this.r = r;
                this.c = c;
                this.val = val;
            }
        }
    }
}
