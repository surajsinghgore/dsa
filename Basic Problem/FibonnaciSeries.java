import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
    int num=sc.nextInt();
int a=1,b=2;
System.out.print("0 1 "+a+" ");
    for (int i =0; i < num; i++) {
        System.out.print(b+" ");
        int temp=b;
        b=a+b;
        a=temp;
    }


    }
}
