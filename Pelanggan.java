import java.util.Scanner;

class Pelanggan {
    // Deklarasi Variable Pelanggan
    String namaPelanggan;
    String alamatPelanggan;
    String nomorTelepon;

    // Constructor
    public Pelanggan(String namaPelanggan, String alamatPelanggan, String nomorTelepon) {
        this.namaPelanggan = namaPelanggan;
        this.alamatPelanggan = alamatPelanggan;
        this.nomorTelepon = nomorTelepon;
    }

    // Method untuk menampilkan informasi pelanggan
    public void displayInfo() {
        System.out.println("Informasi Pelanggan:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Alamat Pelanggan: " + alamatPelanggan);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }
}
