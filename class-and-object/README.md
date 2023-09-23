# Class dan Object

## Kompetensi

- Mahasiswa dapat memahami deskripsi dari class dan object
- Mahasiswa memahami implementasi dari class
- Mahasiswa dapat memahami implementasi dari attribute
- Mahasiswa dapat memahami implementasi dari method
- Mahasiswa dapat memahami implementasi dari proses instansiasi
- Mahasiswa dapat memahami implementasi dari try-catch
- Mahasiswa dapat memahami proses pemodelan class diagram menggunakan _UML_

## Pendahuluan

### Class dan Object

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pada pertemuan sebelumnya anda sudah diberikan banyak penjelasan secara _semantic_ (makna) mengenai deskripsi dari class dan object. Secara singkat class adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman). Apabila kita ingin membuat class mahasiswa, maka kita perlu melakukan abstraksi (mengindikasi bagian – bagian penting yang merepresentasikan benda itu sendiri) dari object mahasiswa itu sendiri. Contoh salah satu attribute yang mengidentifikasi jika seseorang itu mahasiswa adalah **Nim** (Nomor Induk Mahasiswa), dan **Nim** tidak akan anda temui pada attribute dosen. Selain attribute abstraksi juga digunakan untuk behavior (perilaku) , contoh salah satu perilaku yang bisa dilakukan oleh mahasiswa adalah mengikuti **UAS**, dan anda juga tidak akan pernah menemui perilaku tersebut pada object dosen. Oleh karena itu sangat mudah untuk seorang perancang system dalam memodelkan sebuah class dari sebuah object tertentu.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Setelah kita memahami secara semantic pengertian dari class dan object, maka langkah selanjutnya adalah bagaimana cara melakukan implementasi class pada pendekatan Object Oriented Programming, terutama pada bahasa pemrograman java. Berikut adalah sintaks dari deklarasi class pada pemrograman java :

```java
<modifier> class <nama_class> {
    // deklarasi atribut dan method
}
```

Aturan penulisan class adalah sebagai berikut:

1. Berupa kata benda,
2. Diawali dengan **HURUF BESAR**,
3. Jika terdiri dari lebih dari 1 kata, maka antar kata satu dengan kata yang lain digandeng, dan tiap huruf awal dari tiap kata menggunakan **HURUF BESAR**

**_Untuk Access Modifier tidak dibahas pada jobsheet ini, melainkan akan dibahas pada jobsheet berikutnya_**

Contoh deklarasi class:

```java
public class Mahasiswa {

}
```

### _Attribute_

Untuk melakukan pendeklarasian _attribute_ dapat dilakukan dengan sintaks sebagai berikut:

```java
<modifier><tipe><nama_atribut>;
```

Aturan penulisan atribut adalah sebagai berikut:

1. Berupa kata benda,
2. Diawali dengan HURUF KECIL,
3. Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah)

Contoh deklarasi atribut:

```java
public class Mahasiswa {
    // Attribut
    public int nim;
    public String nama;
    public String alamat;
    public float luas;
    //
}
```

### _Method_

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Method adalah suatu blok dari program yang berisi kode program nama dan properti yang dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak. Method yang tidak mempunyai nilai balik dipanggil dalam pernyataan yang akan dikerjakan, sedangkan method yang mempunyai nilai balik dipanggil dari suatu ekpresi. Kata kunci untuk mengembalikan/mengeluarkan suatu nilai adalah return

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Method dengan tipe data void, berarti tidak memiliki nilai balik, berarti tidak memerlukan kata kunci return di dalamnya. Method dengan tipe data bukan void, berarti memerlukan suatu nilai balik, yaitu harus memerlukan return di dalamnya

Deklarasi method dapat dilakukan dengan sintaks sebagai berikut:

```java
public class Mahasiswa {

    <modifier><tipe_data><nama_metode>([daftar_argumen]){
        // statement
    }

}
```

Contoh method dengan tipe void dan method yang mengembalikan nilai (_return_)

```java
// Tidak perlu return karena void
public void sayHello(){
    System.out.println("Hello World!!");
}

// Karena ada tipe data (int), maka method harus mengembalikan nilai int
public int tambah(int a, int b){
    int hasil = a + b;
    return hasil;
}
```

