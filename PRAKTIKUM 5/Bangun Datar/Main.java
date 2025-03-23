/*
* Nama File : Main.java
* Deskripsi : Kelas utama yang menguji objek Persegi dan Lingkaran dengan berbagai metode.
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

public class Main {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10);
        BangunDatar L1 = new Lingkaran(7);

        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());

        // Menggunakan method isEqualLuas dan isEqualKeliling
        BangunDatar P2 = new Persegi(5);
        BangunDatar L2 = new Lingkaran(7);

        System.out.println("Apakah luas P1 sama dengan L1? " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling P1 sama dengan L1? " + P1.isEqualKeliling(L1));

        // Menggunakan method zoomIn, zoomOut, dan zoom
        Persegi persegi = new Persegi(10);
        Lingkaran lingkaran = new Lingkaran(7);

        persegi.zoomIn();
        lingkaran.zoomOut();

        System.out.println("Luas Persegi setelah zoomIn: " + persegi.getLuas());
        System.out.println("Luas Lingkaran setelah zoomOut: " + lingkaran.getLuas());
    }
}