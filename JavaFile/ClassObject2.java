class Student {

    int rollNo ;
    String name ;
}

class ClassObject2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="Suraj Singh";
        s1.rollNo=2341579;
        s2.name="Rohan Kapoor";
        s2.rollNo=2341583;
        System.out.println("--- Student 1 --- RollNo = " + s1.rollNo + " Name = " + s1.name);
        System.out.println("--- Student 2 --- RollNo = " + s2.rollNo + " Name = " + s2.name);
     
    }
}
