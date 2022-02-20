package bigNumber;
import java.util.*; // Digunakan untuk pembuatan Scanner
import java.math.BigInteger; // Digunakan untuk membuat tipe data BigInteger

/**
* <h1>Big Number</h1>
* Big Number program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/

public class bigNumber {
    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner scan = new Scanner(System.in);
        
        // Membuat variabel dengan tipe data BigInteger dan memasukan scanner ke dalamnya
        BigInteger x = scan.nextBigInteger();
        BigInteger y = scan.nextBigInteger();
        
        // Memberi nilai awal c sebagai hasil dari a + b
        BigInteger c = x.add(y);
        
        // Memberi nilai awal d sebagai hasil dari a * b
        BigInteger d = x.multiply(y);
        
        // Menampilkan c dan d
        System.out.println(c);
        System.out.println(d);
    }
}
