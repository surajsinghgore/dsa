public class complimentofbase10 {
    public static void main(String[] args) {
        int num=5;
        int mask = 1;

        while (mask < num){

            mask = (mask << 1) + 1;
            System.out.println(mask);
        }
    
        int res= mask ^ num;
System.out.println(res);

    }
}
