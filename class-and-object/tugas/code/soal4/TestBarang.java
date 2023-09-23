public class TestBarang {
    public static void main(String[] args) {
        // Instansiasi objek barang
        Barang benda = new Barang();

        // Deklarasi nilai data barang
        benda.kode = "MITO22";
        benda.namaBarang = "Oven Mito";
        benda.hargaDasar = 100000;
        benda.diskon = 20;

        System.out.println("======================");

        // Menampilkan data
        benda.tampilData();

        // Menghitung dan menampilkan harga jual
        benda.hitungHargaJual();
        System.out.println("======================");
    }
}
