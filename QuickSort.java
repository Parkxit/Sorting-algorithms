import java.util.*;
public class QuickSort {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n=sc.nextInt();
        int [] arr= new int [n];
        System.out.println("Enter "+n+" elements to sort: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int arr[], int low, int high)
    {
        if(low>=high)
        {
            return;
        }

        int start=low;
        int end=high;
        int m=start+(end-start)/2;
        int pivot=arr[m];
        while(start<=end)
        {
            while(arr[start]<pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }

            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }

}
