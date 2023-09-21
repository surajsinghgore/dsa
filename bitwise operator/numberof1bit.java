public class numberof1bit {
    public static void main(String[] args) {
        int num = 10;
        int temp = num;
        int countBit = 0;
        while (num != 0) {
            if ((num&1)==1) {

                countBit++;

            }
            num = num >> 1;
        }

        System.out.println("Number of 1 bit in " + temp + " is " + countBit);
    }
}
