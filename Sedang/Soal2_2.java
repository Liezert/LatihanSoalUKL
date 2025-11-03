import java.util.Scanner;

public class Soal2_2 {
    public static void main(String[] args) {
        int phi = 22/7;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan rusuk: ");
        int rusuk = input.nextInt();
        double r = (rusuk * rusuk);
        System.out.println();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();


        //Hitungan
        double Volume = phi * r * tinggi;
        double Keliling = 2 * phi * r;
        
        
        //Output
        System.out.println();
        System.out.println("Hasil Volume tabung: " + Volume);
        System.out.println("Hasil Keliling tabung: " + Keliling);

        input.close();
    }
}
