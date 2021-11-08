### 20104020_Bintang-Ahmada-Farhan-Adama_Pmograman2
### Praktikum Pemrogaman 2
### Disusun oleh : Bintang Ahmada Farhan Adama
### NIM          : 20104020
<hr>

### Tujuan Praktikum

- Mahasiswa dapat memahami konsep package
- Mahasiswa dapat memahami konsep import
- Mahasiswa dapat memahami kata kunci this
- Mahasiswa dapat menggunakan kata kunci this

### Dasar Teori

* Package

  Package adalah cara mengelola kelas-kelas yang telah kita buat. Package mengelompokkan class-class sesuai dengan kategori tertentu. Class dalam satu package harus disimpan pada directory yang sama dengan nama packagenya. Ketika aplikasi semakin bertambah kompleks, maka package ini dapat membantu anda mengatur komponen-komponen di dalamnya.
Package juga memfasilitasi penggunaan kembali software dengan pernyataan import dari package lainnya, ini lebih baik jika dibandingkan anda harus menyalin class-class tersebut ke dalam setiap program yang menggunakannya.
Keuntungan lainnya dari package adalah bisa menghindari konflik untuk penamaan class, karena package dapat memberikan penamaan yang unik.
Contohnya statement :
import.java.util.Scanner;
Artinya menggunakan class Scanner yang terdapat pada class java.util pada Java API yang merupakan library built-in yang sudah disediakan oleh Java. Kelas yang mengandung method main() memilki syarat tidak berada dalam suatu package, dan hirarki posisi foldernya di atas package yang diimport.

Membuat Package

Ada tiga langkah untuk membuat package :

Mendeklarasikan dan memberi nama package.
Membuat struktur dan nama direktori yang sesuai dengan struktur dan nama package.
Mengkompilasi kelas-kelas sesuai dengan packagenya masing-masing.
Mendeklarasikan dan Memberi Nama Package
Deklarasi package harus diletakkan pada bagian paling awal (sebelum deklarasi import) dari source code setiap kelas yang dibungkus package tersebut. Bentuk umum deklarasi package :
package namaPackage;
Deklarasi tersebut akan memberitahukan kompilator, ke library manakah suatu kelas dikompilasi dan dirujuk.
Syarat nama package :

Diawali huruf kecil
Menggambarkan kelas-kelas yang dibungkusnya
Harus unik (berbeda dengan nama package standard)
Merepresentasikan path dari package tersebut.
Harus sama dengan nama direktorinya.
Contoh package standard :
java.lang (berisi kelas-kelas fundamental yang sering digunakan).
java.awt dan javax.swing (berisi kelas-kelas untuk membangun aplikasi GUI)
java.io (berisi kelas-kelas untuk proses input output)
Membuat Struktur Direktori
Pada langkah ini, buatlah direktori menggunakan file manager (di windows menggunakan explorer) sesuai struktur package dari langkah sebelumnya. Kemudian tempatkan kelas-kelas tersebut ke direktori yang bersesuaian (mirip seperti menyimpan file-file ke dalam folder). Package dapat bersarang di package lain, sehingga dapat dibuat hirarki package.
Bentuk umum pernyataan package multilevel :
package namaPackage1[.namaPackage2[.namaPackage3]];
Contoh hirarki package di JDK :
package java.awt.image;

Compile dan Run Kelas dari suatu Package
Selanjutnya masing-masing kelas tersebut dalam package tersebut dikompilasi menjadi byte code (*.class). Artinya package tersebut siap digunakan.
Menggunakan Package
Ada dua cara menggunakan suatu package yaitu :

- Kelas yang menggunakan berada dalam direktori (package) yang sama dengan kelas-kelas yang digunakan. Maka tidak diperlukan import.
- Kelas yang menggunakan berada dalam direktori (package) yang berbeda dengan kelas-kelas yang digunakan.

* Import Class
Merupakan kata kunci untuk melibatkan class-class lain yang terhimpun di dalam package yang akan kita import. Pelibatan kelas dari package dapat hanya sebagian class (sub class) atau semuanya.
Contoh :
Import BukuSejarah.* ; (semua class dari package BukuSejarah dapat digunakan).
Import Buku.Sejarah ; (hanya class dari package K yang dapat digunakan).

