# Percobaan 3 - Getter dan Setter

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Misalkan di sebuah sistem informasi koperasi, terdapat class Anggota. Anggota memiliki atribut nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam. Semua atribut pada anggota tidak boleh diubah sembarangan, melainkan hanya dapat diubah melalui method setter, getter, setor dan tarik. Khusus untuk atribut simpanan tidak terdapat setter karena simpanan akan bertambah ketika melakukan transaksi setor dan akan berkurang ketika melakukan peminjaman/tarik.

1. Berikut ini UML class buatlah class Mahasiswa pada program:
2. Sama dengan [percobaan 1](/encapsulation/percobaan1/) untuk membuat project baru

   - Buka IDE, buat folder KoperasiGetterSetter
   - Buat class Anggota di dalam folder KoperasiGetterSetter
   - Ketikkan kode class Anggota dibawah ini.

     ```java
     package koperasigettersetter;

     public class Anggota {
         private String nama;
         private String alamat;
         private float simpanan;

         // Setter
         public void setNama(String nama) {
             this.nama = nama;
         }

         public void setAlamat(String alamat) {
             this.alamat = alamat;
         }
         //

         // Getter
         public String getNama() {
             return nama;
         }

         public String getAlamat() {
             return alamat;
         }

         public float getSimpanan() {
             return simpanan;
         }
         //

         public void setor(float uang) {
             simpanan += uang;
         }

         public void pinjam(float uang) {
             simpanan -= uang;
         }
     }
     ```

     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jika diperhatikan pada class Anggota, atribut nama dan alamat memiliki masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().

3. Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota.

   ```java
   package koperasigettersetter;

   public class KoperasiDemo {
       public static void main(String[] args) {
           Anggota anggota1 = new Anggota();
           anggota1.setNama("Iwan Setiawan");
           anggota1.setAlamat("Jalan Sukarno Hatta no 10");
           anggota1.setor(100000);
           System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

           anggota1.pinjam(5000);
           System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
       }
   }
   ```

4. Hasil dari main method pada langkah ketiga adalah

   ![Output Class KoperasiDemo 1](/encapsulation/percobaan3/img/output3.png)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam(). Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan melalui getSimpanan().

### Source Code

- [Anggota.java](/encapsulation/percobaan3/code/Anggota.java)
- [KoperasiDemo.java](/encapsulation/percobaan3/code/KoperasiDemo.class)
