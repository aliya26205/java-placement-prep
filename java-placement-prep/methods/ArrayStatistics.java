package methods;

import java.util.*;
public class ArrayStatistics {
    public static void findSum(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elemets:"+sum);
    }
    public static void findAverage(int arr[],int n)
    {
        int sum=0,avg=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Average of array elements are:"+avg);
    }
    public static void findLargest(int arr[],int n)
    {
        int large=arr[0];
         for(int i=0;i<=n;i++)
        {
            if(arr[i]>large)
                large=arr[i];
        }
        System.out.println("Largest number is:"+large);

    }
    public static void findSmallest(int arr[],int n)
    {
        int small=arr[0];
         for(int i=0;i<=n;i++)
        {
            if(arr[i]<small)
                small=arr[i];
        }
        System.out.println("Smallest number is:"+small);

    }
    public static void main(String[] args) {
        int n;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array elemets:");
        n=sc.nextInt();
        System.out.println("Enter array elemets");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        findSum(arr,n);
        findAverage(arr, n);
        findLargest(arr,n);
        findSmallest(arr,n);
    }
}
