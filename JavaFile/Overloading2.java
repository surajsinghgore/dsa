class Animal{void eat(){System.out.println("Animal Eating");}}
class Frog extends Animal{void eat(){System.out.println("Frog Eating");}
void jump(){
System.out.println("Frog Juming");

}
}

class Overloading2 {
   public static void main(String[] args) {
       Animal a=new Animal();
       Animal f=new Frog();
       a.eat();
      f.eat();
   
    } 

}
