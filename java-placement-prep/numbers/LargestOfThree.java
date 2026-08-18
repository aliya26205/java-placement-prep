package numbers;
import java.util.*;;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.err.println("A is greatest");
        }else if(b>a&& b>c){
            System.out.println("b is grestest");
        }else{
            System.out.println("C is greastest");
        }
    }
}
