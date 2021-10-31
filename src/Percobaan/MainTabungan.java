package Percobaan;


public class MainTabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 12345);
        Tabungan kamu = new Tabungan(
                "Manu",
                12467,
                15_000,
                222222
        );

        System.out.println("Saldo awal saya: " + saya.getSaldo());
        System.out.println("Saldo awal kamu: " + kamu.getSaldo());

        System.out.println("PIN saya: " + saya.getPin());
        System.out.println("PIN kamu: " + kamu.getPin());
    }
}