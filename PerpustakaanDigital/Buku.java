public class Buku {
    private String judul;
    private String penulis;
    private String kodeRak;
    private boolean tersedia;

    public Buku(String judul, String penulis, String kodeRak) {
        this.judul = judul;
        this.penulis = penulis;
        this.kodeRak = kodeRak;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKodeRak() {
        return kodeRak;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
