public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // Constructor
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        // Buat objek mahasiswa lewat constructor
        Mahasiswa imam = new Mahasiswa(
                "2241720151",
                "Mochamad Imam Hanafi",
                "Kandangan",
                'L');

        System.out.println(
                "Nim : " + imam.nim + "\n" +
                        "Nama : " + imam.nama + "\n" +
                        "Alamat : " + imam.alamat + "\n" +
                        "Jenis Kelamin: " + imam.jenisKelamin);
    }
}