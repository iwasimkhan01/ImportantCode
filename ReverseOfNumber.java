package reverseofnumber;

import java.util.*;

/**
 *
 * @author Wasim
 */
public class ReverseOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, rem = 0, rev = 0, num1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number= ");
        num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of " + temp + " is " + rev);

    }

}
