import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      str=str.toLowerCase();
      int vowels=0;
      int conso=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          vowels++;
        }
        else{
           conso++;
        }
      }
      System.out.println("Vowels: "+vowels+ "\nConsonants:"+conso);
    }
}
/*STDIN
programming
Output:
Vowels: 3
Consonants:8*/
