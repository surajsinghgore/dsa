import java.util.Scanner;
class CharIndentify{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Char Value : ");
char input=sc.next().charAt(0);
// upper case
 if((input>=65) && (input<=90)){
System.out.println(input+" is a Upper Letter");

}
// lowercase
else if((input>=97) && (input<=122)){
System.out.println(input+" is a Lowercase Letter");

}
// number
else if((input>=48) && (input<=57)){
System.out.println(input+" is a Number");
}
// else symbol
else{

System.out.println(input+" is a Symbol");
}

}
}