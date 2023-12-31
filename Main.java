import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    int i, n, kembali, bayar, total_semua = 0;

    String kode_barang[] = new String[10];
    String nama_barang[] = new String[10];
    int jmlh_kilo[] = new int[10];
    int harga[] = new int[10];
    int total_harga[] = new int[10];

    // Method Data barang
    public void setdata() {
        System.out.println("\n================================================");
        System.out.println("\t\tSELAMAT DATANG DI HANIFAH LAUNDRY");
        System.out.println("\t\t\tCABANG YOGYAKARTA");
        System.out.println("\n================================================");

        System.out.print("Masukan Nama Pegawai Kasir: ");
        String nama_pegawai = input.nextLine();
        System.out.print("Tanggal Transaksi Orderan : ");
        String tanggal = input.nextLine();

        // Input data pelanggan
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = input.next();
        System.out.print("Alamat Pelanggan: ");
        String alamatPelanggan = input.next();
        System.out.print("Nomor Telepon Pelanggan: ");
        String nomorTelepon = input.next();

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, alamatPelanggan, nomorTelepon);

        System.out.print("Jumlah Data Akan Dimasukan: ");
        n = input.nextInt();

        System.out.println("===========================================");

        for (i = 0; i < n; i++) {
            int number = i + 1;
            System.out.print("Data ke-" + number + " Masukan Kode Barang : ");
            kode_barang[i] = input.next();
            System.out.print("Jumlah Kilo Gram              : ");
            jmlh_kilo[i] = input.nextInt();

            // Switch statement for selecting the item based on the code
            switch (kode_barang[i]) {
                case "ML01":
                    harga[i] = 6000;
                    nama_barang[i] = "Baju";
                    break;
                case "ML02":
                    harga[i] = 7000;
                    nama_barang[i] = "Celana";
                    break;
                case "ML03":
                    harga[i] = 8000;
                    nama_barang[i] = "Sprei";
                    break;
                case "ML04":
                    harga[i] = 8000;
                    nama_barang[i] = "Boneka";
                    break;
                case "ML05":
                    harga[i] = 9000;
                    nama_barang[i] = "Selimut";
                    break;
                case "ML06":
                    harga[i] = 9500;
                    nama_barang[i] = "Karpet";
                    break;
                default:
                    nama_barang[i] = "-";
                    harga[i] = 0;
                    jmlh_kilo[i] = 0;
            }

            total_harga[i] = harga[i] * jmlh_kilo[i];
            total_semua += total_harga[i];
        }

        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t HANIFAH LAUNDRY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t    KASIR");
        System.out.println(
                "============================================================================================================");
        System.out.println("Nama Pegawai Kasir : " + nama_pegawai + "\t\t\t\t\t\t\t" + "Tanggal : " + tanggal);
        System.out.println("Jumlah Data        : " + n + "\t\t\t\t\t\t\t\tCabang  : Yogyakarta");

        System.out.println(
                "============================================================================================================");
        System.out.println("Data Ke-\tKode Barang\t\tNama Barang\t\tHarga Barang\tJumlah Kg\tTotal Harga");
        System.out.println(
                "============================================================================================================");

        for (i = 0; i < n; i++) {
            int number = i + 1;
            System.out.println(
                    number + "\t\t\t" + kode_barang[i] + "\t\t\t" + nama_barang[i] + "\t\t\t" + harga[i] + "\t\t\t\t" + jmlh_kilo[i] + "\t\t\t" + total_harga[i]);
        }

        System.out.println(
                "============================================================================================================");

//        System.out.println("\n\n===========================================");
        System.out.println("Grantotal Pembayaran: Rp." + total_semua);
        System.out.print("Pembayaran          : Rp.");
        bayar = input.nextInt();

        if (bayar >= total_semua) {
            kembali = bayar - total_semua;
            System.out.println("Kembalian           : Rp." + kembali);
            System.out.println("\n\t\t\t\t   TERIMA KASIH SUDAH MAMPIR KE HANIFAH LAUNDRY");
            System.out.println("\t\t\t\t    SEMOGA ANDA PUAS DENGAN PELAYANAN KAMI:)");
            System.out.println("");
        } else {
            System.out.println("\t\t\t\t\tMAAF UANG ANDA TIDAK CUKUP!!!");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);

        int x = 0, menu = 0;  // Declare menu here

        Main[] mln = new Main[100];

        while (menu != 2) {
            System.out.print("MENU UTAMA");
            System.out.print("\n1. Login\n2. Logout\nMASUKAN PILIHAN : ");
            menu = getint.nextInt();
            if (menu == 1) {
                x++;
                mln[x] = new Main();
                mln[x].setdata();
            } else if (menu == 2) {
                System.out.print("");
                System.out.println("ANDA TELAH LOGOUT DARI PROGRAM");
            } else {
                System.out.print("");
                System.out.println("MAAF PILIHAN MENU TIDAK TERSEDIA");
            }
        }
    }
}
