public class KoperasiDemo {
    public static void main(String[] args) {
        // Instansiasi objek anggota dengan konstruktor
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");

        // Menampilkan nama dan simpanan uang nya
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        // Deklarasi nilai data anggota
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");

        // Menyetor uang
        anggota1.setor(100000);

        // Menampilkan nama dan simpanan uang nya
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        // Meminjam / mengambil uang
        anggota1.pinjam(5000);

        // Menampilkan nama dan simpanan uang nya
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
