import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n,s;
        boolean search=false;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array elemets:");
        n=sc.nextInt();
        System.out.println("Enter array elemets");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
                search=true;
        }
        if(search)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not fount");
        }
    }
}
