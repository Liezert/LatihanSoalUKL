import java.util.Scanner;

public class Soal2_2 {

    public static void volumeTabung(int jari, int tinggi) {
         double volume, PI = Math.PI;

         volume = PI * jari * jari * tinggi;
         System.out.println("Hasil Volume tabung: " + volume + "cm3");
        }
    public static void luasPermukaanTabung(int jari, int tinggi) {
         double luasPermukaan, PI = Math.PI;
         
         luasPermukaan = 2 * PI * jari * (jari + tinggi);
         System.out.println("Hasil Keliling tabung: " + luasPermukaan + "cm2");
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari-jari: ");
        int jari = input.nextInt();
        System.out.println();

        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        System.out.println();

        volumeTabung(jari, tinggi);
        luasPermukaanTabung(jari, tinggi);

    }   
}
