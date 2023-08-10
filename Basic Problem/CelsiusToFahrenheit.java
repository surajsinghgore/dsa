import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature In Celsius  to Convert In Fahrenheit");
        float Celsius = sc.nextFloat();
        float Fahrenheit = ((Celsius*9/5)+ 32);

        System.out.println("Celsius " + Celsius + "\u00B0C to Fahrenheit  Is " + Fahrenheit + "\u00B0F");
    }
}
