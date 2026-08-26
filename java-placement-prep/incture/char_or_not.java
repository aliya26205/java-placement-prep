import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      String result="Number";
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch>=65){
          result="Not A Number";
        }
      }
      System.out.println(result);
    }
}
