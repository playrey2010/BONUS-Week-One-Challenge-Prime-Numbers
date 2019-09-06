import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        int num1;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number and I'll let you know if it is prime or not: ");
        num1 = sc.nextInt();
        for (int i = 2; i < num1; i++) {
            if (num1%i == 0) {
                isPrime = false;
                break;
            } else {isPrime = true;}
        }

        if (isPrime) {
            System.out.println(num1 + " is a prime number.");
        } else {
            System.out.println(num1 + " is not a prime number.");
        }
    }
}
