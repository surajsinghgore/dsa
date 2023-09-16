import java.util.Scanner;

public class uniqueoccurrence {
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
        System.out.println("\nOriginal Array  Which Is Entered By User");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find Unique Occurrence in array
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }

        // Printing Unique Value In Array 
        System.out.println("\nUnique Element In Array = "+ans);
       
        sc.close();
    }
}
