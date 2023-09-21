import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer to Reverse It = ");
        int num = sc.nextInt();
        int temp = num;
        int ans = 0;
        while (temp != 0) {
            int digit = temp % 10;
            ans = ans * 10 + digit;
            temp = temp / 10;

        }
        System.out.println("Reverse Of "+num+" is "+ans);

    }
}
