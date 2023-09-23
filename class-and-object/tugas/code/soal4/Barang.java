public class Barang {
    // Atribut Barang
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    // Method Menampilkan Data
    void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon     : " + diskon);
    }

    // Method Menghitung Harga Jual dengan Diskon
    void hitungHargaJual() {
        int hargaJual = hargaDasar - (hargaDasar * (int) diskon / 100);
        System.out.println("Harga Jual : " + hargaJual);
    }
}