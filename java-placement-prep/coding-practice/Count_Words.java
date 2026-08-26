import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String[] words = str.split(" ");
        //String[] words = str.trim().split("\\s+");
        //trim() removes extra spaces at the beginning/end. \\s+ treats one or more spaces/tabs as a separator
      System.out.println(words.length);
    }
}
/*STDIN
I love Java programming
Output:
4*/
