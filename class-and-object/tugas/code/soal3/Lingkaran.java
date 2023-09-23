public class Lingkaran {
    // Atribut Lingkaran
    Double phi, r;

    // Konstruktor untuk phi
    Lingkaran(Double phi) {
        this.phi = phi;
    }

    // Method Menghitung Luas Lingkaran
    Double hitungLuas() {
        return phi * r * r;
    }

    // Method Menghitung Keliling Lingkaran
    Double hitungKeliling() {
        return 2 * phi * r;
    }
}