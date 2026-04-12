package com.aplikasi.core;

public class LayananKantor extends Layanan {

    private int luas;

    public LayananKantor(String nama, int harga, int luas){
        super(nama, harga);
        this.luas = luas;
    }

    @Override
    public int hitungTotal(){
        return getHarga() * luas;
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Luas Kantor : " + luas);
        System.out.println("Total       : " + hitungTotal());
        System.out.println("------------------");
    }
}