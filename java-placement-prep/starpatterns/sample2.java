package starpatterns;
import java.util.*;
public class sample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=m;j<n;j++){
                System.out.print("*");
                m++;
            }
            System.out.print("\n");
        }
    }
}
