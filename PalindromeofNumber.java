/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impcode;

import java.util.*;

/**
 *
 * @author wasim
 */
public class PalindromeofNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num, rem = 0, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number= ");
        num = sc.nextInt();

        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is a Palindrome number");
        } else {
            System.out.println(temp + " is not a Palindrome number");
        }
    }

}
