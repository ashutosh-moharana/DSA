import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int fact = fact(no);
        System.out.println("The factorial of " + no + " is " + fact);
        sc.close();
    }

    public static int fact(int n) {
       //solved this factorial POD using recursion
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }
}
