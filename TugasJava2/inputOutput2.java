package inputOutput2;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Input & Output (2)</h1>
* Input & Output (2) program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/

public class inputOutput2 {
        public static void main(String[] args){
            
            //Deklarasi Variabel
        	int bil;
            String kata;
            
            //Membuat array of string dan array of integer
            String[] arrayKata = new String[3];
            int[] arrayInt = new int[3];
            
            //Membuat Scanner baru
            Scanner scan = new Scanner(System.in);
            
            //Memasukan scanner ke array dengan proses looping
            for(int i=0; i<3; i++){
                kata = scan.next();
                arrayKata[i] = kata;
                bil =scan.nextInt();
                arrayInt[i] = bil;
                }
            //Menampilkan output
            System.out.println("=====================");
            for(int i=0; i<3; i++){
                //Menampilkan output dengan format 15 karakter diluruskan ke kiri
                //karakter ke 16 menghasilkan output 3 digit angka yang dimulai dengan angka 0
                System.out.format("%-15s%03d%n", arrayKata[i], arrayInt[i]);
            }
           System.out.println("=====================");
        }
}
