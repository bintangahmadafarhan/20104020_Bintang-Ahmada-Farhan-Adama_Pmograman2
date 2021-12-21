### 20104020_Bintang-Ahmada-Farhan-Adama_Pmograman2
### Praktikum Pemrogaman 2

### Disusun oleh : Bintang Ahmada Farhan Adama
### NIM : 20104020
LAPORAN MODUL 9
EXCEPTION
<hr>

PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK
FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA
INSTITUT TEKNOLOGI TELKOM PURWOKERTO
2021

> Tujuan Praktikum

- Mahasiswa dapat memahami exception.
- Mahasiswa diharapkan dapat memahami tipe exception yaitu Checked Exception dan Unchecked Exception.
- Mahasiswa diharapkan dapat menangani exception menggunakan try, catch, finally, throw dan throws.

> Dasar Teori

| Pengertian Exception
Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut.
Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi.
Beberapa exception yang sering terjadi pada Bahasa pemrograman Java di antaranya:

- Arithmetic Exception
Untuk perhitungan aritmatika, misalkan sebuah angka dibagi 0.
- Null Pointer Exception
Bila object yang ingin dia kses masih NULL, maka tidak bisa akses method dari object tersebut.
- Number Format Exception
Bila ingin melakukan casting tipe data string ke int maka akan terjadi kesalahan ini.
- IO Exception
Bila yang diminta adalah angka, tapi diinputkan berupa String.

| Suatu program apabila mengalami kesalahan akan menghasilkan suatu runtime errors seperti gagal membuka file, suatu program melakukan akses diatas rangearray dan lain-lain. ketika runtime errors tersebut terjadi, aplikasi akan membuat suatu exception.
Jenis – jenis Exception:
Exception class merupakan kesalahan yang disebabkan oleh program dan kesalahan external. Kesalahan jenis ini dapat ditangkap dan diatasi oleh program. Exception terdiri dari banyak subclass.
Error class merupakan class yang berhubungan dengan kesalahan padainternal system. Jika terjadi kesalahan jenis ini maka hanya dapat dilakukan bagaimana memberitahu kepada pemakai dan melakukan pengakhiran program.

> Tipe Exception
| Checked exceptions merupakan exception yang diketahui pada saat compile time. Namun, ada juga exceptions yang dicek pada saat compile time, oleh karena itu mereka disebut dengan compile time exceptions.
Compile time error akan terjadi bila exceptions ini tidak ditangani dengan menggunakan blok try-catch atau dengan menggunakan keyword throws. Semua subclass dari java.lang.Exception kecuali subclass dari RunTimeException adalah checked exceptions.
Unchecked exception merupakan exception yang terjadi pada saat runtime. 

| Pada saat compile time semuanya akan berjalan normal, namun ketika runtime maka akan terlempar exception ini. Oleh sebab itulah uncheked exceptions disebut juga dengan runtime exceptions.
Semua subclass dari class Error dan RuntimeException adalah unchecked exceptions.
Compile time error tidak akan terjadi jika ada pernyataan dalam program yang melemparkan unchecked exception ini. meskipun anda tidak menanganinya dengan blok try-catch atau keyword throws. Bagaimanapun, program akan gagal ketika dijalankan walaupun akan sukses pada saat di compile.
jadi Oleh karena itu, untuk mencegah program diberhentikan secara prematur ketika program Java anda dijalankan, maka anda harus menangani exception ini dengan baik.

> Menangani Exception

- Try
Keyword ini biasanya digunakan dalam suatu block program. keyword ini digunakan untuk mencoba menjalankan block program kemudian mengenai dimana munculnya kesalahan yang ingin diproses. Keyword ini juga harus dipasangkan dengan keyword catch atau keyword finally yang akan dibahas pada point kedua dan ketiga.

- Catch
Keyword catch harus dipasangkan dengan try. Kegunaan keyword ini adalah menangkap kesalahan atau bug yang terjadi dalam block try. Setelah menangkap kesalahan yang terjadi maka developer dapat melakukan hal apapun pada block catch sesuai keinginan developer.

- Finally
Keyword ini merupakan keyword yang menunjukan bahwa block program tersebut akan selalu dieksekusi meskipun adanya kesalahan yang muncul atau pun tidak ada. Atau mengeksekusi bagian code yang penting dari program, bagian ini tetap dikerjakan baik secara pengecualian (exception) maupun tidak.

- Throw
Keyword ini digunakan untuk melemparkan suatu bug yang dibuat secara manual, dimana throw digunakan dalam body code yang ada.

- Throws
Keyword throws digunakan dalam suatu method atau kelas yang mungkin menghasilkan suatu kesalahan sehingga perlu ditangkap errornya. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws.

> Analisis Code Program Latihan
| Program latihan ini telah mendefinisikan suatu kelas B extends dari kelas Exception. Ketika melakukan throw new B(); maka object dari kelas bertipe B ini akan dianggap kesalahan dan ditangkap oleh block catch yang menentukan jenis exception yang ingin ditangani. Keyword throws digunakan dalam suatu method atau kelas yang mungkin menghasilkan suatu kesalahan sehingga perlu ditangkap error-nya karena checked exception. Cara mendefinisikannya dalam method adalah sebagai berikut : type method-name throws exception-list1, exception-list2, … {}. 
Perhatikan contoh penggunaan keyword throws pada method. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws. Ketika method tersebut dipanggil dalam block try. Maka method tersebut akan membuat object yang merupakan subclass dari class Throwable dan method tersebut akan melemparkan kesalahan yang ada dalam block method kedalam block try. Di dalam block try, kesalahan tersebut kemudian ditangkap kedalam block catch.

> Kesimpulan

| Dari modul ini dapat kita simpulkan bahwa Exception sendiri merupakan sebuah event yang akan menginterupsi program yang tidak berjalan normal / error, lebih mudahnya error handling merupakan penanganan error. Tidak semua penanganan error ditangani dengan exception, namun dapat mempermudah penanganan error. Pada exception, superclass tertinggi adalah class Throwable. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception.
