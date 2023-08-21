class Animal{
Animal(){
    System.out.println("Inside Animal");
}

}

class Horse extends Animal{
Horse(){
    System.out.println("Inside Horse ");
}

}



class  DynamicMethod1{
    public static void main(String[] args) {
        Horse h=new Horse();
    }
}
