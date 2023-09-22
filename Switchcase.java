import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = sc.next();

        switch (fruit){
            case "mango":
                System.out.println("mango is yellow");
                break;
            case "apple":
                System.out.println("apple is red");
                break;
            case "grapes":
                System.out.println("grapes is green");
                break;
            default:
                System.out.println("Doneeee");
        }

    }
}
