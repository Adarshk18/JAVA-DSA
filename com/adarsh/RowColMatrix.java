package com.adarsh;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,1},
                {4,8,31},
                {12,56,0}
        };
        System.out.println(Arrays.toString(search(arr,12)));

    }
    static int[] search(int[][] matrix,int target)
    {
        int r = 0;
        int c = matrix.length-1;

        while (r< matrix.length && c>=0)
        {
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }else if (matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
