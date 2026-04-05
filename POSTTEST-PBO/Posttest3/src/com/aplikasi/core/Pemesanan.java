package com.aplikasi.core;

public class Pemesanan {

    private String pelanggan;
    private String layanan;
    private String tanggal;

    public Pemesanan(String pelanggan, String layanan, String tanggal){
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }

    public void tampilkan(){
        System.out.println("Pelanggan : " + pelanggan);
        System.out.println("Layanan   : " + layanan);
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("------------------");
    }
}