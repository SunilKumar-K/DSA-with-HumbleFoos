package Level_1;

import java.util.Scanner;

public class searchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }        

        System.out.println("find given element is present in the given array or not");
        int key = sc.nextInt();


        // we can solve this problem by using linear seach it will takes o(n) time

        // Given array is in ascending or descending order then we can simply use the binary search.

        System.out.println(linearSearch(arr, key)+ " Element is present in an array");

        System.out.println(binarySearch(arr, key)+ "Element is present in an array");

    }

    static int linearSearch (int arr[] , int key )
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                return key;
            }
        }
        return -1;
    }

    static int binarySearch (int arr[] , int key)
    {
        int low =0, high = arr.length-1;
        while(low<=high)
        {
            int mid= (low +high)/2;

            if(mid == key)
            {
                return key;
            }
            else if(key > mid)
            {
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
