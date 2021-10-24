### Modul 2 : Dasar Pemrogaman Java

<hr>

# Disusun oleh : Bintang Ahmada Farhan Adama

# NIM          : 20104020

<hr>


<hr>


### Tujuan Praktikum

1. Mahasiswa mengetahui aturan penamaan pada identifier.
2. Mahasiswa dapat mengenal kata-kata kunci dan tipe-tipe dasar yang ada di Java.
3. Mahasiswa mengetahui tipe-tipe dasar yang ada pada Java.
4. Mahasiswa mengetahui penggunaan variable pada java.

**Dasar Teori**
Penamaan identifier harus diawali dengan karakter unicode, tanda $ (dollar) atau tanda _ (underscore). Penamaan identifier ini bersifat casesensitive dan tidak dibatasi panjang maksimum jadi penulisan penamaan tersebut harus benar-benar benar diperhatikan. Kebanyakan pemula sering mendapatkan error hanya karena masalah penulisan identifiers. Tapi sebenarnya tatacara penulisannya juga mudah dimengerti. Aturan ini memiliki tujuan :

- Menghindari kemungkinan error
- Membuat program menjadi lebih mudah dibaca
- Membuat keseragaman tata cara coding Java.
 Tips untuk penamaan identifers ini adalah :
Gunakan kata yang bersifat deskriptif atau menjelaskan secara langsung dan mudah terhadap variabel, method, constants, dan class dalam program.
Untuk package gunakan huruf kecil, seperti java, lang, util, sql dan sebagainya. Dan untuk class dimulai dengan huruf kapital, dan berupa kata benda.
Ada dua tipe data dalam Java :
- Tipe Data Primitif
- Tipe Data Referensi/ Objek
- Tipe Data Primitif
Terdapat delapan tipe data primitif yang didukung dalam Java, tipe data primitif didefinisikan oleh bahasa dan diberi nama dengan sebutan kata kunci, berikut ini tipe data primitif dalam Java.

    -Byte-

- Tipe Data Byte merupakan integer 8 bit yang bersifat signed
- Nilai Minimum adalah -128
- Nilai Maximum adalah 127
- NIlai default adalah 0
- Tipe dan data digunakan untuk menghemat ruang pada array yang besar
- Contoh byte a = 100, byte b = -50

    -Short-

- Tipe data short merupakan integer 16 bit yang bersifat signed
- Nilai minimum adalah -32,768
- Nilai Maximum adalah 32,767
- NIlai default adalah 0
- Tipe data short juga dapat menghemat ruang seperti pada tipe data byte
- Contoh short s = 1000, short r = -2000.

     -Int-

- Tipe data short merupakan integer 32 bit yang bersifat signed
- Nilai minimum adalah -2,147,483,648
- Nilai Maximum adalah 21,147,483,467
- NIlai default adalah 0
- Tipe data int digunakan secara umum untuk menampung nilai – nilai integral
- Contoh int a = 100000, int b = 200000

     -Long-

- Tipe data long merupakan integer 64 bit yang bersifat signed
- Nilai minimum adalah -9,223,372,036,854,775,808
- Nilai Maximum adalah 9,223,372,036,854,775,807
- NIlai default adalah 0L
- Tipe data long digunakan untuk menampung nilai – nilai dengan jangkauan nilai yang lebih dari tipe data int.
- Contoh int a = 100000L, int b = -200000L

     -Float-

- Tipe data float merupakan nilai deimal 32 bit presisi tunggal
- Float biasanya digunakan untuk menghemat ruang pada array besar yang berisi nilai – nilai desimal
- NIlai default adalah 0L
- Tipe data float tidak pernah digunakan untuk nilai – nilai seperti mata uang.
- Contoh float f1 = 234.5f

     -Double-

- Tipe data double merupaka nilai desimal 64 bit persisi ganda
- doubel biasanya digunakan sebagai tipe data default untuk nilai desimal
- Nilai Maximum adalah 9,223,372,036,854,775,807
- NIlai default adalah 0.0d
- Tipe data tidak pernah digunakan untuk nilai – nilai persisi seperti nilai mata uang
- Contoh double d1 = 123.4

     -Boolean-

- Tipe data boolean mempersentasikan satu bit informasi
- Hanya ada dua nilai yang mungkin : true (benar) dan flash (salah)
- Tipe data ini digunakan sebagai penanda kondisi benar/ salah
- Nilai default adala false
- Contoh boolean satu = true

     -Char-

- Tipe data char merupakan nilai karakter Unicode 16 bit tunggal
- Nilai minimum adalah “\u0000
- Nilai Maximum adalah “\uffff
- Tipe data char digunakan untuk menampung karakter apa saja
- Contoh char huruf A= ‘A’.

>Tipe Data Referensi
Variabel referensi dibuat dengan menggunakan konstruktor yang didefinisikan dalam kelas, variabel ini digunakan untuk mengakses objek – objek, variabel ini di deklarasikan sebagai tipe tertentu yang tidak dapat diubah. 

>Variabel
Variabel adalah item yang digunakan data untuk menyimpan pernyataan objek. Variabel memiliki tipe data dan nama. Tipe data menandakan tipe nilai yang dapat dibentuk oleh variabel itu sendiri. 

<hr>

###Praktikum

Soal :
1. Menaganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B + C 

Jawaban :
1. long p = 2147483648L;

Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long.

Hasil Running

-2147483648

Process finished with exit code 0

2. anx = anx - i;

Anak ayam akan selalu di dikurang 1 sampai habis \ 0

contoh hasil running :
Masukkan jumlah anak ayam : 5
Anak ayam turun5
Mati 1 tinggal4
Anak ayam turun4
Mati 1 tinggal3
Anak ayam turun3
Mati 1 tinggal2
Anak ayam turun2
Mati 1 tinggal1
Anak ayam turun 1 tinggal induknya

Process finished with exit code 0

3.  int a,b,c;

A akan di tambah dengan B dan akan dikurangi dengan c

contoh running program :

Masukan Nilai a = 3
Masukan Nilai b = 4
Masukan Nilai c = 5
Hasil dari A+B-C adalah = 2

Process finished with exit code 0

### Kesimpulan

Jadi Pada praktikum modul 2 ini dapat saya simpulkan bahwa,Java memilikki penamaan identifier yg bersifat case sensitive dan tidak dibatasi panjang maximum. Java memilikki keyword yang telah dipesan untuk didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Selain kata kunci, Java juga mempunyai 3 kata literal, yaitu true, false dan true, yang juga tidak bisa dipakai untuk penamaan identifier. Java juga mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, long, float, dan double.
