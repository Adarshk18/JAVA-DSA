package com.adarsh;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4,2,3,67,8};
        int target = 67;
        System.out.println(linearSearch(arr,target,1,3));
    }

    static int linearSearch(int[] arr,int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index=start; index<= end; index++){
            int element = arr[index];
            if (element == target){
                System.out.println("The element is present at location "+(index));
            }
        }
        return -1;
    }
}
