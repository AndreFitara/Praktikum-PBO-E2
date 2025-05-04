/*
* Nama File : MainMetodeGenerik.java
* Deskripsi : Program untuk mendemonstrasikan penggunaan metode generik dengan objek turunan dari kelas Anabul
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

class ContohMetodeGenerik {
    // Metode generik untuk menampilkan isi Datum
    public static <T> void tampilkanIsiDatum(Datum<T> datum) {
        T isi = datum.getIsi();
        System.out.println("Isi Datum: " + isi);
    }

    // Metode generik untuk mensimulasikan perilaku Anabul dari Datum
    public static <T extends Anabul> void simulasiPerilaku(Datum<T> datum) {
        T hewan = datum.getIsi();
        System.out.println("Simulasi perilaku:");
        hewan.bersuara();
        hewan.bergerak();
        System.out.println();
    }
}

// Program utama untuk menguji ContohMetodeGenerik
public class MainMetodeGenerik {
    public static void main(String[] args) {
        // Membuat objek hewan
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        Burung burung = new Burung();

        // Membuat objek Datum dengan berbagai tipe
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(kucing);
        
        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(anjing);
        
        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(burung);

        // Menggunakan metode generik dari ContohMetodeGenerik
        System.out.println("Menggunakan metode generik:");
        System.out.println("============================");
        
        // Menampilkan isi Datum
        ContohMetodeGenerik.tampilkanIsiDatum(datumKucing);
        ContohMetodeGenerik.tampilkanIsiDatum(datumAnjing);
        ContohMetodeGenerik.tampilkanIsiDatum(datumBurung);
        
        System.out.println();
        
        // Mensimulasikan perilaku
        ContohMetodeGenerik.simulasiPerilaku(datumKucing);
        ContohMetodeGenerik.simulasiPerilaku(datumAnjing);
        ContohMetodeGenerik.simulasiPerilaku(datumBurung);
    }
}