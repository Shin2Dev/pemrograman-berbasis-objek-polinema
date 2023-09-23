public class Motor {
    // Atribut motor
    public int kecepatan = 0;
    public boolean kontakOn = false;

    // Menampilkan status mesin sekarang
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}