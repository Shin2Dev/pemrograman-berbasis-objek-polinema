# Percobaan 1 - Enkapsulasi

Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn, dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut

1. Buka IDE, buat folder MotorEncapsulation
2. Buat class Motor di dalam folder MotorEncapsulation
3. Ketikkan kode class Motor dibawah ini.

   ```java
   package motorencapsulation;

   public class Motor {
       public int kecepatan = 0;
       public boolean kontakOn = false;

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

   bentuk UML class diagram class Motor adalah sebagai berikut

   ![UML Class Motor 1](/encapsulation/percobaan1/img/uml1.png)

4. Kemudian buat class MotorDemo, ketikkan kode berikut ini

   ```java
   package motorencapsulation;

   public class MotorDemo {
       public static void main(String[] args) {
           Motor motor = new Motor();
           motor.printStatus();
           motor.kecepatan = 50;
           motor.printStatus();
       }
   }
   ```

5. Hasilnya adalah sebagai berikut:

   ![Output Class Motor 1](/encapsulation/percobaan1/img/output1.png)

6. Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?
   - Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50.
   - Lebih janggal lagi, posisi kontak motor masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke 50, dan itupun kunci kontaknya OFF?
   - Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu, bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa pertimbangkan beberapa hal berikut ini:
     - Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)
     - Menyediakan method khusus untuk mengakses atribut

Untuk itu mari kita lanjutkan percobaan berikutknya tentang [Access Modifier](/encapsulation/percobaan2/).

### Source Code

- [Motor.java](/encapsulation/percobaan1/code/Motor.java)
- [MotorDemo.java](/encapsulation/percobaan1/code/MotorDemo.java)
