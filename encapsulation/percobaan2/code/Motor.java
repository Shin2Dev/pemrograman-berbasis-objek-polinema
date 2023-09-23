public class Motor {
    // Atribut Motor
    private int kecepatan = 0;
    private boolean kontakOn = false;

    // Method Menyalakan mesin
    public void nyalakanMesin() {
        kontakOn = true;
    }

    // Method Mematikan mesin
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    // Method menambah kecepatan dan mengecek maksimal kecepatan
    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan == 100) {
                System.out.println("Kecepatan telah mencapai 100, tidak dapat bertambah lagi!");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    // Method mengurangi kecepatan
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

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