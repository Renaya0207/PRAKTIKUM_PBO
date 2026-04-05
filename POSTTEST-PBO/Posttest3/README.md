🧹 CleanG0 - Sistem Pemesanan Jasa Cleaning 🧹

Program ini adalah aplikasi sederhana yang dibuat pakai Java untuk mengelola jasa cleaning service.
Di program ini kita bisa:
- Menambahkan data pelanggan
- Melihat, update, hapus, dan cari pelanggan
- Menambahkan berbagai jenis layanan cleaning

# Konsep yang Dipakai :

1. Inheritance
di program ini ada 1 class utama yaitu;
`Layanan` (parent)
Lalu diturunkan menjadi:
`LayananRumah`
`LayananKantor`
`LayananKarpet`
Artinya:
LayananRumah itu adalah Layanan
LayananKantor itu adalah Layanan
LayananKarpet itu adalah Layanan

2. Encapsulation
Data disimpan dengan aman menggunakan:
`private`
`protected`
getter & setter

3. Method Override
Setiap layanan punya tampilan sendiri dengan method:

```java
tampilkan()
```


# Fitur Program

- Pelanggan
   
Tambah pelanggan
Lihat pelanggan
Update pelanggan
Hapus pelanggan
Cari pelanggan

- Layanan

Tambah layanan:

  Rumah
  Kantor
  Karpet
  Lihat layanan

- Cara Menjalankan
1. Buka project di VS Code / IntelliJ
2. Jalankan file `Main.java`
3. Ikuti menu yang muncul di terminal

- Contoh Menu
```
=== SISTEM PEMESANAN JASA CLEANING ===
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Update Pelanggan
4. Hapus Pelanggan
5. Cari Pelanggan
6. Tambah Layanan
7. Lihat Layanan
8. Keluar
```

# Kesimpulan
Program ini menunjukkan bahwa konsep inheritance bisa digunakan untuk membuat kode jadi lebih rapi dan tidak berulang-ulang. 
Dengan adanya class Layanan sebagai induk, kita bisa membuat beberapa jenis layanan seperti layanan rumah, kantor, dan karpet tanpa harus menulis ulang atribut dan method yang sama. 
Setiap jenis layanan tetap punya ciri khas masing-masing, tapi masih berada dalam satu konsep yang sama.
Selain itu, program ini juga sudah bisa melakukan pengelolaan data pelanggan dengan cukup lengkap, seperti menambah, melihat, mengubah, menghapus, dan mencari data. 
Hal ini membuat program tidak hanya sekadar contoh konsep, tetapi juga sudah bisa digunakan sebagai simulasi sistem sederhana. 
Secara keseluruhan, penggunaan inheritance membuat program lebih terstruktur, mudah dipahami, dan lebih mudah dikembangkan ke depannya.


Nama   : Renaya Putri Alika
NIM    : 2409106002
Kelas  : A1'24
