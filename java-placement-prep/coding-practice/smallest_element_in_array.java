import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int mini=arr[0];
      for(int i=0;i<arr.length;i++){
        if(arr[i]<mini){
          mini=arr[i];
        }
      }
      /*for(int num : arr){
            if(num < mini){
               mini = num;
             }
         }*/
      System.out.println(mini);
      
    }
}
/*STDIN
10 20 56 7 90
Output:
7*/
