/*
* Nama File : Asersi1.java
* Deskripsi : Program untuk menunjukkan asersi
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 7/03/2025
*/

public class Asersi1 {
    public static void main(String[] args) {
        int x = 10;
        assert x > 0 : "x harus lebih besar dari 0";
        System.out.println("Nilai x: " + x);
    }
}