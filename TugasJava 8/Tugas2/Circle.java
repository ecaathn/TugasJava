package Tugas2;
public class Circle extends Shape{
    private double radius;
    
   //constructor
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius) {
        super(); // call superclass no-arg constructor Circle()
        this.radius = radius;
 }
 // Constructor with default color, but given radius, height
    public Circle(double radius, String color, boolean filled) {
        super(color,filled); // call superclass constructor Circle(r)
        this.radius = radius;
 }
    // getter setter
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }
    @Override
    public String toString(){
        return "A Circle with radius = " + getRadius()+ ", wich is a subclass of " + super.toString();
    }
}
