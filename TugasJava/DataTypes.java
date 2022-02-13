package datatypes;
import java.util.Scanner;

/**
 *
 * author Ghessa Theniana
 * since 2022-02-12
 */


public class DataTypes {
    // membuat scanner baru
    static Scanner input = new Scanner (System.in);
    
 public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi Variabel
        int number;
        
        System.out.println("masukkan jumlah angka");
        // input user
        number = input.nextInt();
        
        // Deklarasi Variabel untuk menampung angka
        String[] angka = new String [number];
        
        System.out.println("input 5angka");
        
        for (int i = 0; i < number; i++) {
            angka[i] = input.next();
        }
        
        for (int i = 0; i < number; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{
                long parseLong = Long.parseLong(angka[i]);
                System.out.println(parseLong + " can be fitted in:");
                if(parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                    if(parseLong >= -2147483648 && parseLong <= 2147483647){
                         System.out.println("int");
                        if(parseLong >= -32768 && parseLong <= 32767){
                            System.out.println("short");
                        }
                    }
                }
                // masih bisa masuk long
            }catch(Exception e){
                //tidak bisa masuk ke manapun
                System.out.println(angka[i] + " can't be fitted anywhere");
                }
        }

    }
    
}
