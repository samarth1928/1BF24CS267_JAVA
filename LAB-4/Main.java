import java.util.Scanner;
abstract class Shape{
    int l;
    int b;
    Shape(int l,int b){
        this.l=l;
        this.b=b;
    }
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int l,int b){
        super(l,b);
    }
    void printArea(){
       System.out.println("Area of rectangle:"+l*b);
}
}
class Circle extends Shape{
    Circle(int r){
        super(r,0);
    }
    void printArea(){
       System.out.println("Area of circle:"+(double)(3.14*l*l));
}
}
class Triangle extends Shape{
    Triangle(int base,int height){
        super(base,height);
    }
    void printArea(){
       System.out.println("Area of Triangle:"+(double)(0.5*l*b));
}
}
public class Main{
    public static void main(String[] args){
        int l,b,r,base,height;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the dimensions of rectangle(length and breadth):");
        l=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter the dimensions of circle(radius):");
        r=s.nextInt();
        System.out.println("Enter the dimensions of triangle(base and height):");
        base=s.nextInt();
        height=s.nextInt();
        Shape ob1=new Rectangle(l,b);
        Shape ob2=new Circle(r);
        Shape ob3=new Triangle(base,height);
        ob1.printArea();
        ob2.printArea();
        ob3.printArea();

    }
}