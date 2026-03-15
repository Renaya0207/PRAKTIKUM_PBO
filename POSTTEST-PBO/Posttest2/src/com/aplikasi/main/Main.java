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
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch(pilih){

                case 1 -> tambahPelanggan();
                case 2 -> lihatPelanggan();

            }

        }while(pilih != 3);
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

        for(Pelanggan p : dataPelanggan){
            p.tampilkan();
        }

    }
}