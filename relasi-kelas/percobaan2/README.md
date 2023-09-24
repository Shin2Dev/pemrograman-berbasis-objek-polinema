# Percobaan 2

Perhatikan diagram _class_ berikut yang menggambarkan sistem rental mobil. Pelanggan bisa menyewa mobil sekaligus sopir. Biaya sopir dan biaya sewa mobil dihitung per hari

![Relasi Class Sistem Rental Mobil](/relasi-kelas/percobaan2/img/relasiclassper2.png)

1.  Buka IDE, dan buat folder baru sebagai package
2.  Buatlah _class_ Mobil di dalam _package_ tersebut.
3.  Tambahkan atribut _merk_ tipe String dan biaya tipe int dengan akses _modifier_ private.
4.  Tambahkan _constructor default_ serta setter dan getter.
5.  Implementasikan method hitungBiayaMobil

    ```java
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
    ```

6.  Tambahkan _class_ Sopir dengan atribut nama tipe String dan biaya tipe _int_ dengan akses _modifier_ private berikut dengan constructor default.
7.  Implementasikan method hitungBiayaSopir

    ```java
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
    ```

8.  Tambahkan _class_ Pelanggan dengan _constructor default_.
9.  Tambahkan atribut‑atribut dengan akses modifier _private_ berikut:

    | Atribut | Tipe   |
    | ------- | ------ |
    | nama    | String |
    | mobil   | Mobil  |
    | sopir   | Sopir  |
    | hari    | int    |

10. Implementasikan _setter_ dan _getter_.
11. Tambahkan method hitungBiayaTotal

    ```java
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

    ```

12. Buatlah class MainPercobaan2 yang berisi method main(). Tambahkan baris kode berikut:

    ```java
    Mobil m = new Mobil();
    m.setMerk("Avanza");
    m.setBiaya(350000);
    Sopir s = new Sopir();
    s.setNama("John Doe");
    s.setBiaya(200000);
    Pelanggan p = new Pelanggan();
    p.setNama("Jane Doe");
    p.setMobil(m);
    p.setSopir(s);
    p.setHari(2);
    System.out.println("Biaya Total = " + p.hitungBiayaTotal());
    ```

13. _Compile_ dan jalankan class MainPercobaan2, dan perhatikan hasilnya!

### Pertanyaan

1. Perhatikan _class_ Pelanggan. Pada baris program manakah yang menunjukan bahwa _class_ Pelanggan memiliki relasi dengan _class_ Mobil dan _class_ Sopir?
2. Perhatikan _method_ hitungBiayaSopir pada _class_ Sopir, serta _method_ hitungBiayaMobil pada _class_ Mobil. Mengapa menurut Anda _method_ tersebut harus memiliki argument hari?
3. Perhatikan kode dari _class_ Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari)?
4. Perhatikan _class_ MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?
5. Perhatikan _class_ MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ?
6. Perhatikan _class_ MainPercobaan2, coba tambahkan pada baris terakhir dari _method main_ dan amati perubahan saat di‑_run_!

   ```java
   System.out.println(p.getMobil().getMerk());
   ```

   Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam _method main_ tersebut?

### Source Code

- [Mobil.java]()
- [Sopir.java]()
- [Pelanggan.java]()
- [MainPercobaan2.java]()
