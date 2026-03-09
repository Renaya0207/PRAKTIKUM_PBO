import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan {
    String nama;
    String alamat;
    String noHp;

    Pelanggan(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    void tampilkan() {
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP  : " + noHp);
        System.out.println("----------------------");
    }
}

class Layanan {
    String nama;
    int harga;

    Layanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Layanan : " + nama);
        System.out.println("Harga   : " + harga);
        System.out.println("----------------------");
    }
}

class Pemesanan {
    String pelanggan;
    String layanan;
    String tanggal;

    Pemesanan(String pelanggan, String layanan, String tanggal) {
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }

    void tampilkan() {
        System.out.println("Pelanggan : " + pelanggan);
        System.out.println("Layanan   : " + layanan);
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("----------------------");
    }
}

public class Main {

    static ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
    static ArrayList<Layanan> dataLayanan = new ArrayList<>();
    static ArrayList<Pemesanan> dataPemesanan = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        do {

            System.out.println("\n=== SISTEM PEMESANAN JASA CLEANING ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Update Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Tambah Layanan");
            System.out.println("6. Lihat Layanan");
            System.out.println("7. Update Layanan");
            System.out.println("8. Hapus Layanan");
            System.out.println("9. Tambah Pemesanan");
            System.out.println("10. Lihat Pemesanan");
            System.out.println("11. Update Pemesanan");
            System.out.println("12. Hapus Pemesanan");
            System.out.println("13. Keluar");

            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) tambahPelanggan();
            else if (pilih == 2) lihatPelanggan();
            else if (pilih == 3) updatePelanggan();
            else if (pilih == 4) hapusPelanggan();
            else if (pilih == 5) tambahLayanan();
            else if (pilih == 6) lihatLayanan();
            else if (pilih == 7) updateLayanan();
            else if (pilih == 8) hapusLayanan();
            else if (pilih == 9) tambahPemesanan();
            else if (pilih == 10) lihatPemesanan();
            else if (pilih == 11) updatePemesanan();
            else if (pilih == 12) hapusPemesanan();

        } while (pilih != 13);

        System.out.println("Program selesai.");
    }

    // ================= PELANGGAN =================

    static void tambahPelanggan() {

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("No HP: ");
        String hp = input.nextLine();

        dataPelanggan.add(new Pelanggan(nama, alamat, hp));

        System.out.println("Pelanggan berhasil ditambahkan.");
    }

    static void lihatPelanggan() {

        if (dataPelanggan.isEmpty()) {
            System.out.println("Data pelanggan kosong.");
            return;
        }

        for (int i = 0; i < dataPelanggan.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            dataPelanggan.get(i).tampilkan();
        }
    }

    static void updatePelanggan() {

        lihatPelanggan();

        System.out.print("Pilih nomor pelanggan: ");
        int i = input.nextInt() - 1;
        input.nextLine();

        System.out.print("Nama baru: ");
        dataPelanggan.get(i).nama = input.nextLine();

        System.out.print("Alamat baru: ");
        dataPelanggan.get(i).alamat = input.nextLine();

        System.out.print("No HP baru: ");
        dataPelanggan.get(i).noHp = input.nextLine();

        System.out.println("Data berhasil diupdate.");
    }

    static void hapusPelanggan() {

        lihatPelanggan();

        System.out.print("Pilih nomor yang dihapus: ");
        int i = input.nextInt() - 1;

        dataPelanggan.remove(i);

        System.out.println("Data berhasil dihapus.");
    }

    // ================= LAYANAN =================

    static void tambahLayanan() {

        System.out.print("Nama layanan: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        dataLayanan.add(new Layanan(nama, harga));

        System.out.println("Layanan berhasil ditambahkan.");
    }

    static void lihatLayanan() {

        if (dataLayanan.isEmpty()) {
            System.out.println("Data layanan kosong.");
            return;
        }

        for (int i = 0; i < dataLayanan.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            dataLayanan.get(i).tampilkan();
        }
    }

    static void updateLayanan() {

        lihatLayanan();

        System.out.print("Pilih nomor layanan: ");
        int i = input.nextInt() - 1;
        input.nextLine();

        System.out.print("Nama layanan baru: ");
        dataLayanan.get(i).nama = input.nextLine();

        System.out.print("Harga baru: ");
        dataLayanan.get(i).harga = input.nextInt();

        System.out.println("Layanan berhasil diupdate.");
    }

    static void hapusLayanan() {

        lihatLayanan();

        System.out.print("Pilih nomor yang dihapus: ");
        int i = input.nextInt() - 1;

        dataLayanan.remove(i);

        System.out.println("Layanan berhasil dihapus.");
    }

    // ================= PEMESANAN =================

    static void tambahPemesanan() {

        System.out.print("Nama pelanggan: ");
        String pelanggan = input.nextLine();

        System.out.print("Layanan: ");
        String layanan = input.nextLine();

        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();

        dataPemesanan.add(new Pemesanan(pelanggan, layanan, tanggal));

        System.out.println("Pemesanan berhasil ditambahkan.");
    }

    static void lihatPemesanan() {

        if (dataPemesanan.isEmpty()) {
            System.out.println("Data pemesanan kosong.");
            return;
        }

        for (int i = 0; i < dataPemesanan.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            dataPemesanan.get(i).tampilkan();
        }
    }

    static void updatePemesanan() {

        lihatPemesanan();

        System.out.print("Pilih nomor pemesanan: ");
        int i = input.nextInt() - 1;
        input.nextLine();

        System.out.print("Nama pelanggan baru: ");
        dataPemesanan.get(i).pelanggan = input.nextLine();

        System.out.print("Layanan baru: ");
        dataPemesanan.get(i).layanan = input.nextLine();

        System.out.print("Tanggal baru: ");
        dataPemesanan.get(i).tanggal = input.nextLine();

        System.out.println("Pemesanan berhasil diupdate.");
    }

    static void hapusPemesanan() {

        lihatPemesanan();

        System.out.print("Pilih nomor yang dihapus: ");
        int i = input.nextInt() - 1;

        dataPemesanan.remove(i);

        System.out.println("Pemesanan berhasil dihapus.");
    }
}