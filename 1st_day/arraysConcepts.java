import java.util.Arrays;

public class arraysConcepts{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // Accessing elements in an array .

        // First Method .

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       System.out.println(); 

        //second method

        for(int i : arr)
        {
            System.out.print(i+ " ");
        }
        System.out.println();

        //Third method.

        System.out.println(Arrays.toString(arr));
    }
}