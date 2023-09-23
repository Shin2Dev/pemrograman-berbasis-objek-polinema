public class Barang {
    // Atribut barang
    public String namaBrg, jenisBrg;
    public int stok;

    // Method menampilkan data barang
    public void tampilBarang() {
        System.out.println("Nama Barang   : " + namaBrg);
        System.out.println("Jenis Barang  : " + jenisBrg);
        System.out.println("Stok          : " + stok);
    }

    // Method menambah stok barang
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
