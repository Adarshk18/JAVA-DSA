package LeetCodeQuestions;

import java.util.Scanner;

public class CeilingOfNumber {
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
        int ans = CeilingOfNumber(arr,target);
        System.out.println(ans);
    }

    //return the index of smallest number greater than or equal to target
    static int CeilingOfNumber(int[] arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2; // do not do start+end/2 directly otherwise it will not work if range exceeds.
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
