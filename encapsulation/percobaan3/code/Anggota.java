public class Anggota {
    // Atribut anggota koperasi
    private String nama;
    private String alamat;
    private float simpanan;

    // Method Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    // Method menyetor uang
    public void setor(float uang) {
        simpanan += uang;
    }

    // Method meminjam uang
    public void pinjam(float uang) {
        simpanan -= uang;
    }
}