package com.aplikasi.core;

public class LayananKantor extends Layanan {

    private int luas;

    public LayananKantor(String nama, int harga, int luas){
        super(nama, harga);
        this.luas = luas;
    }

    public void tampilkan(){
        super.tampilkan();
        System.out.println("Luas Kantor : " + luas);
        System.out.println("------------------");
    }
}