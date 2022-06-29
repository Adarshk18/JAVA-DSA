package com.adarsh;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int index,target;
        int[] arr = new int[0];
        int n =arr.length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = in.nextInt();

        System.out.println("Enter the elements: ");

        arr = new int[n];
        for (index=0; index< arr.length; index++){
            arr[index] = in.nextInt();
        }
        System.out.println("Enter the elements to be searched: ");
        target = in.nextInt();
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    //search the element and return the index if item found otherwise return -1
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
       for (int index=0; index< arr.length; index++){
           int element = arr[index];
            if (element == target){
                System.out.println("The element is present at location "+(index));
            }
        }
        return -1;
    }
}
