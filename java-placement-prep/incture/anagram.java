import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
      if(str1.length()!=str2.length()){
        System.out.println("not a anagram");
      }else{
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        String st1 = new String(chars1);
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        String st2 = new String(chars2);
        if(st1.equals(st2))
           System.out.println("anagram");
        else
           System.out.println("Not a anagram");
      }
    }
}
/*STDIN
race
care
Output:
anagram*/
