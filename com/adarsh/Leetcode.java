package com.adarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        two_sum obj=new two_sum();
        Scanner sc=new Scanner(System.in);
        List<Integer> arr=new ArrayList<Integer>();
        System.out.printf("\n Enter the no of elements you want");
        int n=sc.nextInt();
        System.out.printf("\n Enter the elements ");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.printf("\n Enter the target");
        int target=sc.nextInt();
        int res=obj.match(arr,target);
        System.out.printf("\n The elements are %d and %d ",arr.get(res),arr.get(res+1));



    }
}
class two_sum
{
    public int match(List<Integer> array ,int target)
    {
        int r=0;
        for(int i=0;i<array.size();i++)
        {
            if((array.get(i)+ array.get(i + 1))==target)
            {
                r=i;
                break;
            }
        }
        return r;
    }
}
