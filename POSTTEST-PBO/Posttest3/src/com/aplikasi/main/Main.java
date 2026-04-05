package com.aplikasi.main;

import com.aplikasi.core.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
    static ArrayList<Layanan> dataLayanan = new ArrayList<>();
    static ArrayList<Pemesanan> dataPemesanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        do{
            System.out.println("\n=== SISTEM PEMESANAN JASA CLEANING ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Update Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Cari Pelanggan");
            System.out.println("6. Tambah Layanan");
            System.out.println("7. Lihat Layanan");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch(pilih){
                case 1 -> tambahPelanggan();
                case 2 -> lihatPelanggan();
                case 3 -> updatePelanggan();
                case 4 -> hapusPelanggan();
                case 5 -> cariPelanggan();
                case 6 -> tambahLayanan();
                case 7 -> lihatLayanan();
            }

        }while(pilih != 8);
    }

    static void tambahPelanggan(){
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("No HP: ");
        String hp = input.nextLine();

        dataPelanggan.add(new Pelanggan(nama,alamat,hp));
    }

    static void lihatPelanggan(){
        int no = 1;
        for(Pelanggan p : dataPelanggan){
            System.out.println("Data ke-" + no++);
            p.tampilkan();
        }
    }

    static void updatePelanggan(){

        if(dataPelanggan.isEmpty()){
            System.out.println("Data kosong!");
            return;
        }

        lihatPelanggan();

        System.out.print("Pilih nomor yang mau diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if(index >= 0 && index < dataPelanggan.size()){

            System.out.print("Nama baru: ");
            String nama = input.nextLine();

            System.out.print("Alamat baru: ");
            String alamat = input.nextLine();

            System.out.print("No HP baru: ");
            String hp = input.nextLine();

            dataPelanggan.get(index).setNama(nama);
            dataPelanggan.get(index).setAlamat(alamat);
            dataPelanggan.get(index).setNoHp(hp);

            System.out.println("Data berhasil diupdate!");
        }else{
            System.out.println("Index tidak valid!");
        }
    }

    static void hapusPelanggan(){

        if(dataPelanggan.isEmpty()){
            System.out.println("Data kosong!");
            return;
        }

        lihatPelanggan();

        System.out.print("Pilih nomor yang mau dihapus: ");
        int index = input.nextInt() - 1;

        if(index >= 0 && index < dataPelanggan.size()){
            dataPelanggan.remove(index);
            System.out.println("Data berhasil dihapus!");
        }else{
            System.out.println("Index tidak valid!");
        }
    }

    static void cariPelanggan(){

        System.out.print("Masukkan nama yang dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for(Pelanggan p : dataPelanggan){
            if(p.getNama().equalsIgnoreCase(cari)){
                p.tampilkan();
                ditemukan = true;
            }
        }

        if(!ditemukan){
            System.out.println("Data tidak ditemukan!");
        }
    }

    static void tambahLayanan(){

        System.out.println("1. Layanan Rumah");
        System.out.println("2. Layanan Kantor");
        System.out.println("3. Layanan Karpet");
        System.out.print("Pilih jenis: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Nama Layanan: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        if(jenis == 1){
            System.out.print("Jumlah kamar: ");
            int kamar = input.nextInt();
            dataLayanan.add(new LayananRumah(nama, harga, kamar));
        }
        else if(jenis == 2){
            System.out.print("Luas kantor: ");
            int luas = input.nextInt();
            dataLayanan.add(new LayananKantor(nama, harga, luas));
        }
        else if(jenis == 3){
            System.out.print("Jumlah karpet: ");
            int karpet = input.nextInt();
            dataLayanan.add(new LayananKarpet(nama, harga, karpet));
        }
    }

    static void lihatLayanan(){
        for(Layanan l : dataLayanan){
            l.tampilkan();
        }
    }
}