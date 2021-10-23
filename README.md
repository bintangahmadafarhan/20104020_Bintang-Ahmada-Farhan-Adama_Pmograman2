# 20104020_Bintang-Ahmada-Farhan-Adama_Pmograman2
### Praktikum Pemrogaman 2

<hr>

### Daftar isi :
1. [Modul0 : Dasar Pemrogaman Java]()
2. [Modul2 : Dasar Pemrogaman java]()
3. [Modul3 : Pengenalan Pemrogaman Berorientasi Objek]()


# LPORAN MODUL 3

<hr>

### PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK
disusun oleh :
Bintang Ahmada Farhan Adama
NIM:
20104020

### PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK
FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA
INSTITUT TEKNOLOGI TELKOM PURWOKERTO 2021

###Tujuan Praktikum

Mahasiswa dapat mengenal program berorientasi objek.
Mahasiswa dapat mendeklarasikan suatu class.
Mahasiswa dapat mendeklarasikan suatu atribut.
Mahasiswa dapat mendeklarasikan suatu metode.
Mahasiswa dapat mengakses anggota suatu objek.

###Dasar Teori
*2.1 Pengertian Pemograman Berorientasi Objek. *
Pemrograman berorientasi objek (Inggris: object-oriented programming disingkat OOP) merupakan paradigma pemrograman yang berorientasikan kepada objek. Seluruh data dan fungsi di dalam paradigma ini dibungkus dalam kelas-kelas atau objek-objek. Bandingkan dengan logika pemrograman terstruktur. Setiap objek dapat menerima pesan, memproses data, dan mengirim pesan ke objek lainnya.
Model data berpandangan objek dituturkan dapat memberi fleksibilitas yang semakin, kemudahan mengubah program, dan dipergunakan lapang dalam teknik piranti lunak skala besar. Semakin jauh lagi, pendukung OOP mengklaim bahwa OOP semakin gampang dipelajari untuk pemula dibanding dengan pendekatan sebelumnya, dan pendekatan OOP semakin gampang dikembangkan dan dirawat.

*2.2 Class *
Class merupakan cetak biru (blue print) dari objek atau dengan kata lain sebuah Class menggambarkan ciri-ciri objek secara umum. Sebagai contoh Suzuki Smash, Yamaha VegaR, Honda SupraFit, dan Kawasaki KazeR merupakan objek dari Class sepeda motor. 

*2.3 Object*
Objek (Object) merupakan segala sesuatu yang ada di dunia ini, yaitu manusia, hewan, tumbuhan, rumah, kendaraan, dan lain sebagainya. Contoh-contoh objek yang telah disebutkan diatas merupakan contoh objek nyata pada kehidupan kita. Pada pemrograman berorientasi objek, kita akan belajar bagaimana membawa konsep objek dalam kehidupan nyata menjadi objek dalam dunia pemrograman. Setiap objek dalam dunia nyata pasti memiliki 2 elemen penyusunnya, yaitu keadaan (state) dan perilaku/sifat (behaviour). Sebagai contoh, sepeda memiliki keadaan yaitu warna, merk, jumlah roda, ukuran roda. Dan perilaku/sifat sepeda adalah berjalan, berhenti, belok, menambah kecepatan, mengerem.
Pada saat objek diterjemahkan ke dalam konsep PBO, maka elemen penyusunnya juga terdiri
atas 2 bagian, yaitu :

Atribut, merupakan ciri-ciri yang melekat pada suatu objek (state).
Method, merupakan fungsi-fungsi yang digunakan untuk memanipulasi nilai-nilai pada atribut atau untuk melakukan hal-hal yang dapat dilakukan suatu objek (behaviour).
Objek dalam konsep PBO memiliki keadaan dan perilaku yang sama seperti halnya objek di dunia nyata, karena objek dalam konsep PBO merupakan representasi objek dari dunia nyata. Objek dalam PBO merepresentasikan keadaan melalui variabel-variabel (Atribut), sedangkan perilakunya direpresentasikan dengan method (yang merupakan suatu fungsi yang berhubungan dengan perilaku objek tersebut maupun berhubungan dengan atribut dari objek tersebut). Objek yang memiliki kesamaan atribut dan method dapat dikelompokkan menjadi sebuah Class. Dan objek-objek yang dibuat dari suatu class itulah yang disebut dengan Instant of class. Untuk menginstansi (membuat) objek dari class, gunakan operator new.
Sintaks membuat objek dari suatu class : namaClass namaObjek = new namaClass()

*2.3 Enkapsulasi *
Enkapsulasi (encapsulation) merupakan cara untuk melindungi property (atribut) / method tertentu dari sebuah kelas agar tidak sembarangan diakses dan dimodifikasi oleh suatu bagian program. Cara untuk melindungi data yaitu dengan menggunakan access modifiers (hak akses). Ada 4 hak akses yang tersedia, yaitu default, public, protected, private.

> Default (tidak ada modifier).
Dapat diakses oleh yang sepaket ,diwarisi oleh subkelas dipaket yang sama, dapat diakses oleh methodmethod yang sepaket.

> Public
Dapat diakses dimanapun Diwarisi oleh subkelasnya, dapat diakses dimanapun.

> Protected
Tidak bisa diterapkan Diwarisi oleh subkelasnya, dapat diakses oleh method-method yang sepaket.

> Private
Tidak bisa diterapkan Tidak dapat dikases dimanapun kecuali oleh method-method yang ada dalam kelas itu sendiri.

<hr>

### Praktikum

Soal :

1. Mengimplementasikan UML class diagram dalam program untuk 
class Tabungan

Jawab:

1. Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000


### kesimpulan

Dari Modul 3 ini, dapat  simpulkan bahwa Pemograman berorientasi objek bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang dibungkus ke dalam objek ataupun class. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program. Dengan demikian, tidak akan ada lagi kode yang berantakan, Semua akan kita bungkus dalam objek. Jika pemograman sudah semakin kompleks, maka sangat disarankan untuk menggunakan Pemograman Berorientasi Objek.

