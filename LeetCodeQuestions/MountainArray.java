package LeetCodeQuestions;

public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start +(end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //we are in decreasing part of the array
                //we have to look in left
                end = mid;
            }else{
                //we are in increasing part of the array
                //so we have ton look in right side
                start = mid+1;
            }
        }
        return start;
    }
}
