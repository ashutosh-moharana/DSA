import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();

        if (!isOdd(no)) { // you can use evenOdd() 
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }

        sc.close();

    }

    public static boolean evenOdd(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1; //this part I learned from Kunal Kushwaha...
        /* It simply means the no first converted to boolean and then the right most bit is extracted.If it is one then it is an Odd number and if it is 0 then 
        it is an Even number.
         */
    }

}
