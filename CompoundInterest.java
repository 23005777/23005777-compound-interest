import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundsPerYear = input.nextInt();

        double interestRate = annualRate / 100;
        double amount = principal * Math.pow(1 + interestRate / compoundsPerYear, compoundsPerYear * years);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest after " + years + " years: R" + compoundInterest);

        input.close();
    }
}