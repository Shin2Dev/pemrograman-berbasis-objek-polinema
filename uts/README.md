# UTS (Ujian Tengah Semester)

## Penulisan Class

Berdasarkan contoh class `ClassA` di bawah ini, jelaskan apakah penulisan source code pada contoh class tersebut sudah benar. Jika tidak, apa yang perlu diperbaiki?

```java
public class classA {
    float f1 = 0.15f;

    float hitung(){
        float x = 2f * f1;
    }
}
```

### Jawaban

Dalam penulisan source code tersebut tidak benar / error. Supaya `classA` dapat dijalankan atau tidak error, maka untuk memperbaikinya adalah dengan menambahkan `return` pada fungsi `hitung()` dengan mengembalikan nilai float yaitu `x`.

Sehingga kode programnya seperti ini:

```java
public class classA {
    float f1 = 0.15f;

    float hitung(){
        float x = 2f * f1;
        return x;
    }
}
```

## Perhitungan Jumlah Elemen Array 2 Dimensi

Pada class `SoalArray1`, terdapat array 2 dimensi dengan ukuran 3x3. Tuliskan code Java untuk menghitung jumlah total elemen array tersebut dengan menggunakan perulangan.

```java
public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
    }
}
```

### Jawaban

Berikut program java `SoalArray1` dalam menghitung jumlah total elemen array dua dimensi

```java
public class sembarang {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        int count = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                count += 1;
            }
        }

        System.out.println("Jumlah elemen array dua dimensi sebanyak " + count + " elemen");
    }
}
```

Output: **Jumlah elemen array dua dimensi sebanyak 9 elemen**

## Pewarisan Atribut dan Method

Pada source code yang diberikan, class `ClassY` merupakan turunan dari class `Class`.

- Sebutkan atribut dan method apa saja yang diwarisi oleh `ClassY` dari kelas induknya (class `Class`).
- Jelaskan juga apa output dari code yang ditulis pada class `ClassY` dan bagaimana nilai tersebut diperoleh.

```java
public class Class {
    int a = 2;
    int x = 0;

    int hitung() {
        x = x + 5 * a;
        return x;
    }
}

public class ClassY extends Class {
    int b = 5;
    int y = 0;

    int hitungY() {
        y = hitung() * b;
        return y;
    }

    public static void main(String[] args) {
        ClassY cy = new ClassY();
        System.out.println(cy.hitungY());
    }
}
```

### Jawaban

- `ClassY` mewarisi atribut dan method dari induknya `Class` yaitu:
  1. **Atribut**, `int a` dan `int x`
  2. **Method**, `hitung()`
- Berikut langkah untuk memperoleh nilai pada `ClassY`:
  1. Didalam class main pada `ClassY`, objek `cy` dibuat dari instansiasi `ClassY`
  2. `cy.hitungY()` berjalan dan memanggil metode `hitung()` dari `Class`
  3. Dalam metode `hitung()`, nilai `x` diperbarui menjadi `x + 5 * a`, yang setara dengan `0 + 5 * 2`, sehingga `x` sekarang menjadi `10`. Metode `hitung()` mengembalikan nilai `x` yang baru, yaitu `10`.
  4. Kembali ke metode `hitungY()` dalam kelas `ClassY`. Nilai yang dikembalikan oleh `hitung() = 10` dikalikan dengan nilai atribut `b = 5`. Sehingga, `y` sekarang menjadi `10 * 5`, yaitu `50`.
  5. Metode `hitungY()` mengembalikan nilai `y`, yang adalah `50`.
  6. Dengan demikian, **output** yang dihasilkan adalah `50`

## Class Mahasiswa dengan Constructor

Dalam class Mahasiswa, lengkapi code dengan:

- Menambahkan constructor untuk mengisi atribut nim, nama, alamat, dan jenisKelamin.
- Membuat objek mahasiswa dan mengisi atribut nim, nama, alamat, dan jenisKelamin melalui constructor.

```java

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin

    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor
    }
}
```

### Jawaban

Berikut program java `Mahasiswa` yang lengkap dengan constructor

```java
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // Constructor
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        // Buat objek mahasiswa lewat constructor
        Mahasiswa imam = new Mahasiswa(
                "2241720151",
                "Mochamad Imam Hanafi",
                "Kandangan",
                'L');

        System.out.println(
                "Nim : " + imam.nim + "\n" +
                "Nama : " + imam.nama + "\n" +
                "Alamat : " + imam.alamat + "\n" +
                "Jenis Kelamin: " + imam.jenisKelamin);
    }
}
```

Output: <br>
**Nim : 2241720151** <br>
**Nama : Mochamad Imam Hanafi** <br>
**Alamat : Kandangan** <br>
**Jenis Kelamin: L** <br>

## OOP Buku -> Penulis

Perhatikan class diagaram berikut dan Buatlah Source code dalam Bahasa java berdasarkan class diagram tersebut

![Class Diagram](/uts/diagram.png)

### Jawaban

**Class Penulis**

```java
public class Penulis {
    String nama, alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
```

**Class Buku**

```java
public class Buku {
    String ISBN, judul;
    Penulis penulis;
    int harga;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
}
```
