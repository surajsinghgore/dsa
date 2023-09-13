import java.util.Scanner;

public class linearsearch {
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

        // ! Main Linear Search Program
        // which element wanted to search
        System.out.print("Enter Which Element Wanted To Search In Array = ");
        int search = sc.nextInt();
        boolean present = false;
        // Linear Search Logic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                present = true;
                break;
            }
        }

        // printing array
        System.out.print("\nOriginal Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // printing maximum / minimum

        System.out.println("Element Wanted to Search " + search);
        if (present) {
            System.out.println("Element Present In Array");

        } else {

            System.out.println("Element Not Present In Array");

        }

        sc.close();
    }
}
