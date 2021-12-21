package Percobaan;

public class percobaan {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("indeks array melebihi batas");
        }
    }
}
