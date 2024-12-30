import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter "+n+" numbers: " );
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int arr[], int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        
        int mid=low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int arr[], int low, int mid, int high)
    {
        int n=arr.length;
        int left=low;
        int right=mid+1;
        int [] temp = new int [n];
        int i=0;
        while(left<=mid && right <= high)
        {

                if (arr[left] <= arr[right]) {
                    temp[i] = arr[left];
                    left++;

                }
                else  {
                    temp[i] = arr[right];
                    right++;

                }
i++;

        }

        while(left<=mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(right<=high)
        {
            temp[i]=arr[right];
            right++;
            i++;
        }

        for(i=0;i<temp.length;i++)
        {
            arr[low+i]=temp[i];
        }
    }
}
