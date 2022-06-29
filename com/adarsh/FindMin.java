package com.adarsh;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,2,3,67,8};
        System.out.println(min(arr));
    }
    //assume arr.length is not equal to zero
    static int min(int[] arr){
        int ans = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
