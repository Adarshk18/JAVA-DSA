package LeetCodeQuestions;

public class InfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        /*int ans = binarySearch(arr,target);
        System.out.println(ans);*/
    }

    static int findingRange(int[] arr,int target){
        //find the range
        //first start with the box of size of 2
        int start = 0;
        int end = 1;

        //condition for target to lie in the range
        while (target>arr[end]){
            int newStart = end+1;
            //double the size of the box
            //end = previous ens + sizeof box *2
            end = end+(start-end+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
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
}
