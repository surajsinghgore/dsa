import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number of Prime Number You Wanted to Print ");
        // int number = sc.nextInt();
        
        // System.out.println("1 is Not Prime");
        // int m=number/2; 
        // for (int i = 2; i <=m; i++) {
        //     if(number%i!=0)  {  
        //         System.out.println(i + " Prime");
        //     } 
        // }
        // sc.close();

        int i =0;
       int num =0;
       
       String  prime_numbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
    	  {
             if(i%num==0)
    	     {
     		    counter = counter + 1;
    	     }
    	  }
    	  if (counter ==2)
    	  {
    	     prime_numbers = prime_numbers + i + " ";
    	  }	
       }	
       System.out.println("Prime Numbers between 1 and 100 :");
       System.out.println(prime_numbers);
    }
}
