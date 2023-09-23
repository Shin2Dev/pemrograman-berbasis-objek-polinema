# _Encapsulation_

## Kompetensi

Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:

1. Konstruktor
2. Akses Modifier
3. Atribut/method pada class
4. Instansiasi atribut/method
5. Setter dan getter
6. Memahami notasi pada UML Class Diagram

## Pendahuluan

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pada pertemuan pertama dan kedua telah dibahasan konsep dasar dari pemrograman berbasis objek (PBO), perbedaan antara pemrograman berbasis objek dengan pemrograman struktural, dan telah dibahas konsep class dan object pada PBO. Selanjutnya pada modul ini akan dibahas konsep enkapsulasi pada PBO dan notasi yang ada pada UML Class diagram.

### Enkapsulasi

Pada modul pertama telah dijabarkan definisi dari enkapsulasi sebagai berikut: <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enkapsulasi disebut juga dengan **information-hiding**. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui kompleksitas yang ada didalamnya. Hal ini akan lebih mudah dipahami jika kita membayangkan atau menganalisa objek yang ada disekitar kita, misalnya objek sepeda, ketika kita mengganti gear pada sepeda, kita tinggal menekan tuas gear yang ada di grip setang sepeda saja. Kita tidak perlu mengetahui bagaimana cara gear berpindah secara teknis.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contoh objek lain misalnya mesin penghisap debu (vacum cleaner), ketika kita mencolokkan kabel vacum cleaner dan menyalakan sakelarnya maka mesin tersebut siap digunakan untuk menghisap debu. Dalam proses tersebut kita tidak mengetahui proses rumit yang terjadi ketika mengubah listrik menjadi tenaga dari vacum cleaner. Dalam contoh diatas vacum cleaner dan sepeda telah menerapkan enkapsulasi atau disebut juga **information-hiding atau data hiding** karena menyembunyikan detail proses suatu objek dari pengguna.

### Konstruktor

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Dan konstruktor dieksekusi ketika instan dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan keyword new() maka konstruktor akan dieksekusi. Cara untuk membuat konstruktor adalah sebagai berikut:

1. Nama konstruktor harus sama dengan nama class
2. Konstruktor tidak memiliki tipe data return
3. Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan syncronized <br>
   **Note**: Di java kita dapat memiliki konstruktor dengan modifier private, protected, public or default.

### Akses Modifier

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Terdapat 2 tipe modifier di java yaitu : akses modifier dan non-access modifier. Dalam hal ini kita akan fokus pada akses modifier yang berguna untuk mengatur akses method, class, dan constructor. Terdapat 4 akses modifier yaitu:

1. private – hanya dapat diakses di dalam kelas yang sama
2. default – hanya dapat diakses di dalam package yang sama
3. protected – dapat diakases di luar package menggunakan subclass (membuat inheritance)
4. public – dapat diakases dari mana saja

Detail akses modifier dapat dilihat pada Tabel dibawah ini:
| Access Modifier | Diakses dalam class | Diakses dalam package | Diakses diluar package tetapi harus subclass | Diakses diluar package |
| --------------- | ------------------- | --------------------- | -------------------------------------------- | ---------------------- |
| Private | Ya | Tidak | Tidak | Tidak |
| Default | Ya | Ya | Tidak | Tidak |
| Protected | Ya | Ya | Ya | Tidak |
| Public | Ya | Ya | Ya | Ya |

### Getter dan Setter

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Getter adalah public method dan memiliki tipe data return, yang berfungsi untuk mendapatkan nilai dari atribut private. Sedangkan setter adalah public method yang tidak memliki tipe data return, yang berfungsi untuk memanipulasi nilai dari atribut private

### Notasi UML Class Diagram

Secara umum bentuk UML class diagram adalah seperti pada Gambar <br>
![Notasi UML Class Diagram](/encapsulation/img/uml.png)

Keterangan :

1. Class
2. Interface
3. Enumeration – adalah tipe data yang memiliki nilai atau literal yang terbatas.
4. Atrributes
5. Method
6. Literals

Notasi akses modifier pada UML class diagram adalah sebagai berikut:

- Tanda plus (+) untuk public
- Tanda pagar (#) untuk protected
- Tanda minus (-) untuk private
- Untuk default, maka tidak diberi notasi
