package com.aplikasi.core;

public class LayananKarpet extends Layanan {

    private int jumlahKarpet;

    public LayananKarpet(String nama, int harga, int jumlahKarpet){
        super(nama, harga);
        this.jumlahKarpet = jumlahKarpet;
    }

    @Override
    public int hitungTotal(){
        return getHarga() * jumlahKarpet;
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jumlah Karpet : " + jumlahKarpet);
        System.out.println("Total         : " + hitungTotal());
        System.out.println("------------------");
    }
}