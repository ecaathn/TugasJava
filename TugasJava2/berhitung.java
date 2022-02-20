package berhitung;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Berhitung!!!</h1>
* Berhitung program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/
public class berhitung{
    public static void main(String[] args) {
        // Deklarasi Variabel
        int hasilOperasi, A, B;
        char operator;
        
        // Membuat Scanner Baru
        Scanner scan = new Scanner(System.in);
        
        // Memasukan scanner ke variabel
        A = scan.nextInt();
        operator = scan.next().charAt(0);	//char At digunakan untuk memasukan scanner ke var bertipe data char.
        B = scan.nextInt();
        
        // Dilakukan cek operator berdasarkan input user kemudian menampilkan hasil operasi.
        if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){
            switch(operator){
                case '+' : hasilOperasi = A + B;
                System.out.println(hasilOperasi); break;
                case '-' : hasilOperasi = A - B;
                System.out.println(hasilOperasi); break;
                case '*' : hasilOperasi = A * B;
                System.out.println(hasilOperasi); break;
                case '/' : hasilOperasi = A / B;
                System.out.println(hasilOperasi); break;
                case '%' : hasilOperasi = A % B;
                System.out.println(hasilOperasi); break;
                default : System.out.println("Operator yang diinputkan SALAH ");
            }
        }else
                System.out.println("Angka yang diinputkan SALAH ");                        
            }
        }