Aturan penulisan method adalah sebagai berikut:

1. Berupa kata kerja,
2. Diawali dengan **HURUF KECIL**,
3. Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah)

Contoh deklarasi method:

```java
public void tampil(){
    System.out.println("Hallo PBO!!");
}

public int tambah(int a, int b){
    return a+b;
}
```

### _Object_

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Setelah Class dibuat, langkah selanjutnya adalah membuat Object. Proses pembuatan Object dari suatu Class disebut instansiasi. Format dasar instansiasi adalah sebagai berikut:

```java
NamaClass namaObject = new NamaClass();
```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Proses membuat objek dari suatu class adalah INSTANSIASI, dan ditandai kata kunci new. Aturan penulisan objek adalah sama seperti penulisan atribut. Contoh :

```java
Random r = new Random();
Pegawai p2 = new Pegawai();
Mahasiswa mhs1 = new Mahasiswa();
```

### _Try - catch_

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Untuk menangani **_error_** di Java, digunakan sebuah statement yang bernama _try - catch_. Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan _error_ dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung. _Error_ yang ditangani oleh _try – catch_ biasa disebut dengan **_exception_**.

Ada beberapa hal yang perlu diingat ketika akan menggunakan try - catch di Java:

1. Kita dapat membuat multiple try-catch,
2. Kita dapat menambahkan statement finally untuk menangani berbagai hal ketika error terjadi atau tidak,
3. Kita dapat membuat exception sendiri disamping menggunakan bawaan Java. Untuk melihat hasil dari implementasi dari try-catch, maka kita perlu melakukan komparasi sintaks tanpa try-catch dengan sintaks yang menggunakan try-catch.

Berikut percobaanya:

- Tanpa menggunakan try-catch:

```java
public class SourceErrorExp {
    public static void main(String args[]){
        System.out.println("awal program");

        int x = 10;
        x = x / 0;

        System.out.println(x);
        System.out.println("akhir program");
    }
}
```

Hasil: <br>
![Output Tanpa menggunakan try-catch](/class-and-object/img/output1.png)

Berbeda bila kita kurung operasi pembagian nol diatas dengan try - catch, maka hasil eksekusi program akan sedikit berbeda:

```java
public class TanpaTC {
    public static void main(String args[]){
        System.out.println("awal program");

        int x = 10;
        try {
            x = x / 0;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("error karena pembagian nol");
        }

        System.out.println(x);
        System.out.println("akhir program");
    }
}
```

Hasil: <br>
![Output Tanpa menggunakan try-catch](/class-and-object/img/output2.png)

## _Unified Modeling Language ( UML )_

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Unified Modeling Language ( UML ) adalah tujuan umum, perkembangan, bahasa pemodelan di bidang rekayasa perangkat lunak , yang dimaksudkan untuk menyediakan cara standar untuk memvisualisasikan desain sistem. UML menyediakan sembilan jenis diagram yaitu Diagram kelas (Class Diagram), Diagram paket (Package Diagram), Diagram use-case (Usecase Diagram), Diagram interaksi dan sequence (Sequence Diagram), Diagram komunikasi (Communication Diagram), Diagram statechart (Statechart Diagram), Diagram aktivitas (Activity Diagram), Diagram komponen (Component Diagram), dan Diagram deployment (deployment diagram). Pada materi ini yang akan dipelajari adalah diagram class (class diagram).

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Class diagram adalah sebuah class yang menggambarkan struktur dan penjelasan class, paket, dan objek serta hubungan satu sama lain seperti pewarisan, asosiasi, dan lain-lain. Class diagram juga menjelaskan hubungan antar class dalam sebuah sistem yang sedang dibuat dan bagaimana caranya agar mereka saling berkolaborasi untuk mencapai sebuah tujuan. Class juga memiliki 3 area pokok (utama) yaitu : nama,atribut,dan operasi. Nama berfungsi untuk member identitas pada sebuah kelas, atribut fungsinya adalah untuk member karakteristik pada data yang dimiliki suatu objek di dalam kelas, sedangkan operasi fungsinya adalah memberikan sebuah fungsi ke sebuah objek. Berikut ini merupakan contoh dari class diagram:

![Unified Modelling Language](/class-and-object/img/uml.png)
