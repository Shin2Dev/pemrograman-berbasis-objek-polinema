public class EncapTest {
    public static void main(String[] args) {
        // Instansiasi objek encapdemo
        EncapDemo encap = new EncapDemo();

        // Deklarasi nama dan umur
        encap.setName("James");
        encap.setAge(40);

        // Menampilkan data nama dan umur
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
