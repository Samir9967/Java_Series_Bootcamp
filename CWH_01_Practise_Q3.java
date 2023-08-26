/*
Write a program Which ask the user to enter name and greet them with "Hello <name> have a good day
 */

import java.util.Scanner;

public class CWH_01_Practise_Q3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " have a good day");

    }
}
