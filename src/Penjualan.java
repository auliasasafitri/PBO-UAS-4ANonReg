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
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    Barang barang = new Barang(nama, harga, jumlah);
                    keranjangBelanja.add(barang);
                    System.out.println("Barang berhasil ditambahkan ke keranjang belanja.");
                    System.out.println();

                    break;
                case 2:
                    // Kode untuk tampilkan keranjang belanja
                    System.out.println("Keranjang Belanja:");
                    for (int i = 0; i < keranjangBelanja.size(); i++) {
                        Barang b = keranjangBelanja.get(i);
                        System.out.println("Barang " + (i + 1) + ":");
                        System.out.println("Nama: " + b.getNama());
                        System.out.println("Harga: Rp" + b.getHarga());
                        System.out.println("Jumlah: " + b.getJumlah());
                        System.out.println();
                    }

                    break;
                case 3:
                    // Kode untuk total harga
                    double totalHarga = 0;
                    for (Barang b : keranjangBelanja) {
                        totalHarga += b.getHarga() * b.getJumlah();
                    }
                    System.out.println("Total Harga: Rp" + totalHarga);
                    System.out.println();

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
