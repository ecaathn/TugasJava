package Tugas3;
/**
 *
 * @author Ghessa Theniana
 */
abstract class Sortable {

    static void shell_sort(Employee[] staff) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public abstract int compare(Sortable b);
    public static void shell_short(Sortable[] a){
        //Shell short body
        int n = a.length;
        
        //Start with a big gap, then reduce the gap
        for(int gap = n/2; gap > 0; gap/=2){
            // Do a gapped insertion sort for this gap size
            // The first gap elements a[0.. gap-1] are already
            for(int i = gap; i < n; i +=1){
                // Add a[i] to the elements that have been gap
                // sorted save a[i] in temp
                // make a hole at position i
                Sortable temp = a[i];
                
                int j;
                for(j = i; j >= gap && a[j-gap].compare(temp)< 0; j -= gap){
                    a[j] = a[j - gap];
                    
                // put temp in its correct location
                a[j] = temp;
                }
            }
        }
    }
}
