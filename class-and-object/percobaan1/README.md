# Percobaan 1: Membuat Class Diagram

Studi Kasus 1: <br>
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1. Gambarkan desain class diagram dari studi kasus 1!,
2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!,
3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!

## Jawaban

1. Berikut adalah desain class diagramnya: <br>
   ![Jawaban No 1](/class-and-object/percobaan1/img/uml1.png)

2. Class yang bisa dibuat berdasarkan studi kasus diatas adalah class Karyawan saja

3. Dari desain yang saya gambarkan pada soal no.1 dan studi kasusnya, atribut dari class Karyawan terdiri dari lima atribut yaitu:

   - Id karyawan dengan tipe data int
   - Nama karyawan dengan tipe data string
   - Jenis kelamin karyawan dengan tipe data char yaitu ‘L’ atau ‘P’
   - Jabatan karyawan dengan tipe data string
   - Gaji karyawan dengan tipe data int, akan tetapi jika angka gaji nya melebihi kapasitas dari int, maka alternatif yang dipakai adalah long / double

4. Dari desain yang saya gambarkan pada soal no.1 dan studi kasusnya, method dari class Karyawan terdiri dari dua method yaitu:
   - tampilData() dengan tipe data void karena digunakan untuk menampilkan data pribadi karyawan
   - tampilGaji() dengan tipe data void karena digunakan untuk menampilkan gaji dari karyawan tersebut
