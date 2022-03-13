package Restaurant;
/**
 * @author Ghessa Theniana
 * @since 12-03-2022
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        System.out.println("Sebelum dipesan");
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        
        System.out.println("\n- Setelah dipesan -");
        menu.takeOrder("Bala-Bala", 3);
        menu.takeOrder("Gehu", 10);
        menu.takeOrder("Molen", 7);
        menu.takeOrder("Tahu", 2);
        menu.tampilMenuMakanan2();
    }
}
