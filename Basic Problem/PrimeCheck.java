import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check whether it is prime or not = ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println(number + " is Not Prime");
            sc.close();
            return;
        }
        if (number == 1) {
            System.out.println("1 is Not Prime");
            sc.close();
            return;
        }

        // prime check logic
        boolean check = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) { // not prime
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");

        }

        sc.close();

    }
}
