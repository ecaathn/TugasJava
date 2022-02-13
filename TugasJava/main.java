package strings;
import java.util.Scanner;
/**
 * author Ghessa Theniana
 * since 2022-02-13
 */
public class main {
    
    public static void main(String[] args) { 
        // membuat scanner 
        Scanner keyboard = new Scanner(System.in);
        // deklarasi variabel
        String x, y, output;
        int jumlah;
        
        // user menginputkan string
        x = keyboard.next();
        y = keyboard.next();
        
        jumlah = x.length() + y.length();
        System.out.println(jumlah);
        
        if(x.compareTo(y) > 0){
            System.out.println("Yes");
        }else if(y.compareTo(x) > 0){
            System.out.println("No");
        }else{
            System.out.println("Are Equals");
        }
        
        output = x.substring(0,1).toUpperCase() + x.substring(1) + " " + y.substring(0,1).toUpperCase() + y.substring(1);
        System.out.println(output);
    }
}
