/*
* Nama File : Main.java
* Deskripsi : Kelas utama untuk menguji implementasi kelas-kelas
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        System.out.println("Informasi Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7, "Biru", "Putih");
        System.out.println("\nInformasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

        // Mencetak jumlah objek BangunDatar
        BangunDatar.printCounterBangunDatar();
    }
}