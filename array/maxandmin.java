import java.util.Scanner;

public class maxandmin {
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

        // finding maximum in array
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // minimum
            if (min > arr[i]) {
                min = arr[i];
            }
            // maximum
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // printing maximum / minimum
        System.out.println("Maximum Element In Array = " + max + " and minimum = " + min);
        sc.close();
    }
}
