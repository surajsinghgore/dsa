interface printable{

    void draw();
      
}

class Rectangle implements printable{
public void draw(){System.out.println("Drawing Rectangle");}
}
class Circle implements printable{
public void draw(){System.out.println("Drawing Circle");}
}
class Interface2{

    public static void main(String[] args) {
       Rectangle r=new Rectangle();
       Circle c=new Circle();
       r.draw();
       c.draw();
    }
}