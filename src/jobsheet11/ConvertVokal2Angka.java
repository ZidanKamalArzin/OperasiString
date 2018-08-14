
package jobsheet11;
import java.util.Scanner;
public class ConvertVokal2Angka {
private static void tampilJudul(String identitas) 
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka\n");
    }
private static String tampilInput() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Masukan Kalimat : ");
    String kalimat = scanner.nextLine();
    System.out.println("Kalimat Asli : " + kalimat );
    
    return kalimat;
    }

}

