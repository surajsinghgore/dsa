import java.util.Scanner;

public class sumofdigit {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Any number to gets its sum of digit = ");
    int number=sc.nextInt();
    int temp=number;
int count=0;
    while(temp!=0){
int digit=temp%10;
count=count+digit;
temp=temp/10;
    }
    System.out.println("Sum of Digit of "+number+" is "+count);
 }   
}
