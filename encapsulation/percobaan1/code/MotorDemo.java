public class MotorDemo {
    public static void main(String[] args) {
        // Instansiasi objek motor
        Motor motor = new Motor();
        // Menampilkan status mesin motor
        motor.printStatus();

        // Deklarasi kecepatan motor
        motor.kecepatan = 50;

        // Menampilkan status mesin motor
        motor.printStatus();
    }
}
