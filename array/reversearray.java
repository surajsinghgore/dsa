
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking array size from user
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        // initializing array
        int arr[] = new int[size];
        // taking input from user in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr [ " + i + " ] = ");
            arr[i] = sc.nextInt();
        }

     
       
        
        // printing original array
        System.out.println(arr.length+"\nOriginal Array  Before Reverse  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

// reverse array 
        int j=arr.length;
int arr2[]=new int[j];
for (int i= 0; i <arr.length; i++) {
        arr2[j-1]=arr[i];
        j=j-1;
}
// printing array
        System.out.println("\n After Reverse Array ");
      for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }   

      

        sc.close();
    }
}
