public class Swapnumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("----------------------------------------------------------");
        System.out.println("Before Swapping");
        System.out.println("----------------------------------------------------------");
        System.out.println(" A = " + a + " B = " + b);

        System.out.println("----------------------------------------------------------");
        System.out.println("After Swapping");
        System.out.println("----------------------------------------------------------");
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" A = " + a + " B = " + b);

    }
}
