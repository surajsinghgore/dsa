
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
        System.out.println("\nOriginal Array  Before Reverse  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

// reverse array 
int start=0;
int end=(arr.length-1);
while (start<=end) {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;end--;
}

// printing after reverse array
       System.out.println("\nAfter Reverse Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


      

        sc.close();
    }
}
