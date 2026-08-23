import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int count=0;
        for(int j = 0; j < str.length(); j++){
          char ch2=str.charAt(j);
          if(ch==ch2){
            count++;
          }
        }
        if(count==1){
          System.out.println(ch);
          return;
        }
      }
    }
}
/*STDIN
aabbcddee
Output:
c*/
