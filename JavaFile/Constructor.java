
class defaultConstructor {

}

class withoutParameterConstructor {

    withoutParameterConstructor() {

        System.out.println("Without Paramter Constructor");

    }

}

class ParameterConstructor {
    int rollNo;
    String Name;

    ParameterConstructor(int r, String N) {
        rollNo = r;
        Name = N;

    }

    void display() {
        System.out.println("RollNo = " + rollNo + " Name = " + Name);
    }

}

public class Constructor {
    public static void main(String[] args) {

        // default constructor
        defaultConstructor d = new defaultConstructor();
        // withoutParameterConstructor
        withoutParameterConstructor wp = new withoutParameterConstructor();

        // Parameter Constructor

        ParameterConstructor s1 = new ParameterConstructor(111, "suraj singh");

        ParameterConstructor s2 = new ParameterConstructor(112, "Rohan Kapoor");
        s1.display();
        s2.display();

    }
}
