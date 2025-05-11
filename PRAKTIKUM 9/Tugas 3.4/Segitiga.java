/**
* File      : Segitiga.java
* Deskripsi : implementasi Segitiga sebagai BangunDatar
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
