/*
* Nama File : Garis.java
* Deskripsi : Kelas yang merepresentasikan garis dengan dua titik sebagai ujungnya
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 21/02/2025
*/

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter untuk counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        double deltaX = titikAkhir.getAbis() - titikAwal.getAbis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis garisLain) {
        double m1 = (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
                    (titikAkhir.getAbis() - titikAwal.getAbis());
        double m2 = (garisLain.titikAkhir.getOrdinat() - garisLain.titikAwal.getOrdinat()) /
                    (garisLain.titikAkhir.getAbis() - garisLain.titikAwal.getAbis());
        return m1 == m2;
    }

    // Method untuk menampilkan titik awal dan akhir
    public void display() {
        System.out.print("Titik Awal: ");
        titikAwal.display();
        System.out.print("Titik Akhir: ");
        titikAkhir.display();
    }
}