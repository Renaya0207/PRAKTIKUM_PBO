# CleanGO - Sistem Pemesanan Jasa Cleaning 
Program ini adalah aplikasi sederhana berbasis Java untuk mengelola jasa cleaning service. Pengguna dapat menambahkan data pelanggan serta berbagai jenis layanan seperti cleaning rumah, kantor, dan karpet.
Program ini ada pengembangan dengan penambahan konsep Abstract Class dan Interface, selain Inheritance dan Polymorphism.

## Konsep yang Digunakan

### Inheritance
Program memiliki class utama yaitu `Layanan` sebagai parent class. 
Class ini kemudian diturunkan menjadi:
* `LayananRumah`
* `LayananKantor`
* `LayananKarpet`
Semua class turunan tersebut masih termasuk dalam satu kategori layanan.

### Abstract Class
Class `Layanan` diubah menjadi abstract class, sehingga tidak dapat dibuat objek secara langsung dan hanya dapat digunakan melalui subclass.
Di dalamnya terdapat abstract method:

```java
hitungTotal()
```

### Polymorphism

#### Overriding
Method `hitungTotal()` dioverride di setiap subclass, sehingga setiap jenis layanan memiliki cara perhitungan total biaya yang berbeda.

#### Overloading
Method:

```java
hitungTotal(int tambahan)
```
digunakan untuk menambahkan biaya tambahan pada total yang sudah dihitung.

### Interface
Program menggunakan interface `Diskon` yang memiliki dua method:
* `hitungDiskon(int total)`
* `infoDiskon()`
Setiap class layanan mengimplementasikan interface ini sehingga memiliki perhitungan diskon masing-masing.

## Fitur Program

### Pelanggan
* Tambah pelanggan
* Lihat pelanggan

### Layanan
* Tambah layanan (rumah, kantor, karpet)
* Lihat layanan
* Perhitungan total biaya otomatis
* Perhitungan diskon sesuai jenis layanan

## Contoh Output Program

### Menu Utama

```
=== SISTEM PEMESANAN JASA CLEANING ===
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Tambah Layanan
4. Lihat Layanan
5. Keluar
Pilih menu:
```

### Tambah Pelanggan

```
Pilih menu: 1
Nama: Andi
Alamat: Samarinda
No HP: 08123456789
```

### Tambah Layanan Rumah

```
Pilih menu: 3
1. Layanan Rumah
2. Layanan Kantor
3. Layanan Karpet
Pilih jenis: 1

Nama Layanan: Cleaning Rumah
Harga: 50000
Jumlah kamar: 3
```

### Tambah Layanan Kantor

```
Pilih menu: 3
1. Layanan Rumah
2. Layanan Kantor
3. Layanan Karpet
Pilih jenis: 2

Nama Layanan: Cleaning Kantor
Harga: 70000
Luas kantor: 2
```

### Tambah Layanan Karpet

```
Pilih menu: 3
1. Layanan Rumah
2. Layanan Kantor
3. Layanan Karpet
Pilih jenis: 3

Nama Layanan: Cuci Karpet
Harga: 30000
Jumlah karpet: 4
```

### Lihat Layanan

```
Pilih menu: 4

Layanan : Cleaning Rumah
Harga   : 50000
Jumlah Kamar : 3
Total        : 150000
Setelah Diskon: 140000
------------------

Layanan : Cleaning Kantor
Harga   : 70000
Luas Kantor : 2
Total       : 140000
Setelah Diskon: 120000
------------------

Layanan : Cuci Karpet
Harga   : 30000
Jumlah Karpet : 4
Total         : 120000
Setelah Diskon: 115000
------------------
```

---

## Kesimpulan
Program ini menunjukkan bahwa inheritance membantu menyusun kode agar lebih terstruktur dengan memanfaatkan satu class utama untuk beberapa turunan. Penggunaan abstract class membuat aturan umum dapat ditentukan tanpa harus langsung digunakan sebagai objek. Polymorphism memungkinkan setiap layanan memiliki cara perhitungan yang berbeda meskipun menggunakan method yang sama, sementara interface memastikan setiap layanan memiliki fitur tambahan berupa perhitungan diskon. Kombinasi konsep ini membuat program lebih fleksibel dan mudah dikembangkan.

