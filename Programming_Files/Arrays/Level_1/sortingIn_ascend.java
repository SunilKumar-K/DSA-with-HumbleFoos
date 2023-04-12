package Level_1;

import java.util.*;

/*
Given an array arr[] of size N, the task is to sort this array in ascending order

example :-

Input: arr[] = {0, 23, 14, 12, 9}
Output: {0, 9, 12, 14, 23}

Input: arr[] = {7, 0, 2}
Output: {0, 2, 7}

 */



public class sortingIn_ascend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(sortingOfNumbers(arr)));
        System.out.println(Arrays.toString(sortingOfNumbers1(arr)));
    }

    public static int[] sortingOfNumbers(int arr[])
    {
        Arrays.sort(arr);

        return arr;
    }

    //Bubble sorting Technique.

    public static int [] sortingOfNumbers1(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[j] = arr[i];
                }
            }
        }

        return arr;
    }
}
