public class Overloading {

    void test() {
        System.out.println("Wihtout Paramter ");

    }

    void test(int a) {

        System.out.println(" A : " + a);

    }

    void test(int a, int b) {

        System.out.println("A : " + a + " B : " + b);
    }

    public static void main(String[] args) {
        Overloading v = new Overloading();
        v.test();
        v.test(10, 20);
        v.test(30);

    }
}
