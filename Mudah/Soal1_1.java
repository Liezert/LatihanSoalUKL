package Mudah;

import java.util.Scanner;

public class Soal1_1 {
public static void main(String[] args) {
        int jarak;
        int volume, berat;
        int panjang, lebar, tinggi;
        double Biaya, hargajarak, pajakvolume;

        //Pembukaan
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di penghitungan Ekspedisi!!");
        System.out.print("Masukkan panjang barang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar barang: ");
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi barang: ");
        tinggi = input.nextInt();
        
        System.out.println("==========================");
        System.out.println();
        System.out.print("Masukkan berat barang: ");
        berat = input.nextInt();
        
        //Rumus
        volume = panjang * lebar * tinggi;
        
        //Menghitung jarak tempuh
        System.out.println("==========================");
        System.out.println();
        System.out.print("Masukkan jarak tempuh: ");
        jarak = input.nextInt();
        
        if (jarak <= 10) {
            hargajarak = berat * 4250;
        } else {
            hargajarak = berat * 6000;
        }

        if (volume >= 100) {
            pajakvolume = 50000;
        }else{
            pajakvolume = 0;
        }

        Biaya = pajakvolume + hargajarak;

        //Hasil
        System.out.println("=========================================");
        System.out.println("Hasil jarak tempuh anda: " + jarak + "km");
        System.out.println("Total berat barang anda: " + berat + "kg");
        System.out.println("Hasil Volume anda: " + volume + "cm3");
        System.out.println("=========================================");
        System.out.println("Harga Jarak: " + "Rp."+ hargajarak );
        System.out.println("Hasil total yang anda harus bayar: " + "Rp."+ Biaya );

        input.close();
    }
}