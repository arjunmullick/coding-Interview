package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    //https://leetcode.com/problems/course-schedule/
    /**
    Input: numCourses = 2, prerequisites = [[1,0]]
    Output: true
    Explanation: There are a total of 2 courses to take. 
    To take course 1 you should have finished course 0. So it is possible.

    **/

    //O(∣E∣+∣V∣) no of edge + vertices
    class Solution {

        //[0,1]   0 needs 1 to complete 0<-1
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            HashMap<Integer,List<Integer>> adj = new HashMap<>();
            int inDegree [] = new int[numCourses];

            for(int i = 0 ; i < numCourses ; i++){
                adj.put(i,new ArrayList<>());
            }
            for(int [] edge : prerequisites){

                int node1 = edge[0];// next node // -> to
                int node2 = edge[1];// pre req // from ->

                inDegree[node1] = inDegree[node1] + 1;
                List<Integer> neighbours = adj.get(node2);
                neighbours.add(node1);
                adj.put(node2,neighbours);

            }

            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0 ; i < numCourses ; i++){
                if(inDegree[i] == 0) queue.add(i);
            }

            while(queue.size() > 0){
                int node = queue.poll();
                for(int next : adj.get(node)){
                    inDegree[next] = inDegree[next] - 1;
                    if(inDegree[next] == 0){
                        queue.offer(next);
                    }
                }
            }
            for(int i = 0 ; i < numCourses ; i++){
                if(inDegree[i] != 0) return false;
            }
            return true;
        }
    }
}
