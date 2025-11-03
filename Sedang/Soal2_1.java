import java.util.Scanner;

public class Soal2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Faktorial anda: ");
        int angkaFaktorial = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= angkaFaktorial; i++) {
            hasil *= i;
        }

        System.out.println("Hasil dari faktorial " + angkaFaktorial + " adalah: " + hasil);

        input.close();
    }
}
