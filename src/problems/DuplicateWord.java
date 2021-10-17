package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //implementation here...

        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");
        System.out.println("Duplicate words are:");
        for (int i =0; i< words.length; i++){
            count = 1;
            if (words[i].equals(words[i])){
                count++;
                words[i] = "0";

            }

        }

    }

}
