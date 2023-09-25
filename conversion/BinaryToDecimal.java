import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0, i = 0;
        while (true) {

            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, i);
                binary /= 10;
                i++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking array size from user
        System.out.print("Enter Binary To Convert Into Decimal: ");
        int binary = sc.nextInt();
        System.out.println(binary + " into decimal is " + convertBinaryToDecimal(binary));
    }
}
