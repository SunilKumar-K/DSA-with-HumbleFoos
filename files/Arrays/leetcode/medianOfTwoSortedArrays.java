package leetcode;

import java.util.Scanner;

public class medianOfTwoSortedArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[m];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j= 0;j < m;j++)
        {
            arr[j] = sc.nextInt();
        }

        System.out.println(medianOfTwoSortedArray(arr,arr1,n,m));
    }

    public static int medianOfTwoSortedArray(int ar[], int arr[],int n, int m)
    {
        int start = 0;
        int end = n;
        while(start <= end )
        {
            int mid1 = (start+end)/2;
            int mid2 = (n+m+1)/2-mid1;
            int lefta = mid1-1;
            int righta = mid1;
            int leftb = mid2-1;
            int rightb = mid2;
            if(ar[lefta]<= arr[rightb] && arr[leftb] <= ar[righta])
            {
                if((n+m)%2 == 0)
                {
                    return (Math.max(ar[lefta],ar[leftb])+Math.min(arr[righta],arr[rightb]))/2;
                }
                else{
                    return Math.max(ar[lefta],arr[leftb]);
                }
            }
            else if(ar[lefta] > arr[rightb])
            {
                end = mid1-1;
            }
            else {
                start = mid1+1;
            }
        }

        return -1;

    }
}