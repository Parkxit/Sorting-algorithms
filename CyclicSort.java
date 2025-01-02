import java.util.Scanner;
import java.util.Arrays;

//only for range 1 to n

public class CyclicSort {

    public static void sort(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
            {
                arr[i]=i+1;
            }
        }

        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter total number of elements: ");
        n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter all numbers from 1 to "+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        sort(arr,n);

    }

}
