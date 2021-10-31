package Latihan;

public class Tabungan {
    //Attribute
    public int saldo;

    // Constructor method
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    // Method
    public int simpanUang(int jumlah) {
        return saldo = saldo + jumlah;
    }

    public boolean ambiluang(int jumlah) {
        if (saldo - jumlah < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}
