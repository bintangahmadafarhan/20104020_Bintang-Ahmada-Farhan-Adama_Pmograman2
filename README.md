### 20104020_Bintang-Ahmada-Farhan-Adama_Pmograman2
### Praktikum Pemrogaman 2

### POLIMORFISME

### Disusun oleh : Bintang Ahmada Farhan Adama
### NIM : 20104020

<hr>

PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK
FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA
INSTITUT TEKNOLOGI TELKOM PURWOKERTO
2021

<hr>


> Tujuan Praktikum

- Mahasiswa dapat memahami konsep polimorfisme pemograman.
- Mahasiswa dapat menerapkan konsep polimotfisme pemograman.
- Mahasiswa dapat memahami proses terjadinya Virtual Method Invocation.
- Mahasiswa dapat memahami polymorphic argumen pemograman.
- Mahasiswa dapat menerapkan polymorphic argumen pemograman.
- Mahasiswa dapat memahami penggunaan instanceof dan cara melakukan casting object.


> Dasat Teori

Pemahaman Polimorfisme Dalam Pemograman
Poly artinya banyak, morfisme artinya bentuk.
Polimorfisme (bahasa inggris polymorphism) adalah sebuah prinsip dalam biologi di mana oraganisme atau spesias dapat memiliki banyak bentuk atau tahapan (stages).
Polimorfisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak “bentuk” method yang berbeda-beda meskipun namanya sama. “Bentuk” di sini dapat diartikan : isinya berbeda, parameternya berbeda, dan tipe datanya berbeda. Polimorfisme juga dapat diartikan sebagai teknik programming yang mengarahkan memprogram secara general daripada secara spesifik. Contohnya kita memiliki tiga class yang berbeda yaitu: “Anjing”, “Kucing”, dan “Burung”. Di mana ketiga class tersebut merupakan turunan dari class “Hewan”.
Polimorfisme pada Java ada dua macam:

> Static Polymorphism (Polimorfisme statis).
Merupakan function oveloading (penggunaaan kembali nama fungsi yang sama tapi dengan argumen yang berbeda) yang terbagi dalam 3 signature yaitu:

- Jenis Array
- Letak Array
- Type Array
Dynamic Polymorphism (Polimorfisme dinamis).
Merupakan function overriding (sebuah fungsi dalam class turunan yang memiliki nama, return type argumen function yang sama dengan fungsi dalam class induk) yang menggunakan virtual method.
Beda dari keduanya terletak pada cara membuat polimorfismenya.
Polimorfisme statis menggunakan method overloading sedangkan polimorfisme dinamis menggunakan method overriding.

> Konsep Polimorfisme Dalam Pemograman

Polymorphism sering dikaitkan dengan penggunaan lebih dari satu metoda dengan nama sama. Penggunaan metoda dengan nama sama dapat melalui method overloading dan method overriding. Peran polymorphism tidak terbatas hanya pada hal-hal tersebut. Ada kaitan erat antara polymorphism dan inheritance (turunan).
Dalam konsep turunan Java, saat obyek dari subclass dikonstruksi, obyek dari superclass juga ikut dikonstruksi. Jadi setiap obyek (instance) dari subclass adalah instance dari superclass. Bila kita mendeklarasikan metoda dengan parameter dari tipe superclass, kita dibolehkan memberi argumen berupa obyek dari subclass yang merupakan turunan dari superclass tersebut.
Polimorfism menghindari duplikasi objek, yang dapat menciptakan class baru dari class yang sudah ada. Sehingga, tidak perlu menuliskan code dari nol ataupun mengulanginya. Namun, tetap bisa menambahkan attribute atau method unik dari class itu sendiri. Dalam konsep yang lebih umum sering kali polymorfism disebut dalam istilah satu interface banyak aksi. Selain itu kita juga dapat membuat superclass yang hanya mendefinisikan behavior, namun tidak memberikan implementasi dari metode – metode yang ada. Hal ini dapat berguna jika kita ingin membuat template kelas, kelas ini disebut kelas abstrak karena behaviornya masih abstrak dan belum di implementasikan behavior abstrak tersebut sesuai dengan kebutuhan masing masing.

