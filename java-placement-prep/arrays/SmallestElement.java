import java.util.Scanner;

public class SmallestElement {
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
        int mini=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<mini)
                mini=arr[i];
        }
        System.out.println("Largest element:"+mini);
    }
}
