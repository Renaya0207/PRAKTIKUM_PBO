Sistem Pemesanan Jasa Cleaning

Program ini merupakan aplikasi sederhana berbasis Java untuk mengelola sistem pemesanan jasa cleaning, menggunakan konsep dasar Pemrograman Berorientasi Objek (OOP) dan menggunakan ArrayList untuk menyimpan data secara dinamis.

Program ini menyediakan menu interaktif yang memungkinkan pengguna untuk mengelola data Pelanggan, Layanan, dan Pemesanan dengan operasi CRUD (Create, Read, Update, Delete).

Fitur Program
Program memiliki beberapa fitur utama, yaitu:
1. Kelola Data Pelanggan
- Tambah pelanggan
- Lihat daftar pelanggan
- Update data pelanggan
- Hapus pelanggan

2. Kelola Data Layanan
- Tambah layanan
- Lihat daftar layanan
- Update layanan
- Hapus layanan

3. Kelola Data Pemesanan
- Tambah pemesanan
- Lihat daftar pemesanan
- Update pemesanan
- Hapus pemesanan

Konsep yang Digunakan program ini yaitu;

1. Class
Class digunakan sebagai blueprint untuk membuat objek.
Class yang digunakan:
`Pelanggan`
`Layanan`
`Pemesanan`
`Main`

2. Object
Object merupakan hasil instansiasi dari sebuah class.
Contoh:
Pelanggan p = new Pelanggan("Intan", "Jakarta", "08123456789");

3. Constructor
Constructor digunakan untuk memberikan nilai awal pada objek ketika objek dibuat.
Contoh:
Pelanggan(String nama, String alamat, String noHp)

4. ArrayList
ArrayList digunakan untuk menyimpan kumpulan data secara dinamis.
Contoh:
ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();

5. Scanner
Scanner digunakan untuk menerima input dari pengguna melalui keyboard.

Struktur Program
1. Class Pelanggan
Menyimpan data pelanggan.
- Atribut:
nama
alamat
noHp
- Method: tampilkan()

2. Class Layanan
Menyimpan data layanan cleaning.
- Atribut:
nama
harga
- Method: tampilkan()

3. Class Pemesanan
Menyimpan data pemesanan jasa cleaning.
- Atribut:
pelanggan
layanan
tanggal
- Method: tampilkan()

4. Class Main
Class utama yang menjalankan program dan berisi:
- Menu program
- Proses CRUD
- Pengolahan data ArrayList

Menu Program
Saat program dijalankan, akan muncul menu seperti berikut:

=== SISTEM PEMESANAN JASA CLEANING ===

1. Tambah Pelanggan
2. Lihat Pelanggan
3. Update Pelanggan
4. Hapus Pelanggan
5. Tambah Layanan
6. Lihat Layanan
7. Update Layanan
8. Hapus Layanan
9. Tambah Pemesanan
10. Lihat Pemesanan
11. Update Pemesanan
12. Hapus Pemesanan
13. Keluar

Pengguna dapat memilih menu sesuai kebutuhan untuk mengelola data.

Cara Menjalankan Program

1. Pastikan Java Development Kit (JDK) sudah terinstall.
2. Simpan file program dengan nama: Main.java
3. Compile program menggunakan terminal atau tekan Shift + F10
4. Jalankan program: java Main

Contoh Output Program
Contoh tampilan data pelanggan:

Nama   : Pays
Alamat : Jl. Perjuangan
No HP  : 082154320422
