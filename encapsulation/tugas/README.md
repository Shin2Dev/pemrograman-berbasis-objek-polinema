# Tugas

### Soal 1

Cobalah program dibawah ini dan tuliskan hasil outputnya

```java
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}
```

```java
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
```

Output:

![Output Soal 1](/encapsulation/tugas/img/outputsoal1.png)

### Soal 2

Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada
saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

- Sederhana, karena terdapat kode program yang akan tetap menampilkan umur 30 karena sudah dipatok sebagai umur maksimal. Seperti dalam potongan kode method setAge:

  ```java
  if (newAge > 30) {
      age = 30;
  } else {
      age = newAge;
  }
  ```

  Dalam program tersebut, jika umur yang dimasukkan melebihi 30, maka umur nya adalah 30. Jika tidak, maka umur akan berubah sesuai dengan umur yang dimasukkan. Hal inilah alasan mengapa umur yang dimasukkan 35 tetapi tampilnya umur 30.

### Soal 3

Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18

- Untuk modifikasinya, hanya di method setAge dengan program seperti dibawah:

  ```java
  public void setAge(int newAge) {
      if (newAge > 30) {
          age = 30;
      } else if (newAge < 18) {
          age = 18;
      } else {
          age = newAge;
      }
  }
  ```

  Dengan modifikasi ini, program berjalan sesuai dengan perintah soal 3.

  - Jika age nya lebih dari 30, maka akan tampil 30
  - Jika age nya kurang dari 18, maka akan tampil 18
  - Jika age nya diantara 18 - 30, maka akan tampil sesuai yang dimasukkan

  #### Source Code

  - [EncapDemo.java](/encapsulation/tugas/code/Soal1-3/EncapDemo.java)
  - [EncapTest.java](/encapsulation/tugas/code/Soal1-3/EncapTest.java)

### Soal 4

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.

```java
public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota  : " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
```

Hasil yang diharapkan:

![Output Soal 4](/encapsulation/tugas/img/outputsoal4.png)

Jawaban: <br>
Berikut adalah kode program class anggota

```java
public class Anggota {
    // Atribut anggota dan pinjaman
    private String noKtp, nama;
    private int limitPinjaman, jumlahPinjaman;

    // Konstruktor anggota
    Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Method getter
    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method meminjam uang
    public void pinjam(int pinjaman) {
        if (pinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += pinjaman;
            limitPinjaman -= pinjaman;
        }
    }

    // Method mengangsur pinjaman
    public void angsur(int bayarPinjam) {
        if (jumlahPinjaman == 0) {
            System.out.println("Anda tidak melakukan peminjaman");
        } else {
            if (bayarPinjam > jumlahPinjaman) {
                jumlahPinjaman = 0;
            } else {
                jumlahPinjaman -= bayarPinjam;
            }
            limitPinjaman += bayarPinjam;
        }
    }
}

```

### Soal 5

Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah
pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf,
angsuran harus 10% dari jumlah pinjaman”

Jawaban: <br>
Berikut modifikasi dari method angsur

```java
public void angsur(int bayarPinjam) {
    if (jumlahPinjaman == 0) {
        System.out.println("Anda tidak melakukan peminjaman");
    } else {
        int minimalBayar = jumlahPinjaman * 10 / 100;

        if (bayarPinjam < minimalBayar) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            if (bayarPinjam > jumlahPinjaman) {
                jumlahPinjaman = 0;
            } else {
                jumlahPinjaman -= bayarPinjam;
            }
        }

        limitPinjaman += bayarPinjam;
    }
}
```

### Soal 6

Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input
dari console.

Jawaban: <br>
Berikut modifikasi dari class TestKoperasi

```java
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char menuLain;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        do {
            System.out.println();
            System.out.println("======================");
            System.out.println("Nama Anggota  : " + donny.getNama());
            System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
            System.out.println("======================");
            System.out.println("1. Meminjam Uang");
            System.out.println("2. Mengangsur Pinjaman");
            System.out.println("======================");
            System.out.print("Menu: ");
            int menu = sc.nextInt();
            System.out.println("======================");

            switch (menu) {
                case 1:
                    System.out.print("Nominal Pinjaman: Rp. ");
                    int pinjaman = sc.nextInt();
                    System.out.println("======================");
                    if (pinjaman > donny.getLimitPinjaman()) {
                        if (donny.getJumlahPinjaman() > donny.getLimitPinjaman()) {
                            System.out.println("Maaf, jumlah pinjaman melebihi limit");
                        } else {
                            System.out.println("Maaf, jumlah pinjaman melebihi limit");
                        }
                    } else {
                        donny.pinjam(pinjaman);
                        System.out.println("Jumlah Pinjaman saat ini: Rp. " + donny.getJumlahPinjaman());
                    }
                    break;
                case 2:
                    if (donny.getJumlahPinjaman() == 0) {
                        System.out.println("Anda tidak melakukan peminjaman");
                    } else {
                        System.out.print("Nominal Angsuran: Rp. ");
                        int bayarPinjam = sc.nextInt();
                        System.out.println("======================");
                        donny.angsur(bayarPinjam);
                        System.out.println("Jumlah Pinjaman saat ini: Rp. " + donny.getJumlahPinjaman());
                    }
                    break;
            }

            System.out.println("======================");
            System.out.print("Menu lain? (y/t): ");
            menuLain = sc.next().charAt(0);
        } while (menuLain == 'Y' || menuLain == 'y');
        System.out.println("======================");
    }
}
```

Output:

- Jika melebihi limit <br>
  ![Output 6.1](/encapsulation/tugas/img/outputsoal6.1.png)

- Meminjam uang <br>
  ![Output 6.2](/encapsulation/tugas/img/outputsoal6.2.png)

- Mengangsur pinjaman <br>
  ![Output 6.3](/encapsulation/tugas/img/outputsoal6.3.png)

#### Source Code

- [Anggota.java](/encapsulation/tugas/code/Soal4-6/Anggota.java)
- [TestKoperasi.java](/encapsulation/tugas/code/Soal4-6/TestKoperasi.java)
