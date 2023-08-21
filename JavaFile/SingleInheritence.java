class Animal {

    void eat() {
        System.out.println("Animal Is Eating");
    }
}

class Horse extends Animal {

    void run() {
        System.out.println("Horse Is Running");
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.run();
    }
}
