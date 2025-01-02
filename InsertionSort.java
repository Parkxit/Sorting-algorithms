import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    private int arr[];
    private int n;

    Scanner sc=new Scanner(System.in);

    public InsertionSort()
    {
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sort(InsertionSort ss)
    {
        for(int i=0;i<ss.n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public void print(InsertionSort ss)
    {
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        InsertionSort is=new InsertionSort();
        is.sort(is);
        is.print(is);
    }
}
