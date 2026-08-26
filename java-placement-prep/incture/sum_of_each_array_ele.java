import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      int[] result=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        int og=arr[i];
        int sums=0;
        while(og>0){
          int digit=og%10;
          sums=sums+digit;
          og=og/10;
        }
        result[i]=sums;
      }
      for(int i=0;i<n;i++){
        System.out.println(result[i]);
      }
    }
} /*STDIN
3
123
456
111
Output:
6
15
3*/
