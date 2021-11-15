LAPORAN MODUL 6

KONSEP INHERITANCE

Disusun Oleh :

BINTANG AHMADA FARHAN ADAMA

NIM :

20104020

### PROGRAM STUDI S1 REKAYASA PERANGKAT LUNAK FAKULTAS TEKNOLOGI INDUSTRI DAN INFORMATIKA INSTITUT TEKNOLOGI TELKOM PURWOKERTO 2021

### Tujuan Praktikum

- Mahasiswa dapat memahami konsep inheritance dalam pemograman.
- Mahasiswa bisa menerapkan konsep inheritance dalam pemograman.
- Mahasiswa dapat mengontrol akses pada pengkodean.
- Mahasiswa mampu memahami pengaksesan member pada parent class.
- Mahasiswa bisa menggunakan kata kunci super
- Mahasiswa dapat menghindari kesalahan pada pewarisan konstruktor.

### Dasar Teori

- Memahami Inheritance
  Inheritance atau Pewarisan/Penurunan adalah konsep pemrograman dimana sebuah class dapat ‘menurunkan’ property dan method yang dimilikinya kepada class lain. Konsep inheritance digunakan untuk memanfaatkan fitur ‘code reuse’ untuk menghindari duplikasi kode program.
Konsep inheritance membuat sebuah struktur atau ‘hierarchy’ class dalam kode program. Class yang akan ‘diturunkan’ bisa disebut sebagai class induk (parent class), super class, atau base class. Sedangkan class yang ‘menerima penurunan’ bisa disebut sebagai class anak (child class), sub class, derived class atauheir class.
Tidak semua property dan method dari class induk akan diturunkan. Property dan method dengan hak akses private, tidak akan diturunkan kepada class anak. Hanya property dan method dengan hak akses protected dan public saja yang bisa diakses dari class anak.
Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class.
Karena suatu subclass dapat mewarisi apa apa yang dipunyai oleh parent class-nya, maka member dari suatu subclass adalah terdiri dari apa-apa yang ia punyai dan juga apa-apa yang ia warisi dari class parent-nya.
Dari hirarki diatas dapat dilihat bahwa, semakin kebawah, class akan semakin bersifat spesifik. Class mamalia memiliki seluruh sifat yang dimiliki oleh binatang, demikian halnya juga macan , kucing, Paus dan Monyet memiliki seluruh sifat yang diturunkan dari class mamalia.
Dengan konsep ini, karakteristik yang dimiliki oleh class binatang cukup didefinisikan didefinisikan dalam class binatang saja.
Class mamalia tidak perlu mendefinisikan ulang apa yang telah dimiliki oleh class binatang, karena sebagai class turunannya, ia akan mendapatkan karakteristik dari class binatang secara otomatis. Demikian juga dengan class macan, kucing, Paus dan monyet, hanya perlu mendefinisikan karakteristik yang spesifik dimiliki oleh class-nya masing-masing.

- Menerapkan Konsep Inheritance

Deklarasi Inheritance
Dengan menambahkan kata kunci Dengan menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent kemudian diikuti dengan nama parent class-nya. Kata kunci extends tersebut memberitahu Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class perluasan class.
public class B extends A {
…
}
Semua class di dalam Java adalah subclass dari class super induk yang bernama Object. Pada saat dikompilasi, Kompiler Java
akan membacanya sebagai subclass dari class Object, misalnya :
public class A extends Object {
…
}

### Memahami Pengaksesan Member Pada Parent Class
Pengaksesan member yang ada di parent class Pengaksesan member yang ada di parent class dari subclass-nya tidak berbeda dengan pengaksesan member subclass itu sendiri. Misalnya di class Animal kita ingin mengakses member data nama melalui sebuah function member Animal(), sekaligus kita juga ingin mengakses data member age di class Animal.
_public class Animal {
public String name ="Unnamed Animal";
public int age;

public Animal() {
}

public Animal(String name) {
    this.name =name;
}
public Animal(String name, int age) {
    this.name = name;
    this.age = age;
}_

### Penggunaan Dalam Kata Kunci Super
Kata kunci super dipakai untuk merujuk pada member dari parent class. Sebagaimana kata kunci this yang dipakai untuk
merujuk pada member dari class itu sendiri. merujuk pada member dari class itu sendiri.
Format penulisannya adalah sebagai berikut :

- super.data_member
merujuk pada data member pada parent class merujuk pada data member pada parent class.

- super.function_member()
merujuk pada function member pada parent class.

- super()
merujuk pada konstruktor pada parent class.

Dapat kita simpulkan bahwa :

- x
merujuk pada x terdekat, yaitu parameter info()

- this x.
merujuk pada data member dari class-nya sendiri,y p aitu data member pada class Child.

- super.x
merujuk pada data member dari parent class-nya yaitu data member pada class Parent.

### Menghindari Kesalahan pada pewarisan konstruktor
Konstruktor dari parent class tidak dapat Konstruktor dari parent class tidak dapat diwariskan ke subclass-nya. Konsekuensinya, setiap kali kita membuat suatu subclass, maka kita harus memanggil konstruktor parent class di konstruktor subclass. Pemanggilan konstruktor parent harus dilakukan pada baris pertama dari konstruktor sublcass. Jika kita tidak mendeklarasikannya secara Jika kita tidak mendeklarasikannya secara eksplisit, maka kompiler Java akan menambahkan deklarasi pemanggilan menambahkan deklarasi pemanggilan konstruktor parent class di konstruktor subclass. Sebelum subclass menjalankan konstruktornya Sebelum subclass menjalankan konstruktornya sendiri, subclass akan menjalankan constructor superclass terlebih dahulu. Hal ini terjadi karena secara implisit pada constructor subclass ditambahkan pemanggilan super()yang bertujuan memanggil constructor superclass oleh kompiler. Pada saat program tersebut dikompilasi Pada saat program tersebut dikompilasi, maka kompiler Java akan menambahkan :

- konstruktor class Parent konstruktor class Parent
- konstruktor class Child
- pemanggilan konstruktor class Parent di pemanggilan konstruktor class Parent dikostruktor class Child.

### Kesimpulan
  Dari modul 6 ini dapat kita simpulkan bahwa Suatu class  yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dap p at mewarisi apa-apa yang dipunyai oleh parent class. Karena suatu subclass dapat mewarisi apa Karena suatu subclass dapat mewarisi apa yang dipunyai oleh parent class-nya, maka member dari suatu subclass adalah terdiri dari apa yang ia punyai dan juga apa yang ia warisi dari class parent-nya. Suatu subclass adalah tidak lain hanya memperluas atau (extend) parent class (extend) parent class-nya.
