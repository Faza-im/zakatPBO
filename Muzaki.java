package zakatPBO;

public class Muzaki {
    private String nama;
    private double harta;

    // Constructor dengan parameter
    public Muzaki(String nama, double harta) {
        this.nama = nama;
        this.harta = harta;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk harta
    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
    }

    // Menghitung zakat maal (2.5% dari harta)
    public double hitungZakat() {
        return harta * 0.025;
    }

    // Mengecek apakah muzaki wajib zakat
    public boolean isWajibZakat(double nisab) {
        return harta >= nisab;
    }
}
