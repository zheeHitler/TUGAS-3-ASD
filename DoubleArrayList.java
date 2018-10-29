
import java.util.ArrayList;
import java.util.Scanner;

public class DoubleArrayList {
    public static void main(String[] args) {
        ArrayList<Double> DL = new ArrayList<Double>();
        System.out.println("MASUKKAN 3 ANGKA TIPE DOUBLE:");
        DL.add(new Scanner(System.in).nextDouble());
        DL.add(new Scanner(System.in).nextDouble());
        DL.add(new Scanner(System.in).nextDouble());
        System.out.println("HASIL Double :");
        System.out.println(DL.toString());
    }
    
}
