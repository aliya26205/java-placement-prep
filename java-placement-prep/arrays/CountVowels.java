//package strings;

import java.util.*;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert the string to lowercase
        str = str.toLowerCase();

        int count = 0;

        // Loop through every character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check whether the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}