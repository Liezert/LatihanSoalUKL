import java.util.Scanner;

public class Soal2_2 {
    public static void main(String[] args) {
        double phi = Math.PI;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari: ");
        int rusuk = input.nextInt();
        double r = (rusuk * rusuk);
        System.out.println();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();


        //Hitungan
        double Volume = phi * r * tinggi;
        double LuasPermukaan = 2 * phi * rusuk * (rusuk + tinggi);
        
        
        //Output
        System.out.println();
        System.out.println("Hasil Volume tabung: " + Volume + "cm3");
        System.out.println("Hasil Keliling tabung: " + LuasPermukaan + "cm2");

        input.close();
    }
}
