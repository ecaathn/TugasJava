package anime;
/**
 * @author Ghessa Theniana
 * @since 12-03-2022
 */
public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    

    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }

    void printDojutsu() {
        System.out.println(this.Dojutsu);
        setDojutsu(); // Menambahkan setDojutsu agar Mangekyou Sharingan tampil
        System.out.println(this.Dojutsu);
    }
    
    
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
        
    }
}

