package Sulit;

import java.util.Scanner;

public class Soal3_1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Siswa: ");
    int JumlahSis = input.nextInt();
    int awal = 1;
    int nilai, temp = 0;

    while (awal <= JumlahSis) {
        System.out.println("Nilai Siswa " + awal);
        nilai = input.nextInt();
        temp += nilai;
        awal++;
    }

    double rata = temp/JumlahSis;
    System.out.println("Rata-rata Kelas dengan jumlah " + JumlahSis + " adalah " + rata);
    input.close();
    }
}