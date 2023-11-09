public class Soal1Array {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        int count = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                count += 1;
            }
        }

        System.out.println("Jumlah elemen array dua dimensi sebanyak " + count + " elemen");
    }
}