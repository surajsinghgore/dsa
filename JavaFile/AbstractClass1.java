abstract class Shape{

    abstract void draw();
}

class Circle extends Shape{

    void draw(){

        System.out.println("Circle Draw");
    }
}

class Reactagle extends Shape{

    void draw(){

        System.out.println("Reactagle Draw");
    }
}



public class AbstractClass1 {
 public static void main(String[] args) {
    Circle c=new Circle();
    Reactagle r=new Reactagle();
    c.draw();
    r.draw();
 }   
}
