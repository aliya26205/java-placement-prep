import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int [] arr=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int sum=0;
      for(int nums:arr){
        sum+=nums;
      }
      System.out.println(sum);
    }
}
