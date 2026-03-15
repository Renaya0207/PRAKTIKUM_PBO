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

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        if(harga < 0){
            System.out.println("Harga tidak boleh negatif");
            this.harga = 0;
        }else{
            this.harga = harga;
        }
    }

    public void tampilkan(){
        System.out.println("Layanan : " + nama);
        System.out.println("Harga   : " + harga);
        System.out.println("------------------");
    }
}