
package jobsheet11;
import java.util.Scanner;
public class CobaOperasiString {
    public static void main(String[] args)
    {
          String identitas = "Zidan Kamal Arzin / X RPL 2 / 40";
        System.out.println("Identitas : "+ identitas);
        
          String x = "Operasi";
        System.out.println("isi variabel  x : " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
         System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): " 
                + x.equals(z));
        
        String r = "operasi";
        System.out.println("isi cariable r : "+ r);
        System.out.println("isi variable s sama dengan r (Case Sensitive): " + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : " 
                + x.equalsIgnoreCase(r));
        
        
    }
    
}
