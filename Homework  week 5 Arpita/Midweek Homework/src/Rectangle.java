public class Rectangle {
    public static void main(String[] args) {
        int l=2;
        int w=3;
        double a =l*w;
        System.out.println("Area of Rectangle (in Millimeter) = "+a+"mm");
        a = a/10;
        System.out.println("Area of Rectangle (in Centimeter) = "+a+"cm");
        a = a/100;
        System.out.println("Area of Rectangle (in Meter) = "+a+"m");
    }
}
