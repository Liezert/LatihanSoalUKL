package Mudah;

import java.util.Scanner;

public class Soal1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        double angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        }else {
            System.out.println("Bilangan Ganjil");
        }

        input.close();
    }
}