import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n-1;i++){
        arr[i]=sc.nextInt();
      }
      int as=0;
      int s=0;
      for(int i=1;i<=n;i++){
        as+=i;
      }
      for(int i=0;i<arr.length;i++){
        s+=arr[i];
      }
      int miss=as-s;
      //Missing = Expected Sum - Actual Sum
      System.out.println(as);
      System.out.println(s);
      System.out.println(miss);
    }
}
