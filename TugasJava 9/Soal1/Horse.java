package Soal1;
/**
 *
 * @author Ghessa Theniana
 */
public class Horse extends Animal {
    @Override
    public void sound(){
        System.out.println("heigh");
    }
    
    public static void main (String args[]){
        Animal obj = new Horse();
        obj.sound();
    }
}
