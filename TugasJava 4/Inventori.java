package kasus1;
/**
 * @author Ghessa Theniana
 */
public class Inventori {
    Barang[] barangs;
    
    // Method
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }
    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);
        //barangs[0].stok -= 30; //Bisa juga dikurangi dong?
        //barangs[0].stok *= 30; //Bisa dikali dong?
        showBarang();
    }
    
    // Main method
   public static void main(String[] args) {
       Inventori beli = new Inventori();
       beli.pengadaan();    // objek beli memanggil method pengadaan
   }
}
