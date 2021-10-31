package Percobaan;

public class Tabungan {
    //Attribute
    public String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    public Tabungan(String nama, int noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 0;
        this.pin = 12345;
    }

    public Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;             // Nilai default saldo
        this.pin = pin;                 // Nilai default PIN
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }
    public void tarikUang(int jumlah) {
        this.saldo += jumlah;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }
}