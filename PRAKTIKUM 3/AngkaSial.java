/*
* Nama File : AngkaSial.java
* Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 7/03/2025
*/

public class AngkaSial {
    public static void main(String[] args) {
        try {
            int angka = 13;
            if (angka == 13) {
                throw new AngkaSialException(); // Melempar eksepsi jika angka adalah 13
            }
            System.out.println("Angka yang dimasukkan: " + angka); // Baris ini tidak akan dieksekusi jika eksepsi terjadi
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage()); // Baris ini akan dieksekusi jika eksepsi terjadi
        } finally {
            System.out.println("Baris ini akan selalu dieksekusi"); // Baris ini akan selalu dieksekusi
        }
    }
}

// 1. Baris 12 pada AngkaSial.java tidak akan dieksekusi ketika eksepsi terjadi.
//    Karena eksepsi terjadi sebelum baris tersebut, dan program langsung melompat ke blok catch.

// 2. Baris 21 pada AngkaSial.java akan selalu dieksekusi, terlepas dari apakah eksepsi terjadi atau tidak.
//    Ini karena blok finally selalu dieksekusi setelah blok try-catch, terlepas dari apakah ada eksepsi atau tidak.