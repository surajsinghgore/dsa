class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        int r = 5;
        double areaOfCircle = PI * r * r;

        double circumference = (2 * PI * r);

        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Circle ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" PI = " + PI + " Radius = " + r);
        System.out.println(" Area Of Circle PI*r*r " + areaOfCircle);
        System.out.println(" Circumference Of Circle 2*PI*r " + circumference);

        int length = 5;
        int breadth = 7;
        int parameter = 2 * (length + breadth);
        int areaOfReactangle = length * breadth;
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Reactangle ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Lenght = " + length + " Breadth = " + breadth);
        System.out.println(" Area Of Reactangle = " + areaOfReactangle);
        System.out.println(" Parameter Of Reactangle  = " + parameter);

    }
}
