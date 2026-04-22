import java.util.Scanner;

public class InputMahasiswaSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Nim: ");
            String nim = input.nextLine();

            System.out.println("Data Mahasiswa: " + nama + "-" + nim);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (y/n): ");
            ulang = input.nextLine().charAt(0);
            input.nextLine();
            
        } while (ulang == 'y' || ulang == 'Y');
    }
}