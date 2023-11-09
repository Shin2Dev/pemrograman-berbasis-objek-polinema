# Quiz 1

1.  Class dan Object:
    - Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?
    - Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?
    - Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. <br>
      Bagaimana Anda akan membuat objek "laptop" dari class tersebut?
2.  Encapsulation:
    - Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.
    - Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa.
3.  Relasi Kelas:
    - Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?
    - Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?
4.  PBL:
    - Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").
    - Bagaimana Anda akan menggunakan encapsulation untuk melindungi atribut-atribut dalam class tersebut?
    - Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut

# Jawaban

## Class dan Object

1.  Class dalam pemrograman berbasis objek adalah sebagai blueprint / wadah untuk membuat suatu objek yang berisikan atribut dan method berdasarkan class tersebut
2.  Dalam mendefinisikan objek dari suatu class, ada beberapa tahap:
    - Membuat class yang akan dijadikan objek serta atribut dan methodnya
    - Membuat class main yang akan digunakan untuk menjalankan program
    - Menginstansiasikan / membuat objek tersebut ke dalam class main
    - Mengakses atribut dan method dari objek tersebut dan memanipulasi nilainya
3.  Dalam membuat objek laptop, dimulai dari:

    - Membuat class "**Barang**" yang berisikan atribut seperti nama, merk, dsb dan method seperti tampilBarang(), dsb.

      ```java
      public class Barang {
          // Atribut dan metode class Barang
      }
      ```

    - Buatlah class main yang akan digunakan untuk menjalankan program

      ```java
      public class main {
          public static void main (String args[]){
              // main
          }
      }
      ```

    - Didalam class main, buatlah objek "**Laptop**" dengan menginstansiasikan class "**Barang**" ke dalam class main

      ```java
      Barang laptop = new Barang();
      ```

    - Setelah objek dibuat, barulah bisa manipulasi nilai didalam class Barang tersebut.

## Encapsulation

1.  Encapsulation dalam pemrograman berbasis objek adalah suatu konsep yang digunakan untuk menyembunyikan atribut dan method di dalam suatu class atau istilahnya mengemas data tersebut dalam suatu class dan dapat mengatur akses data tersebut.

    Encapsulation sangat penting khususnya didalam pengembangan sistem informasi inventaris barang karena:

    - Keamanan data yang terjamin karena data seperti harga barang, informasi pemasok, dsb tidak dapat diakses dan dimanipulasi dengan sembarangan
    - Kode dapat dipelihara dengan baik dan dapat dimodifikasi dengan mudah asalkan antarmuka objek (main) tidak berubah

2.  Contoh atribut yang harus dikemas / encapsulation di dalam class "**Barang**" antara lain:
    - hargaBarang: harga barang digunakan untuk validasi harga dari pemilik barang itu sendiri. Sehingga harga harus dirahasiakan dan hanya pemilik yang dapat mengubahnya
    - jumlahBarang: jumlah barang atau stok juga dirahasiakan supaya tidak terjadi perubahan stok yang tidak diinginkan
    - namaBarang: nama dirahasiakan supaya tidak ada kesalahan dalam nama barang

## Relasi Kelas

1.  Relasi Kelas adalah konsep pemrograman berbasis objek yang mengacu pada dua kelas atau lebih yang saling berhubungan

    Contoh relasi kelas:

    - Inheritance (Pewarisan): relasi antara kelas induk dan kelas anak yang memungkinkan untuk membuat hierarki dari kedua kelas tersebut
    - Asosiasi: relasi dua kelas yang saling berhubungan dalam suatu konteks

2.  Dalam sistem informasi inventaris barang, kelas "**Barang**" dan "**Kategori**" dapat dihubungkan menjadi sebuah relasi yang dapat digunaka untuk mengelola barang dan kategori dalam inventaris

    Penggambaran relasi antara kelas "**Barang**" dan "**Kategori**":

    - Kelas "**Barang**"
      Kelas yang punya atribut seperti

      - namaBarang
      - jumlahBarang
      - hargaBarang
      - kategori

      Methodnya seperti

      - tambahStok()
      - kurangStok()
      - tampilInfo()

    - Kelas "**Kategori**"
      Kelas yang punya atribut seperti
      - namaKategori
      - deskripsiKategori

    Hubungan antara kelas "**Barang**" dan "**Kategori**":

    - Setiap objek dari kelas "**Barang**" akan terkait dengan satu objek dari kelas "**Kategori**". Ini berarti setiap barang akan termasuk dalam satu kategori tertentu.

## PBL

1. Class "**Barang**"

   ```java
   public class Barang {
       private String namaBarang;
       private int stok;
       private double harga;

       public Barang(String namaBarang, int stok, double harga){
           this.namaBarang = namaBarang;
           this.stok = stok;
           this.harga = harga;
       }

       public String getNamaBarang(){
           return namaBarang;
       }

       public int getStokBarang(){
           return stok;
       }

       public double getHargaBarang(){
           return harga;
       }

       public String setNamaBarang(String nama){
           namaBarang = nama;
           return nama;
       }

       public double setHargaBarang(double harga){
           this.harga = harga;
           return harga;
       }

       public int tambahStok(int tambahan){
           stok += tambahan;
           return stok;
       }

       public void kurangStok(int kurangan){
           if (kurangan <= stok){
               stok -= kurangan;
           } else {
               System.out.println("Stok tidak mencukupi");
           }
       }

       public void tampilInfo(){
           System.out.println("Nama Barang : " + namaBarang);
           System.out.println("Stok Barang : " + stok);
           System.out.println("Harga Barang: " + harga);
       }
   }
   ```

2. Untuk melindungi atribut dalam class "**Barang**", ada dua cara yaitu:

   - Atribut private yang dapat dimodifikasi dalam class itu sendiri
   - Method getter dan setter yang dapat mengambil dan mengubah nilai dari atribut

3.
