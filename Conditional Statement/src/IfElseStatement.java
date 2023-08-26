public class IfElseStatement
{
    public static void main(String[] args) {
        int salary = 10000;

        if (salary > 5000){
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
