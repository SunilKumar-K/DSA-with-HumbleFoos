package Level_1;
import java.util.*;

/*
 * An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
   Given an array arr[] of size N, Return the index of any one of its peak elements.
   Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 

Example 1 :-

Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.



Input:
N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
it's neighbor elements 3 and 2.
If 1 is returned then the generated output will be 1 else 0.

 * 
 */

public class peakElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // where n is the size of an array .

        int arr[] =new int[n];  // taking input form the user 

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print(peak_Element(arr));
    }
    public static int peak_Element(int arr[])
    {
        int max = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                return i;
            }
        }

        return 0;
    }
    
}
