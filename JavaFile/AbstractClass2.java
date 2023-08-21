abstract class Bank{
abstract int ROI();
}

class HDFC extends Bank{
int ROI(){

    return 7;
}

}
class SBI extends Bank{
int ROI(){

    return 5;
}

}
 class AbstractClass2 {
    public static void main(String[] args) {
      Bank b;
      b=new HDFC();
      System.out.println("Rateb Of Interset "+b.ROI()+" % ");  
      b=new SBI();  
      System.out.println("Rateb Of Interset "+b.ROI()+" % ");  
    }
}
