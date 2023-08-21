class Box{
int length,breadth,height;
Box(int l,int b,int h){
length=l;breadth=b;height=h;

}
void volume(){
System.out.println("The volume of Box is "+(length*breadth*height));
}
}



class BoxWeight extends Box{
int weight;
BoxWeight(int l,int b,int h,int w){
super(l, b, h);
weight=w;
}
void weights(){
System.out.println("weight is "+weight);
}
}

public class SuperClass {
    public static void main(String[] args) {
        BoxWeight b=new BoxWeight(10, 2, 30, 40);
        b.volume();
        b.weights();
        System.out.println("weight is outer "+b.weight);
    }
}
