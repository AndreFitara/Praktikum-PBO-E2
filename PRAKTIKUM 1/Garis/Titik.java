/*
* Nama File : Titik.java
* Deskripsi : Kelas yang merepresentasikan garis dengan dua titik sebagai ujungnya
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 21/02/2025
*/

public class Titik {
    private double absis;
    private double ordinat;

    // Konstruktor tanpa parameter
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    // Konstruktor dengan parameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter untuk absis
    public double getAbis() {
        return absis;
    }

    // Getter untuk ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Setter untuk absis
    public void setAbis(double absis) {
        this.absis = absis;
    }

    // Setter untuk ordinat
    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Method untuk menampilkan koordinat
    public void display() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }
}