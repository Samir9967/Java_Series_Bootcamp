import java.util.Scanner;

public class ElseIfStatement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 5){
            num = num + 5;
        } else if (num > 20 || num > 50) {
            num = num + 20;
        } else if (num > 51 || num > 100) {
            num = num + 100;
        }

        System.out.println(num);
    }
}
