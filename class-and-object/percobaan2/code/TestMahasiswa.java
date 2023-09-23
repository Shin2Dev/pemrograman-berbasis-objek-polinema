public class TestMahasiswa {
    public static void main(String[] args) {
        // Instansiasi objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        // Menambahkan nilai data dari 3 objek mahasiswa
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";

        mhs2.nim = 102;
        mhs2.nama = "Lesti";
        mhs2.alamat = "Jl. Vinolia No 1B";
        mhs2.kelas = "1B";

        mhs3.nim = 103;
        mhs3.nama = "Esti";
        mhs3.alamat = "Jl. Vinolia No 1C";
        mhs3.kelas = "1C";

        // Menampilkan biodata
        System.out.println("==========================");
        mhs1.tampilBiodata();
        System.out.println("==========================");
        mhs2.tampilBiodata();
        System.out.println("==========================");
        mhs3.tampilBiodata();
        System.out.println("==========================");
    }
}
