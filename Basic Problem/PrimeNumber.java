import java.util.Scanner;
class PrimeNumber{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of Prime Number wanted to Print : ");
int n=sc.nextInt();
int count=0;



if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{ 

for(int i=2;i<n;i++){ 
    
 int chk=0;    
  for(int j=2;j<i;j++){
  if(i%j==0){
  chk++;
  break;
  }
  }
  if(chk==0){
  System.out.print(i+" ");
  }
  }
  




}
}
}