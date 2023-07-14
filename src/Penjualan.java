import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Penjualan {
    public static void main(String[] args) {
        List<Barang> keranjangBelanja = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Aplikasi Kasir Penjualan ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Keranjang Belanja");
            System.out.println("3. Total Harga");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Kode untuk tambah barang
                    break;
                case 2:
                    // Kode untuk tampilkan keranjang belanja
                    break;
                case 3:
                    // Kode untuk total harga
                    break;
                case 4:
                    // Kode untuk keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}