### Kata Kunci This
Variabel kelas (class variable) adalah variabel yang dideklarasikan di dalam sebuah kelas dan bertindak sebagai data field dari kelas tersebut, sedangan variabel local (local variable) adalah variabel yang dideklarasikan di dalam sebuah metode.
Cakupan variabel lokal dimulai dari posisi variabel tersebut dideklarasikan sampai dengan akhir dari blok metode yang ditandai dengan closing brace (}). Cakupan dari variabel kelas meliputi keseluruhan kelas.
This adalah keyword pada bahasa pemrograman java yang berfungsi untuk mereferensikan atau mengacu ke objek yang sedang aktif. Keyword ini biasanya berhubungan langsung dengan yang namanya overload method pada program Java
Di dalam metode set, untuk mengacu ke variabel kelas yang nilainya akan diubah, Anda perlu menggunakan kata kunci (keyword) this. Bila variabel kelas tersebut dideklarasikan dengan modifier static, maka variabel kelas dapat diakses dengan nama-kelas.variabel-static. Kata kunci this juga dapat digunakan di dalam konstruktor untuk memanggil konstruktor yang lain dari kelas yang sama .
Ada 6 penggunaan this, yaitu :

- dapat digunakan sebagai acuan pada instance variabel dari class
- dapat digunakan untuk memanggil konstruktor class
- dapat digunakan untuk memanggil method class secara implisit
- dapat di pass-kan sebagai sebuah argumen dalam pemanggilan method
- dapat di pass-kan sebagai sebuah argumen dalam pemanggilan konstruktor
- dapat digunakan untuk mengembalikan instance dari class.

 <hr>
 
#### PRAKTIKUM

package Latihan;

public class Nasabah {

    private String namaAwal;
    
    private String namaAkhir;
    
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir) {
    
        this.namaAwal = namaAwal;
        
        this.namaAkhir = namaAkhir;
        
    }
    
    public String getNamaAwal() {
    
        return namaAwal;
        
    }
    
    public String getNamaAkhir() {
    
        return namaAkhir;
        
    }
    
    public Tabungan getTabungan() {
    
        return tabungan;
        
    }
    
    public void setTabungan(Tabungan tabungan) {
    
        this.tabungan = tabungan;
        
    }
    
}

 <hr>
 package Latihan;

public class Tabungan {
    private int saldo;

    public Tabungan (int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    public int simpanUang(int jumlah) {
        return saldo = saldo + jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}
 <hr>
 package Latihan;

public class Tes {
    public static void main(String[] args) {
        int tmp;
        boolean status;

        Nasabah nasabah = new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama "+ nasabah.getNamaAwal()+nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan (5000));
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal : "+tmp);
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan 3000");
        status=nasabah.getTabungan().ambilUang(6000);
        System.out.println("Jumlah uang yang diambil 6000");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan 3500");
        status=nasabah.getTabungan().ambilUang(4000);
        System.out.println("Jumlah uang yang diambil 4000");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        status=nasabah.getTabungan().ambilUang(1600);
        System.out.println("Jumlah uang yang diambil 1600");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan 2000");
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = "+tmp);
    }
}

 <hr>
 
 Hasil RUN :
 
 Nasabah atas nama AgusDaryanto
 
Saldo awal : 5000

Jumlah uang yang disimpan 3000

Jumlah uang yang diambil 6000

 OK
 
Jumlah uang yang disimpan 3500

Jumlah uang yang diambil 4000

 OK
 
Jumlah uang yang diambil 1600

 Gagal
 
Jumlah uang yang disimpan 2000

Saldo sekarang = 3500


Process finished with exit code 0



### Kesimpulan

dari keterangan di atas dapat kita simpulkan bahwa untuk mengelola dan mengakses class kita harus memahami bebrapa konsep seperti : 

- package
- import
- penggunaan kata kunci this. 
  Yang dimana package berguna untuk mengatur class-class yang dibuat sangat banyak sehingga perlu dikelompokkan berdasarkan kategori tertentu. Sedangkan import class berfungsi unyuk memberitahukan kepada program untuk mengacu pada class- class yang terdapat dalam package tertentu serta menjalankan class tersebut. Dan kata kunci this digunakan dalam sebuah kelas untuk menyatakan object sekarang.
