import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String[] words = str.split(" ");
      System.out.println(words.length);
    }
}
/*STDIN
I love Java programming
Output:
4*/
