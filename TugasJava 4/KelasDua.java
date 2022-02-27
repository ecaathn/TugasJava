package kasus3;
/**
 * @author Ghessa Theniana
 */
public class KelasDua {
    {
        System.out.println(5);  //tidak akan tampil karena tidak ada pembuatan objek dg class "KelasDua"
    }
    public static void main(String[] args) {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();   //digunakan untuk memanggil atribut di class KelasSatu
        KelasSatu dua = new KelasSatu(10);  //memanggil parameter untuk menggunakan constructor int i
    }
}
