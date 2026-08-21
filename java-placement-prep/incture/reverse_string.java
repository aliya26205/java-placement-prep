import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      String rev="";
      for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        rev=rev+ch;
      }
      System.out.println(rev);
    }
}
/*For input:

hello

Output:

olleh*/
