package com.aplikasi.core;

public class Pelanggan {

    private String nama;
    protected String alamat;
    String noHp;

    public Pelanggan(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public void tampilkan(){
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP  : " + noHp);
        System.out.println("------------------");
    }
}