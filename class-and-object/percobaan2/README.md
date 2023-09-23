# Percobaan 2: Membuat dan mengakses anggota suatu class

Studi Kasus 2: <br>
Perhatikan class diagram dibawah ini. Buatlah program berdasarkan class diagram tersebut! <br>
![UML](/class-and-object/percobaan2/img/uml.png)

Langkah kerja:

1. Bukalah text editor atau IDE
2. Ketikkan kode program berikut ini

   ```java
   public class Mahasiswa {
       public int nim;
       public String nama;
       public String alamat;
       public String kelas;

       public void tampilBiodata(){
           System.out.println("Nim    : " + nim);
           System.out.println("Nama   : " + nama);
           System.out.println("Alamat : " + alamat);
           System.out.println("Kelas  : " + kelas);
       }
   }
   ```

3. Simpan dengan nama file Mahasiswa.java.
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggota-anggota dari class Mahasiswa dengan membuka file baru kemudian ketikkan kode program berikut:

   ```java
   public class TestMahasiswa {
       public static void main (String args[]){
           Mahasiswa mhs1 = new Mahasiswa();
           mhs1.nim = 101;
           mhs1.nama = "Lestari";
           mhs1.alamat = "Jl. Vinolia No 1A";
           mhs1.kelas = "1A";
           mhs1.tampilBiodata();
       }
   }
   ```

5. Simpan file dengan TestMahasiswa.java
6. Jalankan class TestMahasiswa
7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

   - Pendeklarasian atribut pada program class TestMahasiswa sebanyak empat atribut, atribut tersebut adalah atribut yang terdapat pada class Mahasiswa.
   - Untuk pendeklarasiannya dimulai pada baris ke-4 hingga ke-7 setelah instansiasi objek Mahasiswa di class TestMahasiswa

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!

   - Pendeklarasian method pada program class TestMahasiswa sebanyak satu method, method tersebut adalah method yang terdapat pada class Mahasiswa.
   - Untuk pendeklarasiannya terletak pada baris ke-8 setelah pendeklarasian atribut di class TestMahasiswa.

9. Berapa banyak objek yang di instansiasi pada program diatas!

   - Objek yang terdapat pada class TestMahasiswa hanya menginstansiasi satu objek yaitu mhs1

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

    - Sintaks tersebut adalah sintaks yang melakukan deklarasi atribut nim dengan nilai 101 dan akan dimasukkan ke dalam data objek mhs1

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?

    - Sintaks tersebut adalah sintaks yang melakukan deklarasi method yang digunakan untuk menampilkan data dari objek mhs1 yang terdiri dari empat atribut di objek tersebut

12. Instansiasi 2 objek lagi pada program diatas!

    - Modifikasinya

      ```java
      public class TestMahasiswa {
            public static void main(String[] args) {
                Mahasiswa mhs1 = new Mahasiswa();
                Mahasiswa mhs2 = new Mahasiswa();
                Mahasiswa mhs3 = new Mahasiswa();

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

                System.out.println("==========================");
                mhs1.tampilBiodata();
                System.out.println("==========================");
                mhs2.tampilBiodata();
                System.out.println("==========================");
                mhs3.tampilBiodata();
                System.out.println("==========================");
            }
        }
      ```

    - Output <br>
      ![Output](/class-and-object/percobaan2/img/output.png)

### Source Code

- [Mahasiswa.java](/class-and-object/percobaan2/code/Mahasiswa.java)
- [TestMahasiswa.java](/class-and-object/percobaan2/code/TestMahasiswa.java)
