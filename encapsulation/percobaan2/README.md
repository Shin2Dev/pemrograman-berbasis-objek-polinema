# Percobaan 2 - Access Modifier

Pada percobaan ini akan digunakan access modifier untuk memperbaiki cara kerja class Motor pada [percobaan ke-1](/encapsulation/percobaan1/)

1. Ubah cara kerja class motor sesuai dengan UML class diagram berikut.

   ![UML Class Motor 2](/encapsulation/percobaan2/img/uml2.png)

2. Berdasarkan UML class diagram tersebut maka class Motor terdapat perubahan, yaitu:

   - Ubah access modifier kecepatan dan kontakOn menjadi private
   - Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan, kurangiKecepatan

   Implementasi class Motor adalah sebagai berikut:

   ```java
   package motorencapsulation;

   public class Motor {
       // Access Modifier nya berubah dari public ke private
       private int kecepatan = 0;
       private boolean kontakOn = false;

       // Method ditambahkan
       public void nyalakanMesin() {
           kontakOn = true;
       }

       public void matikanMesin() {
           kontakOn = false;
           kecepatan = 0;
       }

       public void tambahKecepatan() {
           if (kontakOn == true) {
               kecepatan += 5;
           } else {
               System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
           }
       }

       public void kurangiKecepatan() {
           if (kontakOn == true) {
               kecepatan -= 5;
           } else {
               System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
           }
       }
       //

       public void printStatus() {
           if (kontakOn == true) {
               System.out.println("Kontak On");
           } else {
               System.out.println("Kontak Off");
           }
           System.out.println("Kecepatan " + kecepatan + "\n");
       }
   }
   ```

3. Kemudian pada class MotorDemo, ubah code menjadi seperti berikut:

   ```java
   package motorencapsulation;

   public class MotorDemo {
       public static void main(String[] args) {
           Motor motor = new Motor();
           motor.printStatus();
           motor.tambahKecepatan();

           motor.nyalakanMesin();
           motor.printStatus();

           motor.tambahKecepatan();
           motor.printStatus();

           motor.tambahKecepatan();
           motor.printStatus();

           motor.tambahKecepatan();
           motor.printStatus();

           motor.matikanMesin();
           motor.printStatus();
       }
   }
   ```

4. Hasilnya dari class MotorDemo adalah sebagai berikut:

   ![Output Class Motor 2](/encapsulation/percobaan2/img/output2.png)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. Untuk mendapatkan kecepatan yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor.

### Pertanyaan

1. Pada class MotorDemo, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
   - Hal ini terjadi karena kecepatan mesin tidak dapat bertambah jika mesin nya tidak dinyalakan dulu / dalam keadaan off. Jika ingin kecepatan dapat bertambah, maka mesin harus dinyalakan / dalam keadaan on
2. Mengapa atribut kecepatan dan kontakOn diset private?
   - Menurut saya, atribut diset private agar tidak dapat diakses oleh class luar atau dengan kata lain dapat dilindungi sehingga tidak dapat dimodifikasi sembarangan dan mencegah perubahan yang tidak diinginkan atau kesalahan dalam manipulasi data.
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

   - Berikut potongan kode modifikasi (method **tambahKecepatan()**)

     ```java
     public void tambahKecepatan() {
         if (kontakOn == true) {

             // Mengecek apakah kecepatan sekarang 100
             if (kecepatan == 100) {

                 // Jika iya, maka tampil pesan
                 System.out.println("Kecepatan telah mencapai 100, tidak dapat bertambah lagi!");
             } else {

                 // Jika tidak, maka dapat bertambah kecepatannya
                 kecepatan += 5;
             }
         } else {
             System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
         }
     }
     ```

### Source Code

- [Motor.java](/encapsulation/percobaan2/code/Motor.java)
- [MotorDemo.java](/encapsulation/percobaan2/code/MotorDemo.java)
