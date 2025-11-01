## Nama Anggota Kelompok 7:
1. Zahrah Nabilah (G1A025019)
2. Athiya Rahma Aulia (G1A025031)
3. Ariqah Naurah (G1A025039)
---
## Overview Sistem
Proyek ini merupakan simulasi sistem perpustakaan digital berbasis konsol menggunakan bahasa Java. Sistem ini mensimulasikan penataan buku dalam bentuk peta ruang (array 2D), di mana setiap buku memiliki posisi tertentu pada rak digital. 
Pengguna dapat:
* Melihat denah buku dalam rak (peta 2D),
* Mencari buku berdasarkan judul,
* Meminjam dan mengembalikan buku secara otomatis,
* Dan menghitung denda keterlambatan pengembalian buku.
---
### Struktur Program
1. Class Buku  
Mewakili entitas buku di perpustakaan.  

Atribut:  
* judul : String — nama buku
* penulis : String — nama penulis buku
* kodeRak : String — kode unik lokasi buku di rak
* tersedia : boolean — status ketersediaan buku

2. Class Rak  
Mewakili rak utama yang berisi kumpulan buku dalam bentuk array 2D (5x5).  

Atribut:  
* Buku[][] lokasiBuku — matriks buku berukuran 5 baris × 5 kolom  

Method utama:  
* tampilkanDenah() → Menampilkan posisi buku di rak (dengan looping 2D)
* cariBuku(String judul) → Mengembalikan koordinat (baris, kolom) jika buku ditemukan
* pinjamBuku(int baris, int kolom) → Mengubah status tersedia menjadi false jika buku dipinjam

3. Class Perpustakaan  
Sebagai pengelola utama interaksi antara pengguna dan rak buku.  

Atribut:  
* Rak rakUtama — objek utama penyimpan semua buku  

Method utama:  
* menuUtama() → Menampilkan menu pilihan untuk pengguna
* tampilkanPetaBuku() → Menampilkan denah lengkap rak buku
* cariBuku() → Fitur pencarian buku berdasarkan judul
* pinjamBuku() → Proses peminjaman dan pencatatan tanggal pinjam
* hitungDenda() → Menghitung denda jika buku dikembalikan terlambat

4. Class MainPerpus  
  Sebagai titik awal (entry point) program.  
  Menjalankan metode menuUtama() dari objek Perpustakaan dan menginisialisasi data awal (beberapa buku di posisi tertentu).   
