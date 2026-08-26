import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        boolean alreadyseen=false;
        int count=0;

        for(int k=0;k<i;k++){
          if(str.charAt(k)==ch){
            alreadyseen=true;
            break;
          }
        }

        if(!alreadyseen){
          for(int j=0;j<str.length();j++){
            char ch2=str.charAt(j);
            if(ch==ch2){
              count++;
            }
          }
          if(count>1){
            System.out.println(ch);
          }
        }
      }
    }
}
/*STDIN
programming
Output:
r
g
m*/
