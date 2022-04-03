package Tugas2;
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    //Constructor
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle (double width, double length, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    
    //getter setter
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getLength()+ getWidth());
    }
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth()+ "and length = " + getLength()+ ", wich is a subclass of " + super.toString();
    }
}
