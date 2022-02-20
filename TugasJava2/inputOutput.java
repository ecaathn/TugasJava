package inputOutput;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Input & Output</h1>
* Input & Output program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/

public class inputOutput {
    
    public static void main(String[] args) {
        
        //Deklarasi variabel
        int z;
    	String a; 
        
        //membuat scanner baru
        Scanner ex = new Scanner(System.in);
        
        //Memasukan scanner ex kedalam string a
        a = ex.nextLine();
        
        //Membuat array of string
        //untuk memisahkan string menjadi token berdasarkan format specifier
        String[] stringArray = a.split("[@ ? !_ , . ']+");
        
        //Memberi nilai awal pada var z dengan jumlah token pada stringArray
        z = stringArray.length;
        
        //Mencetak z
        System.out.println(z);
        
        //Mencetak token secara berurutan
        for(int i=0; i < z; i++){
            System.out.println(stringArray[i]);
        }
      }
    }