package zakatPBO;

public class Penerima {
    private String nama;
    private String alamat;

    // Constructor dengan parameter
    public Penerima(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
