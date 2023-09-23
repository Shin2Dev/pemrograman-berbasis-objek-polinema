# Percobaan 3: Menulis method yang memiliki argument / parameter dan memiliki return

Langkah kerja:

1. Bukalah text editor atau IDE
2. Ketikkan kode program berikut ini:

   ```java
   public class Barang {
       public String namaBrg;
       public String jenisBrg;
       public int stok;

       public void tampilBarang(){
           System.out.println("Nama Barang   : " + namaBrg);
           System.out.println("Jenis Barang  : " + jenisBrg);
           System.out.println("Stok          : " + stok);
       }

       public int tambahStok(int brgMasuk){
           int stokBaru = brgMasuk + stok;
           return stokBaru;
       }
   }
   ```

3. Simpan dengan nama file Barang.java
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggota-anggota dari class Barang dengan membuka file baru kemudian ketikkan kode program berikut:

   ```java
   public class TestBarang {
       public static void main(String[] args) {
           Barang brg1 = new Barang();
           brg1.namaBrg = "Pensil";
           brg1.jenisBrg = "ATK";
           brg1.stok = 10;
           brg1.tampilBarang();
           System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
       }
   }
   ```

5. Simpan dengan nama file TestBarang.java
6. Jalankan program tersebut! <br>

   ![Output Program Barang Java](/class-and-object/percobaan3/img/output.png)

7. Apakah fungsi argumen dalam suatu method?

   - Fungsi argument pada suatu method adalah untuk menerima nilai dan tipe data dari pendeklarasian method di main / sebagai syarat untuk menjalankan method tersebut

8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!

   - Return dalam method digunakan untuk mengembalikan nilai yang sudah dieksekusi oleh method tersebut ke dalam class main
   - Untuk menentukan kapan suatu method menggunakan return adalah kondisi dimana anda perlu pengembalian nilai dengan tipe data yang telah ditentukan. Jika tidak memerlukan pengembalian nilai, sebaiknya menggunakan tipe data void supaya tidak perlu mengembalikan nilai / untuk menampilkan data

### Source Code

- [Barang.java](/class-and-object/percobaan3/code/Barang.java)
- [TestBarang.java](/class-and-object/percobaan3/code/TestBarang.java)
