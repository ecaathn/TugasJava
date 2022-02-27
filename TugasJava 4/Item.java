 package kasus2;
/**
 * @author Ghessa Theniana
 */
public class Item {
    private String name;
    private Item() {
        this.name = "Ipin"; //this digunakan untuk menunjuk suatu var pada class Item
    }
    public Item(String name) {
        this.name = "Ipin"; //mengisi var "this.name" dengan "Ipin"
        System.out.println(this.name);  //menampilkan
    }
}
