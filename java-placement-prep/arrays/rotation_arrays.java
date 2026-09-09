import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int [] arr=Arrays.stream(sc.nextLine().split(""))
                 .mapToInt(Integer::parseInt).toArray();
      System.out.println("Old Array:");
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start=start+1;
        end=end-1;
      }
      System.out.println("\nNew Array:");
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
/*STDIN
1234
Output:
Old Array:
1 2 3 4 
New Array:
4 3 2 1

        start           end
          ↓              ↓
Index:   0   1   2   3   4
Array:   1   2   3   4   5

Swap:
1 ↔ 5

Then move both:
        start       end
          ↓         ↓
Index:   0   1   2   3   4
Array:   5   2   3   4   1*/
