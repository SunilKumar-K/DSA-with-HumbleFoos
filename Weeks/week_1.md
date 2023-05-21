## Week - 1 :

## First day :-

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

# Array Shuffling :- ( All even numbers in an array comes first half array and All odd numbers in an array comes second half array )

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