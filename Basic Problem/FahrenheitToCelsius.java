import java.util.Scanner;
class FahrenheitToCelsius{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Temperature In Fahrenheit to Convert In Celsius");
float Fahrenheit=sc.nextFloat();
float Celsius= ((Fahrenheit-32)*5/9);

System.out.println("Fahrenheit "+Fahrenheit+"\u00B0F  to Celsius Is "+Celsius+"\u00B0C");
}
}