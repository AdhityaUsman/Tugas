import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;
        double totalNilai = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            totalNilai += nilai;
            jumlahData++;

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Apakah ingin input lagi? (y/t): ");
            lanjut = scanner.nextLine().trim().toLowerCase();

        } while (!lanjut.equals("t"));

        double rataRata = totalNilai / jumlahData;

        System.out.println("================================");
        System.out.println("Jumlah data  : " + jumlahData);
        System.out.println("Total nilai  : " + totalNilai);
        System.out.printf("Rata-rata    : %.2f%n", rataRata);
        System.out.println("================================");

        scanner.close();
    }
}