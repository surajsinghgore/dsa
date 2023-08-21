interface drawable{

    void draw();
}

class moveable{
void move(){};
}

class Rectangle extends moveable implements drawable{
public void draw(){
System.out.println("drawing");
}
 public void move(){
System.out.println("Moving File");
 }
}

public class Multipleinterface {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.draw();
        r.move();
        
    }
}
