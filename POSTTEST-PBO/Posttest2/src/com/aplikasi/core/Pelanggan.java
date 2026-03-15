package com.aplikasi.core;

public class Pelanggan {

    private String nama;       // private
    protected String alamat;   // protected
    String noHp;               // default

    public Pelanggan(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if(nama == null || nama.isEmpty()){
            System.out.println("Nama tidak boleh kosong");
            this.nama = "Unknown";
        }else{
            this.nama = nama;
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void tampilkan(){
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP  : " + noHp);
        System.out.println("------------------");
    }
}