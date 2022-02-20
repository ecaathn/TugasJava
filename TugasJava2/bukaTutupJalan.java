package bukaTutupJalan;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Buka Tutup Jalan</h1>
* Buka Tutup Jalan program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-19
*/
public class bukaTutupJalan {
    public static void main(String[] args){
    	
        // Membuat Scanner baru
        Scanner scan = new Scanner(System.in);
        
        //membuat array int
        int[] arr = new int[4];
        
        //memasukan scanner kedalam array int
        for(int i=0; i<4; i++ ){
            arr[i] = scan.nextInt();
        }
        
        //membuat string untuk menampung hasil array int menjadi string.
        String x = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");	//(replaceAll()) u/menghapus karakter "[", ",", dan "]" dari output toString()
        
        //untuk mengconvert tipe string ke tipe data long
        long bil = Long.parseLong(x);
        
        // Cek kondisi 
        if((bil-999999)%5==0){
            System.out.println("jalan");
        }else {
            System.out.println("berhenti");
        }
    }
}
