/*
* Nama File : Persegi.java
* Deskripsi : Kelas turunan dari BangunDatar yang menambahkan atribut dan method khusus persegi
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public class Persegi extends BangunDatar {
    private double sisi;

    // Konstruktor default
    public Persegi() {
        super(4, "Default", "Default");
    }

    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}