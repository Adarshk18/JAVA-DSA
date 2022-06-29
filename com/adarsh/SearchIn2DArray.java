package com.adarsh;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {4,6,1},
                {8,9,11},
                {6,0,2}
        };
        int target = 11;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        int max = Integer.MIN_VALUE;
        for (int row=0; row< arr.length; row++){
            for (int col=0; col< arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return new int[]{-1,-1};
    }
}
