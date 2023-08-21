interface printable{

    void print();
      void display();
}

class first implements printable{
public void print(){System.out.println("Priting Function");}
public void display(){System.out.println("Displaying Result");}

}
class Interface1{

    public static void main(String[] args) {
        first f=new first();
        f.print();
        f.display();
    }
}