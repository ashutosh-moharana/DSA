package discord;
import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYr(int yr){
       return (yr%4==0 && yr%100 !=0) || yr%400==0 ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a year(yyyy) : ");
        int year = sc.nextInt();
        if(year==0) System.out.println("Not a valid year!");
        boolean val = isLeapYr(year);
        System.out.println(val?"It is a Leap Year": "It is Not a Leap year");
         sc.close();
    }
}
