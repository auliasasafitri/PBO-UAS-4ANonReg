import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Barang {
    private String nama;
    private double harga;
    private int jumlah;

    public Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}
