package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    //https://leetcode.com/problems/spiral-matrix/

    class Solution {

        // Thing to remember is
        // && cMin <= cMax and && rMin <= rMax as additional condution

        // No additional memory
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new LinkedList<>();

            int n = matrix.length;
            int m = matrix[0].length;

            int rMin = 0;
            int cMin = 0;
            int rMax = n-1;
            int cMax = m-1;

            while(rMin <= rMax && cMin <= cMax){
                //traverse right
                for(int c = cMin ; c <= cMax && rMin <= rMax ; c++){
                    list.add(matrix[rMin][c]);
                }
                rMin++;

                //traverse down
                for(int r = rMin ; r <= rMax && cMin <= cMax ; r++){
                    list.add(matrix[r][cMax]);
                }
                cMax--;

                //traverse left
                for(int c = cMax; c>=cMin && rMin <= rMax ; c--){
                    list.add(matrix[rMax][c]);
                }
                rMax--;

                //traverse up
                for(int r = rMax ; r >= rMin  && cMin <= cMax; r--){
                    list.add(matrix[r][cMin]);
                }
                cMin++;
            }

            return list;



        }
    }
}

//Alternate // With additional memory
    /*
public List<Integer> spiralOrder(int[][] matrix) {
    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};
    List<Integer> result = new ArrayList<>();

    if(matrix == null || matrix.length == 0 )
        return result;

    int R = matrix.length; int C = matrix[0].length;
    int size = R*C;
    int ri = 0;
    int ci = 0;
    int di = 0;
    boolean [][] seen = new boolean[R][C];

    for(int i = 0 ; i <  size ; i++){
        seen[ri][ci] = true;
        result.add(matrix[ri][ci]);
        int r = ri + dr[di];
        int c = ci + dc[di];

        if(r < R && r >= 0 && c >=0 && c < C && !seen[r][c]){
            ri = r;
            ci = c;
        }else{
            //change direction
            di = (di +1) % 4;
            ri = ri + dr[di];
            ci = ci + dc[di];
        }
    }

    return result;
}
*/
