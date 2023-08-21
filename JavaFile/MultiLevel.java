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

class HorseBaby extends Horse{

    void weep() {
        System.out.println("HorseBaby Weeping");
    }
}


public class MultiLevel {
    public static void main(String[] args) {
        HorseBaby h = new HorseBaby();
        h.eat();
        h.run();
        h.weep();
    }
}


