import java.util.*;
public class SelectionSort {

    private int arr[];
    private int n;

    Scanner sc=new Scanner(System.in);

    public SelectionSort()
    {
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }

        public int getMaxindex(int [] arr, int n)
        {
            int max=0;
            for(int i=1;i<n;i++)
            {
                if(arr[max]<arr[i])
                {
                    max=i;
                }
            }
            return max;
        }

        public void sort(SelectionSort ss)
        {
            for(int i=0;i<ss.n;i++)
            {
                int max= getMaxindex(ss.arr,ss.n-i);
                int temp=ss.arr[max];
                ss.arr[max]=ss.arr[ss.n-i-1];
                ss.arr[n-i-1]=temp;
            }
        }

        public void print(SelectionSort ss)
        {
            System.out.println("The sorted array is:");
            System.out.println(Arrays.toString(ss.arr));
        }

    public static void main(String[] args) {
        SelectionSort ss=new SelectionSort();
        ss.sort(ss);
        ss.print(ss);
    }
}
