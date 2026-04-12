package com.aplikasi.core;

public class Layanan {

    private String nama;
    private int harga;

    public Layanan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }

    public void tampilkan(){
        System.out.println("Layanan : " + nama);
        System.out.println("Harga   : " + harga);
    }

    // METHOD UTAMA (akan dioverride)
    public int hitungTotal(){
        return harga;
    }

    // OVERLOADING
    public int hitungTotal(int tambahan){
        return hitungTotal() + tambahan;
    }
}