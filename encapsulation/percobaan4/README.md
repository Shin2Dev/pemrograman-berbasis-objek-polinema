# Percobaan 4 - Konstruktor

1. Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut

   ```java
   package koperasigettersetter;

   public class KoperasiDemo {
       public static void main(String[] args) {
           Anggota anggota1 = new Anggota();
           System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

           anggota1.setNama("Iwan Setiawan");
           anggota1.setAlamat("Jalan Sukarno Hatta no 10");
           anggota1.setor(100000);
           System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

           anggota1.pinjam(5000);
           System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
       }
   }
   ```

2. Hasil dari program tersebut adalah sebagai berikut

   ![Output Class Koperasi Demo 2](/encapsulation/percobaan4/img/output4.png)

   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama() hasilnya hal ini terjadi karena atribut nama belum diset nilai defaultnya. Hal ini dapat ditangani dengan membuat kontruktors

3. Ubah class Anggota menjadi seperti berikut

   ```java
   package koperasigettersetter;

   public class Anggota {
       private String nama;
       private String alamat;
       private float simpanan;

       // Konstruktor Class Anggota
       Anggota(String nama, String alamat) {
           this.nama = nama;
           this.alamat = alamat;
           this.simpanan = 0;
       }

       public void setNama(String nama) {
           this.nama = nama;
       }

       public void setAlamat(String alamat) {
           this.alamat = alamat;
       }

       public String getNama() {
           return nama;
       }

       public String getAlamat() {
           return alamat;
       }

       public float getSimpanan() {
           return simpanan;
       }

       public void setor(float uang) {
           simpanan += uang;
       }

       public void pinjam(float uang) {
           simpanan -= uang;
       }
   }
   ```

   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pada class Anggota dibuat kontruktor dengan access modifier default yang memiliki 2 parameter nama dan alamat. Dan didalam konstruktor tersebut dipastikan nilai simpanan untuk pertama kali adalah Rp. 0

4. Selanjutnya ubah class KoperasiDemo sebagai berikut

   ```java
   package koperasigettersetter;

   public class KoperasiDemo {
      public static void main(String[] args) {
         Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
         System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

         anggota1.setNama("Iwan Setiawan");
         anggota1.setAlamat("Jalan Sukarno Hatta no 10");
         anggota1.setor(100000);
         System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

         anggota1.pinjam(5000);
         System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
      }
   }
   ```

5. Hasil dari program tersebut adalah sebagai berikut

   ![Output Konstruktor Class KoperasiDemo](/encapsulation/percobaan4/img/output5.png)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Setelah menambah konstruktor pada class Anggoata maka atribut nama dan alamat secara otomatis harus diset terlebih dahulu dengan melakukan passing parameter jika melakukan instansiasi class Anggota. Hal ini biasa dilakukan untuk atribut yang membutuhkan nilai yang spesifik.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jika tidak membutuhkan nilai spesifik dalam konstruktor tidak perlu parameter. Contohnya simpanan untuk anggota baru diset 0, maka simpanan tidak perlu untuk dijadikan parameter pada konstruktor.

### Pertanyaan Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?
   - Getter: Metode dalam sebuah kelas yang digunakan untuk mendapatkan (membaca) nilai dari suatu atribut pribadi Getter biasanya memiliki nama seperti getNamaAtribut() dan mengembalikan nilai atribut tersebut.
   - Metode dalam sebuah kelas yang digunakan untuk mengatur (menulis) nilai suatu atribut pribadi. Setter biasanya memiliki nama seperti setNamaAtribut(nilai) dan mengubah nilai atribut tersebut.
2. Apa kegunaan dari method getSimpanan()?
   - Method getSimpanan() adalah contoh dari metode getter. Metode ini digunakan untuk mendapatkan nilai dari atribut pribadi "simpanan" dalam class Anggota.
3. Method apa yang digunakan untk menambah saldo?
   - Method yang digunakan untuk menambah saldo adalah method setor(), karena method tersebut akan menambah saldo jika pengguna memasukkan / menyetorkan uang.
4. Apa yand dimaksud konstruktor?
   - Konstruktor adalah metode khusus dalam suatu kelas yang digunakan untuk menginisialisasi objek yang dibuat dari kelas tersebut. Konstruktor biasanya dipanggil saat objek pertama kali dibuat.
5. Sebutkan aturan dalam membuat konstruktor?
   - Nama konstruktor harus sama dengan nama kelas.
   - Konstruktor tidak memiliki tipe pengembalian (void atau lainnya).
   - Konstruktor dapat memiliki parameter atau tidak memiliki parameter (konstruktor default).
6. Apakah boleh konstruktor bertipe private?
   - Ya, konstruktor dapat memiliki akses privat (private constructor). Ini sering digunakan dalam desain Singleton, di mana hanya satu instansi dari kelas yang diizinkan. Dengan membuat konstruktor privat, Anda mencegah pembuatan objek tambahan di luar kelas.
7. Kapan menggunakan parameter dengan passing parameter?
   - Anda menggunakan parameter saat Anda ingin mengirim data atau informasi ke dalam metode atau konstruktor. Ini berguna ketika Anda perlu mengoperasikan metode atau inisialisasi objek dengan nilai-nilai tertentu yang diberikan dari luar.
8. Apa perbedaan atribut class dan instansiasi atribut?
   - Atribut kelas (static attributes) adalah atribut yang terkait dengan kelas itu sendiri, bukan dengan objek yang dibuat dari kelas tersebut.
   - Atribut instansiasi (instance attributes) adalah atribut yang terkait dengan objek individu yang dibuat dari kelas.
   - Atribut kelas bersifat bersamaan untuk semua objek yang dibuat dari kelas tersebut, sementara atribut instansiasi memiliki nilainya sendiri untuk setiap objek.
9. Apa perbedaan class method dan instansiasi method?
   - **Class Method**: Class method adalah metode yang terkait dengan kelas dan bukan dengan objek individu. Mereka dapat diakses tanpa harus menciptakan objek dari kelas.
   - **Instansiasi Method**: Instansiasi method adalah metode yang terkait dengan objek individu yang telah dibuat dari kelas. Mereka digunakan untuk melakukan operasi pada objek tersebut.

### Kesimpulan

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dari percobaan diatas, telah dipelajari konsep dari enkapsulasi, kontruktor, access modifier yang terdiri dari 4 jenis yaitu public, protected, default dan private. Konsep atribut atau method class yang ada di dalam blok code class dan konsep instansiasi atribut atau method. Cara penggunaan getter dan setter beserta fungsi dari getter dan setter. Dan juga telah dipelajari atau memahami notasi UML

### Source Code

- [Anggota.java](/encapsulation/percobaan4/code/Anggota.java)
- [KoperasiDemo.java](/encapsulation/percobaan4/code/KoperasiDemo.java)
