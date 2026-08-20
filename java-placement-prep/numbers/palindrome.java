// normal
package numbers;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

//with recursion 
package numbers;

import java.util.*;

public class PalindromeRecursion {

    static int reverse = 0;

    static int reverseNumber(int n) {

        if (n == 0) {
            return reverse;
        }

        int digit = n % 10;
        reverse = reverse * 10 + digit;

        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int reversed = reverseNumber(n);

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
