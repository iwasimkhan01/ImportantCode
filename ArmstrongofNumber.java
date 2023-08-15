package impcode;

import java.util.*;

/**
 *
 * @author wasim
 */
public class ArmstrongofNumber {

    public static void main(String[] args) {
        int arm = 0, rem = 0, temp = 0, num = 0;
        int len;// raised = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number= ");
        num = sc.nextInt();
        temp = num;
        len = String.valueOf(num).length();

        while (num > 0) {
            rem = num % 10;
            arm += Math.pow(rem, len);
            num = num / 10;

        }

        if (temp == arm) {
            System.out.println(temp + " is a Armstrong Number");
        } else {
            System.out.println(temp + " is not a Armstrong Number");
        }
    }
}
