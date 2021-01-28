import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
        System.out.println("Please input a positive integer.");
        int number = input.nextInt();
        System.out.println(recursiveFibonacci(number));
        System.out.println(iterativeFibonacci(number));
    }

    public static int recursiveFibonacci(int number){
        if(number <= 1){
            return number;
        }
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }

    public static int iterativeFibonacci(int number){
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 1; i < number; i++){
            c = a + b;
            a= b;
            b = c;
        }
        return c;
    }

}
