
# 20104020_Bintang-Ahmada-Farhan-Adama_Pmograman2
### Praktikum Pemrogaman 2

<hr>

LAPORAN MODUL 4
### DASAR PEMROGRAMAN BERIORIENTASI OBJEK
### Disusun Oleh :
### Bintang Ahmada Farhan Adama
### NIM :
### 20104020
### PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK
### FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA
### INSTITUT TEKNOLOGI TELKOM PURWOKERTO
### 2021

<hr>

### Tujuan Praktikum

- Mahasiswa dapat menerapkan konsep enkapsulasi pada class.
- Mahasiswa dapat mendeklarasikan suatu constructor.

### Dasar Teori

> MEMAHAMI ENKAPSULASI
Enkapsulasi mempunyai beberapa nama. Ada yang menyebutnya pembungkusan, ada yang menyebutnya pengkapsulan dan ada pula yang menyebutnya access modifier. Mempunyai berbagai nama tetapi fungsinya adalah sama. Enkapsulasi adalah cara menyembunyikan implementasi detil sebuah class sehingga tidak bisa diakses sembarangan oleh class lainnya. Ada dua hal yang mendasar dari enkapsulasi ini adalah INFORMATION HIDING dan INTERFACE TO ACCESS. Information Hiding adalah proses menyembunyikan data sebuah class sehingga tidak bisa diakses oleh class lain. Biasanya, data yang disembunyikan adalah atribut dari class, sehingga class yang lain tidak dapat mengetahui atribut apa saja yang dimiliki oleh sebuah class. Interface to access adalah cara yang dilakukan sehingga dapat mengakses data yang telah disembunyikan. Maksudnya, yang dapat diakses adalah isi atributnya tanpa mengetahui apa saja atributnya, termasuk nama atributnya. Media yang digunakan pada cara ini biasanya adalah melalui sebuah method.

a. Default (tak ada modifier) :

- Dapat diakses oleh yang sepaket.

- Diwarisi oleh sub class di paket yang sama

- Dapat diakses oleh method-method yang sepaket

b. Public :

- Dapat diakses dimanapun

- Diwarisi oleh sub classnya

- Dapat diakses dimanapun

c. Protected :

- Tidak bisa diterapkan

- Diwarisi oleh sub classnya

- dapat diakses oleh method-method yang sepaket.

d. Private :

- Tidak bisa diterapkan

- Tidak dapat diakses dimanapun kecuali oleh method-method yang ada dalam kelas itu sendiri.

Untuk akses (modifier) Public biasanya digunakan pada method, karena method berperan sebagai Interface to Access. Method sebagai jembatan untuk mengambil data / isi data dari sebuah atribut.
Untuk akses (modifier) Private biasanya digunakan pada atribut, karena berfungsi untuk menyembunyikan data atau Information Hiding.
Untuk akses (modifier) Protected biasanya digunakan pada atribut, sehingga atributsebuah class dapat diakses oleh beberapa class lain. Class lain yang dapat mengakses atribut adalah class yang menjadi turunan dari class tersebut.

> Memahami Constructor
Tipe khusus method yang digunakan untuk menginstansiai atau menciptakan sebuah objek. Nama constructor =namakelas. Constructor tidak bisa mengembalikan nilai, tanpa membuat constructor secara eksplisit-pun, Java akan menambahkan constructor default secara implisit. Tetapi jika kita sudah mendefinisikan minimal sebuah constructor, maka Java tidak akan menambah constructor default. Constructor default tidak punya parameter. Constructor bisa digunakan untuk membangun suatu objek, langsung mengeset atribut-atributnya. Constructor seperti ini harus memiliki parameter masukkan untuk mengeset nilai atribut. Access Modifier constructor selayaknya adalah public, karena constructor akan diakses di luar kelasnya. Cara panggil constructor adalah dengan menambahkan keyword “new”. Keyword new dalam deklarasi ini artinya kita mengalokasikan pada memori sekian blok memori untuk menampung objek yang baru kita buat.

> Memahami Overloading Constructor
Didalam Java, kita dapat membuat dua atau lebih konstruktor/ method yang mempunyai nama sama dalam satu kelas, tetapi jumlah dan tipe argumen dari masing-masing constructor atau method haruslah berbeda satu dengan yang lainnya. Hal ini yang dinamakan overloading.

> PENERAPAN ENKAPSULASI PADA JAVA
Berikut contoh penggunaan enkapsulasi pada program. Pada contoh berikut akses yang digunakan adalah Publicdan Private. Untuk akses protected akan dibahaspada modul berikutnya, karena berkenaan dengan konsep turunan (inheritance).
Contoh
public class main {
public static void main(String[] args) {
Tabungan saya = new Tabungan("Barca",
50410420,1000000,12345);
System.out.println("Nama \t : " +
saya.getNama());
System.out.println("noRekening \t : " +
saya.getnoRekening());
System.out.println("saldo \t : " +
saya.getSaldo());
System.out.println("pin \t : " + saya.getpin());
} }


### Praktikum

 public String getName(){
        return name;
    }
    
    public void setName( String temp ){
        name = temp;
    }

### Analisis Program Latihan
Perhatikan class StudentRecord. Pendeklarasian atribut nama, address, age, mathGrade, englishGrade, scienceGrade, average, studentCount sudah ditambahkan akses private yang berarti method yang digunakan hanya dapat diakses oleh kelas yang memilikinya. Dengan mendeklarasikan data dan method menggunakan akses private, ini berarti data dan method tersebut tidak boleh diakses atau digunakan oleh kelas-kelas lain yang terdapat di dalam program Sebuah variabel atau method yang dideklarasikan private hanya dapat diakses oleh method yang merupakan member dari kelas tersebut. Dan method getName, setName, getAverage, getStudentCount sudah ditambahkan akses public yang artinya class StudentRecord ini sudah mengatur hak akses untuk atribut dan methodnya. Data dan method yang bersifat public dapat diakses oleh semua bagian dalam program. Dengan kata lain, data-data maupun method yang dideklarasikan dengan tingkat akses publik akan dikenali dan diakses oleh semua kelas yang ada di dalam program.
Pada class StudentRecordExample, object wahyu,ini dan Nama hanya dapat mengakses method saja dan tidak dapat mengakses atribut dari class StudentRecord. Method dapat diakses karena diberi akses public dan atribut tidak dapat diakses karena diberi akses private. Makanya hasil output pada hitung hasilnya adalah 0.

### Kesimpulan
Dari modul 4 ini dapat saya simpulkan bahwa Enkapsulasi merupakan suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:

◦ information hiding
◦ Method to access data.

Enkapsulasi dalam melakukan pembungkusan kode dan data dalam java terdapat tingkatan akses data yang perlu diketahui yaitu Tingkat akses private,Tingkat akses protected, Tingkat akses public, Tingkat akses default. Dan Konstruktor merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Tanpa membuat constructor secara eksplisit-pun, Java akan menambahkan constructor default secara implisit. Tetapi jika kita sudah mendefinisikan minimal sebuah constructor, maka Java tidak akan menambah constructor default.
