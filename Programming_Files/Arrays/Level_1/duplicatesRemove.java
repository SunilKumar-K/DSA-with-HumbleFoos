package Level_1;
import java.util.*;

public class duplicatesRemove{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print(duplicateElement(arr));
    }

    public static int duplicateElement(int arr[])
    {
        int xor = 0;

        for(int i=0;i<arr.length;i++)
        {
            xor = xor ^ arr[i];
        }

        return xor;
    }
}