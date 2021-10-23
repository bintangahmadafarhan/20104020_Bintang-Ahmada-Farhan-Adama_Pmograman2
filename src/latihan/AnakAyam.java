package latihan;
import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        int anx, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam : ");
        anx = input.nextInt();
        do {

            System.out.println("Anak ayam turun" + anx);
            anx = anx - i;
            System.out.println("Mati 1 tinggal" + anx);
        }
        while (anx > i);
        {
            System.out.println("Anak ayam turun 1 tinggal induknya");
        }
    }
}