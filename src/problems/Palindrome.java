package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        //implementation here...

        String str = "civic";

        if (checkPalindrome(str))
            System.out.print("given word is palindrome");
        else
            System.out.print("given word is not palindrome");

    }

    public static boolean checkPalindrome(String str) {

        int i = 0, k = str.length() - 1;

        while (i < k) {

            if (str.charAt(i) != str.charAt(k))
                return false;

            i++;
            k--;
        }
        return true;
    }
}