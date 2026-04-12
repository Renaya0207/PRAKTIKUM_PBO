# Sistem Pemesanan Jasa Cleaning Service 🧹 
Program ini adalah aplikasi sederhana berbasis Java untuk mengelola jasa cleaning service. Di dalam program ini, pengguna bisa menambahkan data pelanggan dan berbagai jenis layanan seperti cleaning rumah, kantor, dan karpet dengan penambahan konsep **Polymorphism** selain **Inheritance**.

## Konsep yang Digunakan
### Inheritance (Pewarisan)

Program ini memiliki 1 class utama:

* `Layanan` (parent class)

Kemudian diturunkan menjadi:

* `LayananRumah`
* `LayananKantor`
* `LayananKarpet`

Artinya semua jenis layanan tersebut masih termasuk dalam satu kategori yaitu **Layanan**.

### Polymorphism

#### Overriding

```java
hitungTotal()
```

dioverride di setiap subclass.

Tujuannya supaya:

* Layanan rumah menghitung total berdasarkan jumlah kamar
* Layanan kantor berdasarkan luas
* Layanan karpet berdasarkan jumlah karpet
  
Jadi meskipun method-nya sama, hasilnya bisa berbeda.

#### Overloading

```java
hitungTotal(int tambahan)
```

Digunakan untuk menambahkan biaya tambahan (misalnya biaya ekstra).

## Fitur Program

### Pelanggan
* Tambah pelanggan
* Lihat pelanggan

### Layanan
* Tambah layanan:
- Rumah
- Kantor
- Karpet
- Lihat layanan
- Hitung total biaya otomatis

## Contoh Menu

```
=== SISTEM PEMESANAN JASA CLEANING ===
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Tambah Layanan
4. Lihat Layanan
5. Keluar
```

---

## Contoh Perhitungan
Misalnya:
* Harga per kamar = 50.000
* Jumlah kamar = 3
Maka:
Total = 50.000 x 3 = 150.000
Jika ada tambahan:
Total + tambahan = 160.000

---

## Kesimpulan

Program ini menunjukkan bahwa penggunaan inheritance membuat struktur kode jadi lebih rapi karena satu class bisa digunakan kembali oleh beberapa turunan. Selain itu, polymorphism membuat setiap layanan bisa memiliki cara perhitungan biaya yang berbeda walaupun menggunakan method yang sama. Dengan begitu, program jadi lebih fleksibel, mudah dikembangkan, dan tidak perlu menulis ulang kode yang sama.
