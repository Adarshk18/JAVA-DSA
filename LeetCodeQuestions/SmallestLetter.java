package LeetCodeQuestions;

import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start =0;
        int end = letters.length-1;

        while (start<=end){
            int mid = start+(end-start)/2; // do not do start+end/2 directly otherwise it will not work if range exceeds.
            if (target<letters[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }

    //return the index of smallest number greater than or equal to target
}
