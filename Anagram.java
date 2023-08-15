package impcode;

import java.util.*;

/**
 *
 * @author wasim
 */
public class Anagram {

    public static void main(String[] args) {
        String str1, str2,updstr1,updstr2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st String= ");
        str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter the 2nd String= ");
        str2 = sc.nextLine().toLowerCase();

        if (str1.length() == str2.length()) {
            updstr1 = str1.replaceAll("[^a-zA-Z0-9]", "");
            updstr2 = str2.replaceAll("[^a-zA-Z0-9]", "");

            char[] str3 = updstr1.toCharArray();
            char[] str4 = updstr2.toCharArray();
            Arrays.sort(str3);
            Arrays.sort(str4);
            Boolean res = Arrays.equals(str3, str4);
            if (res == true) {
                System.out.println(str1 + " \tand \t" + str2 + "\t are an Anagram");
            } else {
                System.out.println(str1 + " \tand \t" + str2 + "\t are not an Anagram");
            }
        } else {
            System.out.println("Length of both the String are not same");
        }
    }
}
