/*
* Nama File : Lingkaran.java
* Deskripsi : Kelas turunan dari BangunDatar yang menambahkan atribut dan method khusus lingkaran
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public class Lingkaran extends BangunDatar {
    private double jari;

    // Konstruktor default
    public Lingkaran() {
        super(0, "Default", "Default");
    }

    // Konstruktor berparameter
    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    // Getter dan Setter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Method untuk menghitung keliling
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}