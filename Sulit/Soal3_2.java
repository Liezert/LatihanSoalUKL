package Sulit;
import java.util.Scanner;   

public class Soal3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Kolom: ");
        int kolom = input.nextInt();
        System.out.print("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
        
        int [][] matriksA = new int [baris][kolom];
        int [][] matriksB = new int [baris][kolom];
        int [][] matriksHasil = new int [baris][kolom];

        System.out.println("\n ---- Matriks A ----");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks[" + i + "] " + "[" + j+ "] : ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\n ---- Matriks B ----");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks[" + i + "] " + "[" + j+ "] :");
                matriksB[i][j] = input.nextInt();
            }
        }

            for (int i1 = 0; i1 < baris; i1++) {
                for (int j = 0; j < kolom; j++) {
                    matriksHasil[i1][j] = matriksA[i1][j] + matriksB[i1][j]; 
                }
            }

            System.out.println("Hasil Matriks A + B ");
            for (int i1 = 0;  i1 < baris; i1++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.printf("%5d", matriksHasil[i1][j]);
                }
                System.out.println();
            }
        input.close();
            
    }
}
