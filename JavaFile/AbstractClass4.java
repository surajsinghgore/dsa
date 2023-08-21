abstract class Ac{

    abstract void on();
    abstract void running();

    abstract void off();
}

class LG extends Ac{

    void on(){
        System.out.println("LG AC IS ON \n");
    }
    void running(){
        System.out.println("AC is running at temperature 26\u00B0 \n");
    }
     void off(){
        System.out.println("LG AC IS OFF NOW\n");
    }
}


class Samsung extends Ac{

  
    void running(){
        System.out.println("AC is running at temperature 16\u00B0 \n");
    }
    void on(){
        System.out.println("Samsung AC IS ON \n");
    }
 
     void off(){
        System.out.println("Samsung AC IS OFF NOW\n");
    }
}
class Dankin extends Ac{

   void on(){
        System.out.println("Dankin AC IS ON \n");
    }
   
     void off(){
        System.out.println("Dankin AC IS OFF NOW\n");
    }
    void running(){
        System.out.println("AC is running at temperature 20\u00B0 \n");
    }
    
}

 class AbstractClass4 {
 public static void main(String[] args) {
    Ac a;
    System.out.println("--------------------------------------------------------\n");
    System.out.println(" \t\t LG AC \n");
    System.out.println("--------------------------------------------------------\n");
    a=new LG();
    a.on();
    a.running();
    a.off();

    System.out.println("--------------------------------------------------------\n");
    System.out.println(" \t\t Samsung AC \n");
    System.out.println("--------------------------------------------------------\n");
    a=new Samsung();
    a.on();
        a.running();

    a.off();


    System.out.println("--------------------------------------------------------\n");
    System.out.println(" \t\t Dankin AC \n");
    System.out.println("--------------------------------------------------------\n");
    a=new Dankin();
    a.on();
        a.running();

    a.off();
 }   
}
