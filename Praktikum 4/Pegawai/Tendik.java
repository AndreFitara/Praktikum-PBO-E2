/*
* Nama File : Tendik.java
* Deskripsi : Kelas Tendik yang merupakan turunan dari kelas Pegawai
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public class Tendik extends Pegawai {
    private String bidang; // Akademik, Kemahasiswaan, Sumber Daya

    // Konstruktor
    public Tendik(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Method untuk menghitung tunjangan
    public double getTunjangan() {
        return 0.01 * getMasaKerja() * gajiPokok;
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("BUP: " + getBUP());
    }
}