# Percobaan 1

1. Perhatikan diagram class berikut:

   ![Relasi Class Laptop dan Processor](/relasi-kelas/img/contohrelasi1.png)

2. Buka IDE, dan buat folder baru sebagai package <br>
   **Catatan**: Penamaan _package_ dengan tambahan identifier untuk menghindari adanya kemungkinan penamaan _class_ yang bentrok.
3. Buat class Processor dalam _package_ tersebut.

   ```java
   public class Processor {

   }
   ```

4. Tambahkan atribut merk dan _cache_ pada class Processor dengan akses modifier private .

   ```java
   private String merk;
   private double cache;
   ```

5. Buatlah _constructor default_ untuk class Processor.
6. Buatlah _constructor_ untuk class Processor dengan parameter merk dan _cache_
7. Implementasikan **setter** dan **getter** untuk class Processor.
8. Implementasikan _method_ info() seperti berikut

   ```java
   public void info(){
      System.out.printf("Merk Processor = %s\n", merk);
      System.out.printf("Cache Memory = %.2f\n", cache);
   }
   ```

9. Kemudian buatlah class Laptop di dalam package yang telah anda buat.
10. Tambahkan atribut merk dengan tipe String dan proc dengan tipe Object Processor

    ```java
    private String merk;
    private Processor proc;
    ```

11. Buatlah _constructor default_ untuk _class_ Laptop.
12. Buatlah _constructor_ untuk _class_ Laptop dengan parameter merk dan proc.
13. Selanjutnya implementasikan method info() pada class Laptop sebagai berikut.

    ```java
    public void info(){
       System.out.println("Merk Laptop = " + merk);
       proc.info();
    }
    ```

14. Pada _package_ yang sama, buatlah class MainPercobaan1 yang berisi method main().
15. Deklarasikan Object Processor dengan nama p kemudian instansiasi dengan informasi atribut Intel i5 untuk nilai merk serta 3 untuk nilai _cache_.

    ```java
    Processor p = new Processor("Intel i5", 3);
    ```

16. Kemudian deklarasikan serta instansiasi Objek Laptop dengan nama L dengan informasi atribut Thinkpad dan Objek Processor yang telah dibuat.
17. Panggil method info() dari Objek L.

    ```java
    L.info();
    ```

18. Tambahkan baris kode berikut

    ```java
    Processor p1 = new Processor();
    p1.setMerk("Intel i5");
    p1.setCache(4);
    Laptop L1 = new Laptop();
    L1.setMerk("Thinkpad");
    L1.setProc(p1);
    L1.info();
    ```

19. _Compile_ kemudian run class MainPercobaan1, akan didapatkan hasil seperti berikut:

    ![]()

### Pertanyaan

Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:

1. Di dalam _class_ Processor dan _class_ Laptop , terdapat method _setter_ dan _getter_ untuk masing‑masing atributnya. Apakah gunanya _method setter_ dan _getter_ tersebut?
2. Di dalam _class_ Processor dan _class_ Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?
3. Perhatikan _class_ Laptop, di antara 2 atribut yang dimiliki (_merk_ dan _proc_), atribut manakah yang bertipe _object_?
4. Perhatikan _class_ Laptop, pada baris manakah yang menunjukan bahwa _class_ Laptop memiliki relasi dengan _class_ Processor ?
5. Perhatikan pada _class_ Laptop , Apakah guna dari sintaks proc.info() ?
6. Pada class MainPercobaan1, terdapat baris kode:

   ```java
   Laptop l = new Laptop("Thinkpad", p);.
   ```

   Apakah p tersebut ? <br>
   Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:

   ```java
   Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));.
   ```

   Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

### Jawaban

### Source Code

- [Processor.java]()
- [Laptop.java]()
- [MainPercobaan1.java]()
