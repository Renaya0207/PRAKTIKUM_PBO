CleanGO - Sistem Pemesanan Jasa Cleaning

Program ini merupakan pengembangan dari Posttest 1 dengan menambahkan konsep Encapsulation yang sesuai pada modul. 
Program ini dibuat untuk mengelola data pada sistem pemesanan jasa cleaning, yang terdiri dari beberapa data utama yaitu:
1. Pelanggan
2. Layanan
3. Pemesanan

Program juga menyediakan menu interaktif di terminal untuk melakukan operasi CRUD (Create, Read, Update, Delete) menggunakan ArrayList.

Dalam program ini, atribut pada setiap class dibuat menggunakan access modifier private sehingga tidak dapat diakses langsung dari luar class. 
Kemudian akses terhadap atribut dilakukan melalui method getter dan setter.

Contoh penerapan encapsulation pada program saya:

private String nama;

public String getNama(){
    return nama;
}

public void setNama(String nama){
    this.nama = nama;
}


Dengan cara ini, nilai atribut hanya dapat diubah melalui method yang telah disediakan sehingga data lebih aman dan terkontrol.

- Access Modifier yang Digunakan
Program ini menerapkan seluruh jenis Access Modifier yang ada pada Java.

| Access Modifier |                       Fungsi                       |
| --------------- | -------------------------------------------------- |
| public          | Dapat diakses dari mana saja                       |
| protected       | Dapat diakses dalam package yang sama dan subclass |
| default         | Hanya dapat diakses dalam package yang sama        |
| private         | Hanya dapat diakses di dalam class itu sendiri     |

Penggunaan access modifier ini bertujuan untuk mengatur tingkat akses terhadap atribut, method, dan class dalam program.

- Struktur Package
Struktur package dalam program mengikuti contoh pada modul, yaitu memisahkan class berdasarkan fungsi.

src
 └── com
      └── aplikasi
           ├── core
           │     ├── Pelanggan.java
           │     ├── Layanan.java
           │     └── Pemesanan.java
           │
           └── main
                 └── Main.java

Penjelasan:
core --> berisi class utama yang menyimpan data
main --> berisi class utama yang menjalankan program

Penggunaan package bertujuan untuk mengorganisasi class dalam project dan menghindari konflik nama class.

- Fitur Program
Program memiliki beberapa fitur utama yaitu:

1. Pengelolaan Data Pelanggan, isinya ;
Tambah pelanggan
Lihat pelanggan
Update pelanggan
Hapus pelanggan

2. Pengelolaan Data Layanan, isinya ;
Tambah layanan
Lihat layanan
Update layanan
Hapus layanan

3. Pengelolaan Data Pemesanan, isinya ;
Tambah pemesanan
Lihat pemesanan
Update pemesanan
Hapus pemesanan


Program Sistem Pemesanan Jasa Cleaning yang saya rancang sudah menerapkan konsep Encapsulation, dengan cara:
- Menggunakan access modifier private pada atribut
- Mengakses atribut menggunakan getter dan setter
- Menerapkan beberapa jenis access modifier
- Menggunakan package untuk mengorganisasi class

Harapannya, dengan penerapan konsep ini, program menjadi lebih terstruktur, aman, dan mudah dikembangkan.
