import java.util.Scanner;

public class sumandproduct {
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
        int sum=0;
        int product=1;

        for (int i = 0; i < arr.length; i++) {
            // minimum
            sum=sum+arr[i];
            if(arr[i]>0){
product=product*arr[i];

            }
        }
        // printing array
        System.out.print("\nOriginal Array = ");
for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
System.out.println();
        // printing maximum / minimum
        System.out.println("Sum of Element In Array = "+sum+"\n Product of Element In Array = "+product);



        sc.close();
    }
}

