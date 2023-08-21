class Animal{void eat(){System.out.println("Animal Eating");}}
class Frog extends Animal{void eat(){System.out.println("Frog Eating");}
void jump(){
System.out.println("Frog Juming");

}
}

class Overloading1 {
   public static void main(String[] args) {
       Animal a=new Animal();
       Frog f=new Frog();
       a.eat();
      f.eat();
      f.jump(); 
    } 

}
