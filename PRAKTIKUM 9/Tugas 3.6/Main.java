/**
* Nama File : Main.java
* Deskripsi : Program utama untuk simulasi koleksi anabul
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Main {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();

        // Menambahkan 10 anabul acak
        koleksi.tambah(new Kucing("Kitty"));
        koleksi.tambah(new Anjing("Doggo"));
        koleksi.tambah(new Burung("Birdy"));
        koleksi.tambah(new Kucing("Mimi"));
        koleksi.tambah(new Anjing("Bruno"));
        koleksi.tambah(new Burung("Rio"));
        koleksi.tambah(new Kucing("Luna"));
        koleksi.tambah(new Anjing("Spike"));
        koleksi.tambah(new Burung("Niko"));
        koleksi.tambah(new Kucing("Oyen"));

        // Menampilkan semua data
        koleksi.showAll();
    }
}
