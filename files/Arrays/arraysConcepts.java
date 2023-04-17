import java.util.Arrays;

public class arraysConcepts{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        singleDimension(arr);// calling a function 

        int mul[][] = { {1,2,3},{4,5,6},{7,8,9}};
        multiDimensionArray(mul);





    }

    public static void multiDimensionArray(int arr[][])
    { for(int i=0;i<arr.length;i++)
        {
             for(int j=0;j<arr.length;j++)
             {
                System.out.print(arr[i][j]); //It will print the value with respect to the very index of i,j for given range.
            }
            System.out.println();//for new line
        }
}

    public static void singleDimension(int arr[])
    {
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