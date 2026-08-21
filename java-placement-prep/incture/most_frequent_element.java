import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int max=0;
      int val=arr[0];
     for (int i = 0; i < n; i++) {

    boolean alreadySeen = false;
    for (int k = 0; k < i; k++) {
        if (arr[i] == arr[k]) {
            alreadySeen = true;
            break;
        }
    }
    if (!alreadySeen) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }
        if(count>max){
          max=count;
          val=arr[i];
        }
    }
}
System.out.println(val);
    }
}
