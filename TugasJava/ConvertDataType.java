package Operators1;
/**
 * author Ghessa Theniana
 * since 2022-02-12
 */
public class ConvertDataType {
    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
    
}


