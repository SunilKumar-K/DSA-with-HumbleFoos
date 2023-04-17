package Level_1;

import java.util.*;

public class searchingElementIn2d{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
    
        int arr[][] = new int[rows][columns];

        for(int i=0; i<rows ;i++)
        {
            for(int j=0; j<columns ; j++)
            {
                arr[i][j] = sc.nextInt();
            }}
            System.out.println("enter which element you want to find");
            int target = sc.nextInt();
        System.out.println(Arrays.toString(searchingElementIn2dArray(arr,target)));
        
    }

    public static int[] searchingElementIn2dArray(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};

    }

}