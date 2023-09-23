import java.util.Scanner;

public class TestLingkaran {
    public static void main(String[] args) {
        // Instansiasi Scanner
        Scanner sc = new Scanner(System.in);

        // Instansiasi Objek Lingkaran
        Lingkaran bunder = new Lingkaran(3.14);

        System.out.println("=========================");
        System.out.println("LINGKARAN");
        System.out.println("=========================");

        // Menginputkan jari-jari Lingkaran
        System.out.print("Jari-jari : ");
        bunder.r = sc.nextDouble();
        System.out.println("=========================");

        // Menghitung Keliling Lingkaran
        System.out.println("Keliling Lingkaran: " + bunder.hitungKeliling());

        // Menghitung Luas Lingkaran
        System.out.println("Luas Lingkaran: " + bunder.hitungLuas());
        System.out.println("=========================");
    }
}
