package kasus1;
/**
 *
 * @author Ghessa Theniana
 */
public class Barang {
    // Atribute
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    // Constructor
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }
    
    // Accessor (mengambil nilai)
    public String getKodeBarang(){
        return this.kode_barang;
    }
    public String getNamaBarang(){
        return this.nama_barang;
    }
    public int getStok(){
        return this.stok;
    }
    
    // Mutator (mengubah nilai)
    public void setStok(int stk){
        this.stok += stk;
    }
}
