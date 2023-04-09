package LeetCodeQuestions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }

    static int findPivot(int[] arr){
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
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

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
