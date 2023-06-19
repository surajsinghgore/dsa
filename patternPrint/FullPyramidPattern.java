
import java.util.Scanner;
class FullPyramidPattern{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("How many pattern wanted : ");
int n=sc.nextInt();
for (int i = 0; i < n; i++) {
 
        // inner loop 1 to print white spaces
        for (int j = 0; j < 2 * (n - i) - 1; j++) {
            System.out.print(" ");
        }
        // inner loop 2 to print star * character
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }

}
}