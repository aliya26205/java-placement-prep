import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int [] nums=Arrays.stream(sc.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<nums.length;i++){
          nums[i]=nums[i]*nums[i];
        }
        for(int i:nums){
          System.out.print(i+" ");
        }
    }
}
