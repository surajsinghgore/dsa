interface A{
    void draw();
}
interface B{
    void print();
}

class C implements A,B{
public void draw(){System.out.println("Drawing ");}
public void print(){System.out.println("Priting ");}

}
public class MultipleInheritenace {
    public static void main(String[] args) {
       C c=new C();
       c.draw();
       c.print(); 
    }
}
