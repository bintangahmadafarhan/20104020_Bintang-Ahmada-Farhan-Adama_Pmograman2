### LAPORAN MODUL 7

### OVERLOADING DAN OVERRIDING

### Disusun oleh : Bintang Ahmada Farhan Adama

### NIM : 20104020

### LAPORAN MODUL 7

### PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK
### FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA
### INSTITUT TEKNOLOGI TELKOM PURWOKERTO 2021

### Praktikum

- Mahasiswa dapat memahami tentang overloading.
- Mahasisswa dapat memahami tentang overriding.
- Mahasiswa dapat memahami aturan tentang overridden.

### Dasar Teori

- Overloading
  Overloading adalah method dengan nama yang sama dengan method lain pada suatu class tetapi dengan parameter yang berbeda. Tujuan dibuatnya overloading yaitu memudahkan penggunaan method dengan fungsi yang hampir sama. Baik, langsung saja kita lihat bagaimana implementasi overloading pada program java. Dalam method overloading, jumlah dan tipe parameter (termasuk urutannya) atau disebut dengan istilah method signature mengalami perubahan.Method overloading dapat dilakukan pada class yang sama, Method overloading pada Java terikat oleh static binding . Method overloading terjadi pada saat compile time.
  
> Ciri-ciri overloading :

- Nama method harus sama
- Daftar parameter harus berbeda
- Return type boleh sama, boleh berbeda.

> Overriding

  Overriding adalah sebuah fungsi atau mathod dari superclass (kelas induk) yang ditulis kembali pada subclassnya (kelas anak), ada beberapa aturan pada fungsi Overriding yang perlu diketahui:
Parameter pada fungsi atau mothod overriding di subclass/kelas anak harus sama dengan parameter yang terdapat pada superclass/kelas induk.
Aturan hak akses pada fungsi overriding di subclass tidak boleh lebih ketat di bandingkan dengan hak akses method atau fungsi pada class induk.

Ciri- ciri overrding :
- Nama method harus sama.
- Daftar parameter harus sama.
- Return type harus sama.
- Method yang terkena override tidak boleh mempunyai modifier yang lebih luas aksesnya daripada method meng-override.

> Aturan Tentang Overriden

  Daftar argument harus persis sama seperti pada method yang di override.
Tipe balikan harus sama atau merupakan subtipe dari tipe balikan yang dideklarasi dalam method asli pada superkelas.
Level akses tidak boleh lebih terbatas dari method yang di override.
Method instance dapat di ovrride hanya jika method tersebut diwarisi oleh subkelas.
Method yang dideklarasikan dinal tidak bisa di override.
Konstruktor tidak bisa di override.
untuk menggunakan method versi superkelas dari method yang di override, dapat menggunakan kata kunci super.

package Modul7.Percobaan;

public class Overload {
    void myOverload(A a){
        System.out.println("OVERLOAD.MyOverload (A a)");
    }

    void myOverload(B b){
        System.out.println("OVERLOAD.MyOverload (B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
    

### Kesimpulan

  Jadi dapat kita simpulkan bahwa sebuah Method overloading ini berada dalam sebuah class yang sama atau bisa juga berada dalam class yang lain yang terkait dalam hirarki inheritance. sedangkan Method overriding artinya memberikan implementasi yang baru dari suatu method pada subclass, jadi method ini berada pada class yang berbeda yang terkait dalam inheritance.
