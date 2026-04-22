import java.util.Scanner;

public class InputNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Apakah ingin input lagi? (y/t): ");
            lanjut = scanner.nextLine().trim().toLowerCase();

        } while (!lanjut.equals("t"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}