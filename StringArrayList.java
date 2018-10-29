
import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String [] args){
        ArrayList<String> STR = new ArrayList<String>();
        System.out.println("MASUKKAN NAMA MAHASISWA:");
        STR.add(new Scanner(System.in).nextLine());
        STR.add(new Scanner(System.in).nextLine());
        STR.add(new Scanner(System.in).nextLine());
       
        System.out.println("HASIL :");
        System.out.println(STR.toString());
       
    
    }
    
}
