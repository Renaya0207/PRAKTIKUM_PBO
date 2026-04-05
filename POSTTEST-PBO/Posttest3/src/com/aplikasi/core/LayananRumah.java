package com.aplikasi.core;

public class LayananRumah extends Layanan {

    private int jumlahKamar;

    public LayananRumah(String nama, int harga, int jumlahKamar){
        super(nama, harga);
        this.jumlahKamar = jumlahKamar;
    }

    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jumlah Kamar : " + jumlahKamar);
        System.out.println("------------------");
    }
}