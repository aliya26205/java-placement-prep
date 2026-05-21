import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        int n,sum=0;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array elemets:");
        n=sc.nextInt();
        System.out.println("Enter array elemets");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of array elemets are:");
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
