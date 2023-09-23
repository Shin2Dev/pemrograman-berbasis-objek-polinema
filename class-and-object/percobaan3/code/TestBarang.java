public class TestBarang {
    public static void main(String[] args) {
        // Instansiasi Objek Barang
        Barang brg1 = new Barang();

        // Menambahkan nilai data barang
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;

        // Menampilkan data barang
        brg1.tampilBarang();

        // Menambah stok barang
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
