public class Peminjaman {
    // Atribut Peminjaman
    int id;
    String namaMember, namaGame;
    Double lamaSewa, harga;

    // Konstruktor Peminjaman
    Peminjaman(int id, String namaMember, String namaGame, Double lamaSewa, Double harga) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaSewa = lamaSewa;
        this.harga = harga;
    }

    // Method Menampilkan Data Sewa
    public void tampilDataSewa() {
        System.out.println("Id Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Lama Sewa   : " + lamaSewa);
    }

    // Method Menampilkan Harga Sewa
    public void tampilHargaSewa() {
        System.out.println("Harga Sewa  : " + (harga * lamaSewa));
    }
}