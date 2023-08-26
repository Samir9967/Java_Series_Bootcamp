import java.util.Scanner;

/*
Write a program to convert kilometer to miles
 */
public class CWH_01_Practise_Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometer");
        float kilometer = sc.nextFloat();
        float miles = kilometer * 0.62137f;

        System.out.println(miles);
    }
}
