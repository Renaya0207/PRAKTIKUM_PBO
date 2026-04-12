package com.aplikasi.main;

import com.aplikasi.core.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
    static ArrayList<Layanan> dataLayanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        do{
            System.out.println("\n=== SISTEM PEMESANAN JASA CLEANING ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Tambah Layanan");
            System.out.println("4. Lihat Layanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch(pilih){
                case 1 -> tambahPelanggan();
                case 2 -> lihatPelanggan();
                case 3 -> tambahLayanan();
                case 4 -> lihatLayanan();
            }

        }while(pilih != 5);
    }

    static void tambahPelanggan(){
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("No HP: ");
        String hp = input.nextLine();

        dataPelanggan.add(new Pelanggan(nama, alamat, hp));
    }

    static void lihatPelanggan(){
        for(Pelanggan p : dataPelanggan){
            p.tampilkan();
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

        System.out.print("Harga per unit: ");
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

            // POLYMORPHISM (override)
            l.tampilkan();

            // OVERLOADING
            System.out.println("Total + tambahan 10000 : " + l.hitungTotal(10000));
            System.out.println("=======================");
        }
    }
}