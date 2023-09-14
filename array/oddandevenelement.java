import java.util.Scanner;

public class oddandevenelement {
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
        System.out.println("\nOriginal Array  Before Extract Odd And Even Element From Array  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Odd/Even Element Logic
        int oddElement[] = new int[arr.length];
        int oddIndex = 0, evenIndex = 0;
        int evenElement[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenElement[evenIndex] = arr[i];
                evenIndex++;
            } else {

                oddElement[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        System.out.println();
        // printing odd array
        System.out.println("\nOdd Array Elements");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddElement[i] + " ");
        }

        // printing even array
        System.out.println("\nEven Array Elements");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenElement[i] + " ");
        }

        sc.close();
    }
}
