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

    public String getPelanggan(){
        return pelanggan;
    }

    public void setPelanggan(String pelanggan){
        this.pelanggan = pelanggan;
    }

    public String getLayanan(){
        return layanan;
    }

    public void setLayanan(String layanan){
        this.layanan = layanan;
    }

    public String getTanggal(){
        return tanggal;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public void tampilkan(){
        System.out.println("Pelanggan : " + pelanggan);
        System.out.println("Layanan   : " + layanan);
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("------------------");
    }
}