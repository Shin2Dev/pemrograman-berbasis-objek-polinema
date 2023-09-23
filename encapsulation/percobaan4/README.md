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

### Pertanyaan Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?
   - a
2. Apa kegunaan dari method getSimpanan()?
   - a
3. Method apa yang digunakan untk menambah saldo?
   - a
4. Apa yand dimaksud konstruktor?
   - a
5. Sebutkan aturan dalam membuat konstruktor?
   - a
6. Apakah boleh konstruktor bertipe private?
   - a
7. Kapan menggunakan parameter dengan passsing parameter?
   - a
8. Apa perbedaan atribut class dan instansiasi atribut?
   - a
9. Apa perbedaan class method dan instansiasi method?
   - a

### Source Code

- a
- a
