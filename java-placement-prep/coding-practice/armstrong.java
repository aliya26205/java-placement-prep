import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
          int num = arr[i];
          int original = num;
          int sum = 0;
        while(num>0){
          int digit=num%10;
          sum = sum + digit * digit * digit;
          num = num / 10;
        }
        if (sum == original) {
                System.out.println("It is an ARMSTRONG number");
            } else {
                System.out.println("It is NOT an ARMSTRONG number");
            }
      }
    }
}
