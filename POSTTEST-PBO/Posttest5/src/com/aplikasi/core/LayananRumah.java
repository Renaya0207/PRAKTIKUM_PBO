package com.aplikasi.core;

public class LayananRumah extends Layanan implements Diskon {

    private int jumlahKamar;

    public LayananRumah(String nama, int harga, int jumlahKamar){
        super(nama, harga);
        this.jumlahKamar = jumlahKamar;
    }

    @Override
    public int hitungTotal(){
        return getHarga() * jumlahKamar;
    }

    @Override
    public int hitungDiskon(int total){
        return total - 10000;
    }

    @Override
    public void infoDiskon(){
        System.out.println("Diskon layanan rumah: 10000");
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        int total = hitungTotal();
        System.out.println("Jumlah Kamar : " + jumlahKamar);
        System.out.println("Total        : " + total);
        System.out.println("Setelah Diskon: " + hitungDiskon(total));
        System.out.println("------------------");
    }
}