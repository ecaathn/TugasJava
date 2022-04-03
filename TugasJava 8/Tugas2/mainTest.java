package Tugas2;
/**
 *
 * @author Ghessa Theniana
 */
public class mainTest {
    public static void main (String[] args){
        Shape s1 = new Shape();
        System.out.println("Shape with Color:" + s1.getColor() + "\nFilled " + s1.toString());
        
        System.out.println("==========================================");
        System.out.println("              Output Subclass             ");
        System.out.println("==========================================");
        
        Circle c1 = new Circle();
        System.out.println(c1);
        
        Rectangle r1 = new Rectangle(15,25);
        System.out.println(r1);
        
        Square sq1 = new Square(15, "green", false);
        System.out.println(sq1);
        sq1.setSide(20);
        System.out.println(sq1);
    }
}
