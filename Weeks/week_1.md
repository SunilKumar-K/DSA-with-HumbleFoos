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
        reversingOfArray(arr);
     }
}
public static void reversingOfArray(int arr[])
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
```
## out Put = [5,4,3,2,1].