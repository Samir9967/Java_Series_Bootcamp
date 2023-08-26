public class IncrementDecrement
{
    public static void main(String[] args) {
        int num1 = 5;

        // POSTFIX Operator

//        int num2 = num1++;
//        System.out.println(num1);
//        System.out.println(num2);
//        num1++;
//        System.out.println(num1++);
//        System.out.println(num1);

//        int num2 = num1++;
//        System.out.println(num2);

        int sum2 = ++num1 + 10;
        System.out.println(sum2);
        // PREFIX OPERATOR   ++num

        int a = 6;
//        ++a;
        System.out.println(++a);
        System.out.println(a);

        int b = ++a + 10;
        System.out.println(b);

        // character increment decrement
        char ch = 'y';
        System.out.println(++ch);
    }
}
