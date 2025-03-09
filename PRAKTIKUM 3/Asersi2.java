/*
* Nama File : Asersi2.java
* Deskripsi : Program untuk demo asersi, yang akan menolak input jari - jari lingkaran yang bernilai nol
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 7/03/2025
*/

public class Asersi2 {
    public static void main(String[] args) {
        double radius = -1.0;
        assert radius > 0 : "Radius harus lebih besar dari 0";
        double keliling = 2 * Math.PI * radius;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}

// Program Asersi2 kurang tepat karena asersi digunakan untuk memeriksa kondisi yang seharusnya selalu benar dalam program.
// Namun, dalam kasus ini, radius yang dimasukkan adalah -1.0, yang jelas tidak valid untuk perhitungan keliling lingkaran.
// Seharusnya, validasi input seperti ini dilakukan menggunakan eksepsi atau pengecekan kondisi biasa, bukan asersi.
// Asersi lebih cocok digunakan untuk debugging dan memastikan kondisi tertentu dalam kode, bukan untuk validasi input.