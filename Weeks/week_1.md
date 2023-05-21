## Week - 1 :

# Reversing of an given array :-

- you can solve these question in no.of  ways but we are discussing 2 ways i.e.., **By using starting and ending indexes later swaping of those two index's by using temp variable. you need to increment the starting index and decrement the ending index.**

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

# Merging of two sorted arrays.

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

        int arr[] = new int[arr1.length+arr2.length];
        
        int i=0,j=0,k=0;

        while(i < arr1.length && j < arr2.length)                      
        {
          if(arr1[i]<arr2[j])
          {
            arr[k++] = arr1[i++];
          } 
          else{
            arr[k++]=arr2[j++];
          }
        }
        
        while(i<arr1.length)
        {
          arr[k++] = arr[i++];
        }

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