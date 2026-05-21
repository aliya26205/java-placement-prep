// Program to print array elements
import java.util.*;
public class PrintArray
{
    public static void main(String[] args) 
    {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}