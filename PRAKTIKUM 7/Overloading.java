/*
* Nama File : Overloading.java
* Deskripsi : Program contoh penggunaan method overloading dalam Java
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Overloading {
    
    // Method overloading: beda parameter
    public void printInfo(int number) {
        System.out.println("Angka: " + number);
    }

    public void printInfo(String text) {
        System.out.println("Teks: " + text);
    }

    public void printInfo(double decimal) {
        System.out.println("Desimal: " + decimal);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        
        overloading.printInfo(10);         // Angka
        overloading.printInfo("Hello");    // Teks
        overloading.printInfo(3.14);        // Desimal
    }
}
