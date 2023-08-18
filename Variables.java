package Variables;

public class Variables
{
    int a = 10;        // instance variable
    static int b = 20;    // static variable

    public static void main(String[] args)
    {
        Variables obj1 = new Variables();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(b);

        obj1.a = 100;
        obj1.b = 200;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        Variables obj2 = new Variables();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
