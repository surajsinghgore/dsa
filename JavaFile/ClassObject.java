class Student {

    int rollNo = 2341579;
    String name = "Suraj Singh";
}

class ClassObject {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("RollNo = " + s.rollNo + " Name = " + s.name);
       System.out.println("RollNo = " + s.rollNo );
 System.out.println( "Name = " + s.name);
    }
}