> Pemahaman Proses Terjadinya Virtual Method Invocation
Virtual method invocation merupakan suatu hal yang sangat penting dalam konsep
polimorfisme.
Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorphisme dan overriding. Pada saat objek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method.

>Pemahaman Polymorphic Arguments Dalam Pemograman

Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Dengan menggunakan Polymorphic Arguments, kita dapat membuat method yang dapat menerima generic object (parent objek) dan tetap dapat bekerja dengan baik menggunakan objek-objek dari kelas keturunannya.
Misalnya employee mempunyai banyak subclass, maka kita harus mendefinisikan semua method yang menangani behavior dari masing-masing subclass. Dengan adanya polymorphic arguments kita cukup mendefinisikan satu method saja yang bisa digunakan untuk menangani behavior semua subclass.

> mahaman Penggunaan Instanceof Dan Cara Melakukan Casting Object
Untuk mengetahui objek yang sebenarnya dari polymorphic arguments, dapat digunakan operator instanceof.
Instanceof adalah salah satu keyword pada Java, yang digunakan untuk membandingkan suatu objek, apakah instansiasi dari suatu class atau tidak, hasil dari perbandingan tersebut akan menghasilkan nilai boolean berupa nilai true atau false.
Instance (obyek) sebuah kelas adalah juga instance (obyek) dari superclass, tetapi tidak merupakan instance dari kelas turunan yang lebih rendah atau kelas yang lebih spesifik.
Ketika obyek sebuah kelas dikonstruksi, maka kelas-kelas di atasnya juga ikut dikonstruksi dengan memanggil kata kunci super, sedangkan kelas-kelas yang lebih bawah tidak ikut dikonstruksi.
Seringkali pemakaian instanceof diikuti dengan casing object dari tipe parameter ke tipe asal. Tanpa adanya casting objek, maka nilai yang akn kita pakai setelah proses intanceof masih bertipe parent class-nya, sehingga ia perlu dipakai maka ia harus di casting dulu ke tipe subclassnya. Casting objek artinya adalah satu tipe referensi objek dapat menjadi tipe casting pada referensi objek lainnya.
Casting objek ini terdiri dari:

- casting
Upcasting objek adalah casting dari subtype ke supertype atau dari suatu objek subclass ke superclass. Atau bisa dikatakan menuju ke arah atas dari rantai inheritance.
- wncasting
Kebalikan dari upcasting, downcasting merupakan casting ke subtype, ke arah bawah dari rantai inheritance.

Syarat konversi atau casting tipe kelas adalah harus berada di dalam hierarki turunan (inheritance hierarchy). Sebagai contoh di dalam hierarki turunan Object - BangunDatar - PersegiPanjang - Balok, kelas Object adalah superclass dari BangunDatar, kelas BangunDatar adalah superclass dari PersegiPanjang dan kelas PersegiPanjang adalah superclass dari Balok. Kelas Object mempunyai sifat paling umum sedangkan kelas Balok mempunyai sifat paling spesifik.

*nalisis Percobaan*

Masing-masing kelas turunan mendeklarasi ulang metoda dengan implementasi yang berbeda. Setelah itu class ini menggunakan casting objek sehingga acuan ke objek yang dibuat dari kelas pegawai dan gaji.
Dari program ini, bila paramater sebuah metoda adalah dari tipe superclass, maka argumen metoda yang diberikan dapat berupa tipe subclass. Maka ini merupakan konsep polymorphism, lalu menggunakan operator instaceof untuk mengetahui objek yang sebenarnya dari polymorphics arguments.

> Kesimpulan
Dapat kita simpulakn bahwa Polimorfisme merupakan bagian dari teknik OOP, dimana sebuah class dapat memiliki method yang sama, namun bodynya berbeda-berbeda. Polymorphism menyediakan menyediakan multiobject dari sub class yang berbeda diperlakukan sebagai object tunggal dari super class.
