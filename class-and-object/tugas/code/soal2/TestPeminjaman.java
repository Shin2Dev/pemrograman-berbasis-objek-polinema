public class TestPeminjaman {
    public static void main(String[] args) {
        // Instansiasi objek peminjaman
        Peminjaman rent1 = new Peminjaman(1234, "Wahyu888", "Epep", 2.0, 10000.0);

        System.out.println("======================");
        System.out.println("DATA PEMINJAMAN");
        System.out.println("======================");

        // Menampilkan Data dan Harga Sewa
        rent1.tampilDataSewa();
        rent1.tampilHargaSewa();
        System.out.println("======================");
    }
}
