import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bal = 5000;
        double interestRate = 1.17;

        int month1 = (int) (bal * interestRate);

        System.out.println("Your credit card balance after 1 month is $" + month1 + " and your interest was $" + (month1 - bal));

        int month2 = (int) (month1 * interestRate);

        System.out.println("Your credit card balance after 2 months is $" + month2 + " and your interest was $" + (month2 - bal));

    }
}