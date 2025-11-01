import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.rakUtama.lokasiBuku[0][0] = new Buku("Laskar Pelangi", "Andrea Hirata", "A1");
        perpustakaan.rakUtama.lokasiBuku[0][1] = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "A2");
        perpustakaan.rakUtama.lokasiBuku[0][2] = new Buku("Cantik Itu Luka", "Eka Kurniawan", "A3");
        perpustakaan.rakUtama.lokasiBuku[0][3] = new Buku("Yang Bertahan dan Binasa Perlahan", "Okky Madasari", "A4");
        perpustakaan.rakUtama.lokasiBuku[0][4] = new Buku("Merahnya Merah", "Iwan Simatupang", "A5");
        perpustakaan.rakUtama.lokasiBuku[1][0] = new Buku("Harry Potter and The Philosopher's Stone", "JK Rowling", "B1");
        perpustakaan.rakUtama.lokasiBuku[1][1] = new Buku("Negeri 5 Menara", "Ahmad Fuadi", "B2");
        perpustakaan.rakUtama.lokasiBuku[1][2] = new Buku("Moon atau Bulan", "Tere Liye", "B3");
        perpustakaan.rakUtama.lokasiBuku[1][3] = new Buku("Laut Bercerita", "Leila S.Chudori", "B4");
        perpustakaan.rakUtama.lokasiBuku[1][4] = new Buku("Perahu Kertas", "Dee Lestari", "B5");
        perpustakaan.rakUtama.lokasiBuku[2][0] = new Buku("Filosofi Teras", "Henry Manampiring", "C1");
        perpustakaan.rakUtama.lokasiBuku[2][1] = new Buku("Saman", "Ayu Utami", "C2");
        perpustakaan.rakUtama.lokasiBuku[2][2] = new Buku("Entrok", "Okky Madasari", "C3");
        perpustakaan.rakUtama.lokasiBuku[2][3] = new Buku("Sumur", "Eka Kurniawan", "C4");
        perpustakaan.rakUtama.lokasiBuku[2][4] = new Buku("The Diary of a Young Gir", "Anne Frank", "C5");
        perpustakaan.rakUtama.lokasiBuku[3][0] = new Buku("Dilan 1990", "Pidi Baiq", "D1");
        perpustakaan.rakUtama.lokasiBuku[3][1] = new Buku("Laut Bercerita", "Leila S. Chudori", "D2");
        perpustakaan.rakUtama.lokasiBuku[3][2] = new Buku("Hujan", "Tere Liye", "D3");
        perpustakaan.rakUtama.lokasiBuku[3][3] = new Buku("Ujung Tanduk", "Tere Liye", "D4");
        perpustakaan.rakUtama.lokasiBuku[3][4] = new Buku("00.00", "Ameylia Falensiak", "D5");
        perpustakaan.rakUtama.lokasiBuku[4][0] = new Buku("Gadis Minimarket", "Sayaka Murata", "E1");
        perpustakaan.rakUtama.lokasiBuku[4][1] = new Buku("YoungAdult: Ten Years Challenge", "Mutriani", "E2");
        perpustakaan.rakUtama.lokasiBuku[4][2] = new Buku("Puya ke Puya", "Faisal Oddang", "E3");
        perpustakaan.rakUtama.lokasiBuku[4][3] = new Buku("Wingit", "Sara Wijayanto", "E4");
        perpustakaan.rakUtama.lokasiBuku[4][4] = new Buku("Pintu Harmonika", "Clara Ng dan Icha Rahmanti", "E5");


        perpustakaan.menuUtama(); 
    } 
} 