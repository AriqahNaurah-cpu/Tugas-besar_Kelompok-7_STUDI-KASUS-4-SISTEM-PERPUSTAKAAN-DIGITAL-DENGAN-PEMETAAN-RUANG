public class Rak {
    public Buku[][] lokasiBuku = new Buku[5][5];

    public void tampilkanDenah() {
        System.out.println("\n=== DENAH RAK BUKU ===");
        for (int i = 0; i < lokasiBuku.length; i++) {
            for (int j = 0; j < lokasiBuku[i].length; j++) {
                if (lokasiBuku[i][j] != null) {
                    if (lokasiBuku[i][j].isTersedia()) {
                        System.out.print("[T] "); 
                    } else {
                        System.out.print("[X] "); 
                    }
                } else {
                    System.out.print("[ ] "); 
                }
            }
            System.out.println();
        }
        System.out.println("[T] = Tersedia, [X] = Dipinjam");
    }

    public int[] cariBuku(String judul) {
        for (int i = 0; i < lokasiBuku.length; i++) {
            for (int j = 0; j < lokasiBuku[i].length; j++) {
                if (lokasiBuku[i][j] != null && lokasiBuku[i][j].getJudul().equalsIgnoreCase(judul)) {
                    return new int[]{i, j}; 
                }
            }
        }
        return null;
    }

    public void pinjamBuku(int baris, int kolom) {
        if (lokasiBuku[baris][kolom] != null && lokasiBuku[baris][kolom].isTersedia()) {
            lokasiBuku[baris][kolom].setTersedia(false);
            System.out.println("Buku \"" + lokasiBuku[baris][kolom].getJudul() + "\" berhasil dipinjam!");
        } else {
            System.out.println("Buku tidak tersedia atau posisi kosong!");
        }
    }
}