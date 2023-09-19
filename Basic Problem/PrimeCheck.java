import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check whether it is prime or not = ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println(number + " is Not Prime");

        } else if (number % 2 == 0) {

            System.out.println(number + " is Not Prime");
        } else {
            System.out.println(number + " is Prime");

        }
        sc.close();

    }
}
