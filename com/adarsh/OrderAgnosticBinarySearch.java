package com.adarsh;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int target,index;
        int[] arr = new int[0];
        int n = arr.length;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        n = in.nextInt();

        System.out.println("Enter the elements: ");

        arr = new int[n];
        for (index=0; index< arr.length; index++){
            arr[index] = in.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        target = in.nextInt();
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc  = true;
        }else {
            isAsc = false;
        }

        while (start<=end){
            int mid = start+(end-start)/2; // do not do start+end/2 directly otherwise it will not work if range exceeds.

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
