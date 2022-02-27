package kasus3;
/**
 * @author Ghessa Theniana
 */
public class KelasSatu {
    {
        System.out.println(11); //(inisialisasi)akan dipanggil jika ada objek dengan class yang didefinsikan
    }
    static {    // 1 blok static akan ditampilkan saat class dipanggil satu kali
        System.out.println(2);
    }
    public KelasSatu(int i) {   // constructor
        System.out.println(3);  // akan di running setelah inisialisasi & blok static selesai dijalankan
    }
    public KelasSatu() {    // constructor tanpa parameter
        System.out.println(4);  //akan dijalankan sesuai kebutuhan dan kondisi
    }
}
