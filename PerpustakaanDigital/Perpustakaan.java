import java.util.Scanner;

public class Perpustakaan {
    Rak rakUtama = new Rak();
    Scanner input = new Scanner(System.in);

    public void menuUtama() {
        int pilih;
        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tampilkan Peta Buku");
            System.out.println("2. Cari Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1 -> tampilkanPetaBuku();
                case 2 -> cariBuku();
                case 3 -> pinjamBuku();
                case 4 -> kembalikanBuku();
                case 0 -> System.out.println("Keluar dari sistem...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }

    
    public void tampilkanPetaBuku() {
        rakUtama.tampilkanDenah();
    }

   
    public void cariBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        int[] posisi = rakUtama.cariBuku(judul);

        if (posisi != null) {
            System.out.println("Buku ditemukan di posisi: Baris " + posisi[0] + ", Kolom " + posisi[1]);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

   
    public void pinjamBuku() {
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judul = input.nextLine();

        int[] posisi = rakUtama.cariBuku(judul); 
        if (posisi != null) {
            int baris = posisi[0];
            int kolom = posisi[1];
            Buku buku = rakUtama.lokasiBuku[baris][kolom];

            if (buku.isTersedia()) {
                buku.setTersedia(false);
                System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam!");
            } else {
                System.out.println("Maaf, buku \"" + buku.getJudul() + "\" sedang dipinjam oleh orang lain.");
            }
        } else {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan di rak.");
        }
    }

    
    public void kembalikanBuku() {
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String judul = input.nextLine();

        int[] posisi = rakUtama.cariBuku(judul);
        if (posisi != null) {
            int baris = posisi[0];
            int kolom = posisi[1];
            Buku buku = rakUtama.lokasiBuku[baris][kolom];

            if (!buku.isTersedia()) {
                System.out.print("Apakah telat mengembalikan? (y/t): ");
                String telat = input.nextLine();

                double totalDenda = 0;
                double dendaPerHari = 5000;

                if (telat.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan jumlah hari keterlambatan: ");
                    int hari = input.nextInt();
                    input.nextLine(); 

                    totalDenda = hari * dendaPerHari;
                    System.out.println("Denda keterlambatan: Rp " + totalDenda);
                } else {
                    System.out.println("Tidak ada denda, buku dikembalikan tepat waktu.");
                }

                buku.setTersedia(true);
                System.out.println("Buku \"" + buku.getJudul() + "\" telah dikembalikan.");
            } else {
                System.out.println("Buku \"" + buku.getJudul() + "\" belum pernah dipinjam!");
            }
        } else {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan di rak.");
        }
    }
}