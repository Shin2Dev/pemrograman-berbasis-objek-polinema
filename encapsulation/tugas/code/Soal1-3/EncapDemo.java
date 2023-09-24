public class EncapDemo {
    // Atribut nama dan umur
    private String name;
    private int age;

    // Method getter nama
    public String getName() {
        return name;
    }

    // Method setter nama
    public void setName(String newName) {
        name = newName;
    }

    // Method getter umur
    public int getAge() {
        return age;
    }

    // Method setter umur, maksimal 30 dan minimal 18
    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else if (newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }
}