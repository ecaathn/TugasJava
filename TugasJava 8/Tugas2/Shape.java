package Tugas2;
public class Shape {
    private String color;
    private boolean filled;

    //constructor
    public Shape(){
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled){
        color = color;
        filled = filled;
    }
    // getter setter
    public void setColor(){
        this.color = color;
    }
    public void setFilled(){
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean getFilled(){
        return filled;
    }
    //method
    public String toString(){
        if(filled == true){
         return "A Shape with color " + getColor()+ " was filled";   
        }else {
           return "A Shape with color " + getColor()+ " was not filled"; 
        }
    }
    
    
    
}