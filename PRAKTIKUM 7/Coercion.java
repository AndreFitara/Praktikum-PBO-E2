/*
* Nama File : Coercion.java
* Deskripsi : Program contoh penggunaan coercion dan casting tipe data di Java
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Coercion {
    public static void main(String[] args) {
        // Program nomor 1
        int output1 = 'a'; 
        System.out.println("Output 1: " + output1); 
        // (output): 97 (berhasil)
        // Penjelasan: Berhasil. Karakter 'a' otomatis dikonversi ke nilai ASCII 97 menggunakan coercion implisit.

        // Program nomor 2
        double x = 15.5;
        // int output2 = x; // Ini akan error tanpa casting
        int output2 = (int) x; 
        System.out.println("Output 2: " + output2); 
        // (output): 15 (berhasil setelah casting manual)
        // Penjelasan: Gagal tanpa casting. Karena double ke int tidak bisa implicit coercion, perlu explicit casting (harus pakai (int)).

        // Program nomor 3
        int y = 25;
        double output3 = y; 
        System.out.println("Output 3: " + output3); 
        // (output): 25.0 (berhasil)
        // Penjelasan: Berhasil. Tipe int bisa langsung menjadi double secara otomatis (coercion implisit).

        // Program nomor 4
        int z = 78;
        char output4 = (char) z; 
        System.out.println("Output 4: " + output4); 
        // (output): 'N' (berhasil)
        // Penjelasan: Berhasil. Perlu casting manual (explicit) dari int ke char, sehingga angka 78 dikonversi ke karakter 'N' (ASCII 78).

        // Program nomor 5
        char a = 'a';
        double output5 = a; 
        System.out.println("Output 5: " + output5); 
        // (output): 97.0 (berhasil)
        // Penjelasan: Berhasil. Char otomatis dikonversi menjadi nilai ASCII, lalu menjadi double (coercion implisit).
    }
}
