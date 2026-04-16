package com.aplikasi.core;

public class LayananKantor extends Layanan implements Diskon {

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
    public int hitungDiskon(int total){
        return total - 20000;
    }

    @Override
    public void infoDiskon(){
        System.out.println("Diskon layanan kantor: 20000");
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        int total = hitungTotal();
        System.out.println("Luas Kantor : " + luas);
        System.out.println("Total       : " + total);
        System.out.println("Setelah Diskon: " + hitungDiskon(total));
        System.out.println("------------------");
    }
}