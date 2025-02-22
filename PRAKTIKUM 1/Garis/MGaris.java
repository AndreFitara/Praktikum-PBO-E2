/*
* Nama File : MGaris.java
* Deskripsi : Program utama untuk menguji kelas Garis
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 21/02/2025
*/

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis dengan konstruktor tanpa parameter
        Garis garis1 = new Garis();
        garis1.display();
        System.out.println("Panjang Garis 1: " + garis1.getPanjang());
        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());

        // Membuat objek garis dengan konstruktor dengan parameter
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis garis2 = new Garis(t1, t2);
        garis2.display();
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());
        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());

        // Menambahkan titik baru dan memeriksa apakah garis sejajar
        Titik t3 = new Titik(-1, 5);
        Titik t4 = new Titik(1, 9);
        Garis garis3 = new Garis(t3, t4);

        System.out.println("Garis 2 dan Garis 3 Sejajar? " + garis2.isSejajar(garis3));
    }
}