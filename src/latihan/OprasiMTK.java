package latihan;
import java.util.Scanner;

public class OprasiMTK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukan Nilai a = ");
        a= scan.nextInt();
        System.out.print("Masukan Nilai b = ");
        b= scan.nextInt();
        System.out.print("Masukan Nilai c = ");
        c= scan.nextInt();
        //Output akhir program
        System.out.println("Hasil dari A+B-C adalah = " + (a+b-c));
    }
}
