/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/10/2019
 **************************************************************************** */

public class IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        int prod = a * b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);

        if (b == 0)
            System.out.println("Division by zero");
        else {
            System.out.println(a + " / " + b + " = " + a / b);
            System.out.println(a + " % " + b + " = " + a % b);
        }
    }
}
