package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    //https://leetcode.com/problems/course-schedule-ii/
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            List<Integer> resultList = new ArrayList<>();

            int inDegree [] = new int[numCourses];

            HashMap<Integer,List<Integer>> adj = new HashMap<>();

            for(int i = 0 ; i < numCourses ; i++){
                adj.put(i,new ArrayList<>());
            }

            for(int[] edge : prerequisites){
                int node1 = edge[0];//next
                int node2 = edge[1];//take
                inDegree[node1] = inDegree[node1]+1;
                List<Integer> list = adj.get(node2);
                list.add(node1);
                adj.put(node2,list);
            }

            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0 ; i < numCourses ; i++){
                if(inDegree[i] == 0){
                    queue.offer(i);
                }
            }

            while(queue.size() > 0){
                int node = queue.poll();
                resultList.add(node);
                for(int next : adj.get(node)){
                    inDegree[next] = inDegree[next] -1;
                    if(inDegree[next] == 0){
                        queue.offer(next);
                    }
                }
            }

            if(resultList.size() != numCourses) return new int[0];

            int[]result = new int [numCourses];
            for(int i = 0 ; i < numCourses ; i++){
                result[i] = resultList.get(i);
            }
            return result;
        }
    }
}
