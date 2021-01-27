import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number to check if it is a leap year.");
        int year = input.nextInt();
        System.out.println(leapYearTest(year));

    }

    public static boolean leapYearTest(int year){
        if(year % 4 != 0){
            return false;
        }
        else{
            if(year % 100 == 0 & year % 400 != 0){
                return false;
            }
            else return true;
        }
    }
}
