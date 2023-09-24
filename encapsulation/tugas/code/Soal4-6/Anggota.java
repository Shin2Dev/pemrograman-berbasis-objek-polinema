public class Anggota {
    // Atribut anggota dan pinjaman
    private String noKtp, nama;
    private int limitPinjaman, jumlahPinjaman;

    // Konstruktor anggota
    Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Method getter
    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method meminjam uang
    public void pinjam(int pinjaman) {
        jumlahPinjaman += pinjaman;
        limitPinjaman -= pinjaman;
    }

    // Method mengangsur pinjaman
    public void angsur(int bayarPinjam) {
        // Minimal bayar angsuran 10%
        int minimalBayar = jumlahPinjaman * 10 / 100;

        // Jika bayarnya tidak melebihi minimal
        if (bayarPinjam < minimalBayar) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {

            // Jika bayarnya melebihi jumlah pinjaman
            if (bayarPinjam > jumlahPinjaman) {
                jumlahPinjaman = 0;
            } else {
                jumlahPinjaman -= bayarPinjam;
            }
        }

        // limit bertambah jika sudah membayar angsuran
        limitPinjaman += bayarPinjam;
    }
}
