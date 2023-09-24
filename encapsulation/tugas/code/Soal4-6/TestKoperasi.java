import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        // Instansiasi Scanner, menuLain, Anggota
        Scanner sc = new Scanner(System.in);
        char menuLain;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        do {
            // Menu awal
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
                    // Menu meminjam uang
                    System.out.print("Nominal Pinjaman: Rp. ");
                    int pinjaman = sc.nextInt();
                    System.out.println("======================");

                    // Jika limit pinjaman tidak melebihi jumlah dan nominal pinjaman
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
                    // Menu mengangsur uang
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

            // Opsi Menu Lain
            System.out.println("======================");
            System.out.print("Menu lain? (y/t): ");
            menuLain = sc.next().charAt(0);
        } while (menuLain == 'Y' || menuLain == 'y');
        System.out.println("======================");
    }
}
