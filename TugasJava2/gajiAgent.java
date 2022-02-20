package gajiAgent;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Gaji Agent</h1>
* Gaji Agent program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/

public class gajiAgent {
    public static void main(String[] args) {
        
        // Kamus Data
        int totalItem;
        double denda, uangBonus, totalGaji;
        
        // Membuat Scanner baru
        Scanner scan = new Scanner(System.in);
        // Memasukkan Scanner ke var
        totalItem = scan.nextInt();
        
        // Cek kondisi berdasarkan item yang terjual dan perhitungan bonus&denda
        if(totalItem >= 40) {
        	uangBonus = (25*0.01)*(totalItem*50000);
        	totalGaji = 500000 + uangBonus;
        }else if(totalItem >= 80) {
        	uangBonus = (35*0.01)*(totalItem*50000);
        	totalGaji = 500000 + uangBonus;
        }else if(totalItem <= 15) {
        	totalItem = 15 - totalItem;
        	denda = (15*0.01)*(totalItem*50000);
        	totalGaji = 500000 - denda;
        }else {
        	uangBonus = (10*0.01)*(totalItem*50000);
        	totalGaji = 500000 + uangBonus;
        }
        // Menampilkan hasil total gaji Agent
        System.out.println((int)totalGaji);	// (int) digunakan untuk mengubah tipe data totalGaji ke tipe int 
    }
}