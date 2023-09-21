import java.util.Scanner;

public class PrintPrime {
    static int prime_check(int num) {
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            return num;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Prime Number You Wanted to Print ");
        int number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            int temp = prime_check(i);
            if (temp != 0) {

                System.out.print(temp + " ");

            }
        }
        sc.close();
    }
}
