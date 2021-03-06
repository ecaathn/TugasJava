package Tugas2;
public class Square extends Rectangle{
    // Constructor
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    // Getter setter
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        setSide(side);
    }
    
    @Override
    public void setLength(double side){
        setSide(side);
    }
    @Override
    public String toString(){
        return "A Square with side = " + getSide()+ ",wich is a subclass of " + super.toString();
    }
    
    public double getPerimeter(){
        return 4*getSide();
    }
}
