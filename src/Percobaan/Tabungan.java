package Percobaan;

public class Tabungan {
    int saldo;

    Tabungan(int saldo){
        this.saldo = saldo;
    }

    public void ambiluang(int saldo){
        this.saldo = this.saldo - saldo;
    }
}
