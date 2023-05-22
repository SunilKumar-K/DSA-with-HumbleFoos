## Week - 1 :

- **you can solve every problem in different ways but you need to understand how you are approaching to solve a particular problem. Try to know many ways to a solve a particular problem.**

# Reversing of an given array :-

```java
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        reversingOfArray1(arr);
        reversingOfArray2(arr);
     }
}

// First Method.
public static void reversingOfArray1(int arr[])
{
    int start = 0;
    int end = arr.length-1;
    int temp ;

    while(start <= end)
    {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
  System.out.println(Arrays.toString(arr));
}

//Second Method.
public static void reversingOfArray2(int arr)
{
    for(int i = arr.length-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
} 
```

- **Output for Method - 1** = [5,4,3,2,1].
- **Output for Method - 2** = 5 4 3 2 1.

# Array Shuffling :- ( All even numbers comes first half and All odd numbers comes second half of an array )

```java
import java.util.*;
public class Main{
public static void main(String[] args)
{
    int arr[] = {1,2,3,4,5};
    arrayShuffling(arr);
}

public static void arrayShuffling(int arr[])
{
    int start = 0;
    int end = arr.length-1;
    int temp;
    while(start < end)
    {
        if(arr[start] % 2 == 0)
        {
            start++;
        }
        else{
             temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
    System.out.print(Arrays.toString(arr));
}
}
```
- **Out put :-** [2,4,1,3,5].
- **After understanding this method try to slove this problem in two pointer method.**

# Merging of two sorted arrays.

- Before going to into solution understand the problem once **they were given two sorted arrays for us then later they were asking to create a new sorted array by using this two arrays.**.

- we need to create new array with length of **arr1.length+arr2.length**.

- Think few minutes later, let us consider **arr1 has five elements like 1,2,3,4,5 and arr2 is empty** here what we need to do means we need to simply copy the elements form arr1 to new sorted array right because these two arrays in sorting order right.

- **arr1 has five elements like 1,2,3,4,5 and arr2 has three elements like 7,15,20** here what we need to means simply compare the elements form arr1 with arr2 right later we adding the elements to new array. Try understand below given code.

```java
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        mergingOfArrays(arr1,arr2);
    }

    public static void mergingOfArrays(int arr1[],int arr2[])
    {
// we are creating a new array with length of arr1 length plus arr2 length.
        int arr[] = new int[arr1.length+arr2.length];
// i,j,k variables are using to traversing of arrays arr1,arr2,arr with respectively.
        int i=0,j=0,k=0;
        //both conditions is true then only we enter into loop let us consider or think with corner cases.
        while(i < arr1.length && j < arr2.length)                      
        {
//  comparing the elements form arr1 with arr2.
          if(arr1[i]<arr2[j])
          {
            arr[k++] = arr1[i++];
          } 
          else{
            arr[k++]=arr2[j++];
          }
        }
 // we are adding the remaining elements in a first array.       
        while(i<arr1.length)
        {
          arr[k++] = arr[i++];
        }
//we are adding the remaining elements in a second array.
         while(j < arr2.length)
        {
          arr[k++] = arr2[j++];
        }
        System.out.print(Arrays.toString(arr));
    }
}
```
- **Output :- **[1,2,3,4,5,6,7,8,9,10].

- **After understanding this problem try to slove this problem here - [problem link](https://leetcode.com/problems/merge-sorted-array/)**