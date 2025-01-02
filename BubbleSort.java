import java.util.*;

public class BubbleSort {
    Scanner sc=new Scanner(System.in);
    private int arr[],n;
    public BubbleSort()
    {
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sort(BubbleSort bs)
    {
        for(int i=0;i<bs.n;i++)
        {
            for(int j=0;j<bs.n-i-1;j++)
            {
                if(bs.arr[j]>bs.arr[j+1])
                {
                    int temp=bs.arr[j];
                    bs.arr[j]=bs.arr[j+1];
                    bs.arr[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted array is: "+Arrays.toString(bs.arr));
    }

    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        bs.sort(bs);

    }
}
