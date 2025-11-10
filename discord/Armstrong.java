import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? n+" is an Armstrong number." : n+" is NOT an Armstrong number.");

    }
    public static boolean isArmstrong(int n){
        int sum=0;
        int no=n;
        int count = Integer.toString(no).length();
        while(no>0){
            int dg = no%10;
            sum += Math.pow(dg,count);
            no = no/10;
        }
        return sum == n;
    }
}