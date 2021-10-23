package com.bintang.prak2.modul0.percobaan;
import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int var_a, var_b;

        System.out.print("Masukkan nilai var var_a :");
        var_a = input.nextInt();
        System.out.print("Masukkan nilai var var_b :");
        var_b = input.nextInt();

        System.out.println();
        System.out.println("Variabel yang terdapat dalam program :");
        System.out.println("var_a = " + var_a);
        System.out.println("var_b =" + var_b);
    }
}