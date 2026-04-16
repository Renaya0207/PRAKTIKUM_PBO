package com.aplikasi.core;

public class LayananKarpet extends Layanan implements Diskon {

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
    public int hitungDiskon(int total){
        return total - 5000;
    }

    @Override
    public void infoDiskon(){
        System.out.println("Diskon layanan karpet: 5000");
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        int total = hitungTotal();
        System.out.println("Jumlah Karpet : " + jumlahKarpet);
        System.out.println("Total         : " + total);
        System.out.println("Setelah Diskon: " + hitungDiskon(total));
        System.out.println("------------------");
    }
}