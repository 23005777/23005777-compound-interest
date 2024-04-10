import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double P = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double interest = input.nextDouble();

        System.out.println("Enter the number of years: ");
        int n = input.nextInt();

        double i = interest / 100;

        double A = P * Math.pow((1 + i / 12), n * 12);

        System.out.println("R" + A);

    }
}