import java.util.Scanner;

public class AplikasiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuUtama;

        do {
            System.out.println("\n=== SISTEM KAMPUS ===");
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Data Dosen");
            System.out.println("3. Nilai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menuUtama = input.nextInt();

            switch (menuUtama) {
                case 1:
                    menuMahasiswa(input);
                    break;
                case 2:
                    menuDosen(input);
                    break;
                case 3:
                    menuNilai(input);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menuUtama != 4);
    }

    static void menuMahasiswa(Scanner input) {
        int pilihan;
        System.out.println("\n-- Menu Mahasiswa --");
        System.out.println("1. Input Data");
        System.out.println("2. Tampilkan Status");
        System.out.print("Pilih: ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            if (umur < 18) {
                System.out.println("Mahasiswa " + nama + " terlalu muda!");
            } else if (umur <= 25) {
                System.out.println("Mahasiswa " + nama + " usia ideal");
            } else {
                System.out.println("Mahasiswa " + nama + " non-tradisional");
            }

        } else if (pilihan == 2) {
            System.out.print("IPK: ");
            double ipk = input.nextDouble();

            if (ipk >= 3.5) {
                System.out.println("Cumlaude");
            } else if (ipk >= 3.0) {
                System.out.println("Sangat Memuaskan");
            } else if (ipk >= 2.0) {
                System.out.println("Memuaskan");
            } else {
                System.out.println("Perlu perbaikan");
            }
        } else {
            System.out.println("Pilihan salah!");
        }
    }

    static void menuDosen(Scanner input) {
        int pilihan;
        System.out.println("\n-- Menu Dosen --");
        System.out.println("1. Status Mengajar");
        System.out.println("2. Golongan");
        System.out.print("Pilih: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Jumlah SKS: ");
                int sks = input.nextInt();

                if (sks < 6) {
                    System.out.println("Kurang beban mengajar");
                } else if (sks <= 12) {
                    System.out.println("Normal");
                } else {
                    System.out.println("Overload");
                }
                break;

            case 2:
                System.out.print("Golongan (A/B/C): ");
                char gol = input.next().charAt(0);

                switch (gol) {
                    case 'A':
                        System.out.println("Dosen Junior");
                        break;
                    case 'B':
                        System.out.println("Dosen Madya");
                        break;
                    case 'C':
                        System.out.println("Dosen Senior");
                        break;
                    default:
                        System.out.println("Golongan tidak dikenal");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuNilai(Scanner input) {
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Grade A");
        } else if (nilai >= 70) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else if (nilai >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

        // Percabangan tambahan (nested)
        if (nilai >= 60) {
            System.out.println("Lulus");
            if (nilai > 90) {
                System.out.println("Lulus dengan pujian!");
            }
        } else {
            System.out.println("Tidak lulus");
        }
    }
}