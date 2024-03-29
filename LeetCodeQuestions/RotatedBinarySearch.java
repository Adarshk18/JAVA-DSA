package LeetCodeQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivotWithDuplicates(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        //if we didn't find the pivot it means the array is not rotated
        if (pivot == -1){
            //doing just normal binary search
            return binarySearch(nums,target,0, nums.length-1);
        }
        //if pivot is found ,we have found two asc sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
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
        return -1;
    }

    //this will not work in duplicate values
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
           //if elements at middle,start,and end are equal the just skip the duplicates
            if (arr[mid]==arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note: What if these elements at start and end were the pivot??

                //check if the start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start = start+1;

                //check whether end is pivot
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end = end-1;
            }
            //so left side is sorted then pivot should be in right
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end =mid-1;
            }
        }
        return -1;
    }
}
