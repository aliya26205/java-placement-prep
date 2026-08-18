package numbers;
import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }else if(n<0){
            System.out.println("Negative numbers");
        }else{
            System.out.println("Zero number");
        }
    }
}
