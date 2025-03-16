/*
 * Nama File : Dosen.java
 * Deskripsi : Kelas Dosen yang merupakan turunan dari kelas Pegawai
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 13/03/2025
 */

public class Dosen extends Pegawai {
    private String nidn; // Untuk dosen tetap
    private String nidk; // Untuk dosen tamu
    private String jenis; // Tetap atau Tamu

    // Konstruktor untuk dosen tetap dan tamu
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String id, String jenis) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        if (jenis.equalsIgnoreCase("Tetap")) {
            this.nidn = id; // Jika jenis Tetap, gunakan nidn
        } else if (jenis.equalsIgnoreCase("Tamu")) {
            this.nidk = id; // Jika jenis Tamu, gunakan nidk
        }
        this.jenis = jenis;
    }

    // Method untuk menghitung tunjangan
    public double getTunjangan() {
        if (jenis.equalsIgnoreCase("Tetap")) {
            return 0.02 * getMasaKerja() * gajiPokok;
        } else if (jenis.equalsIgnoreCase("Tamu")) {
            return 0.025 * gajiPokok;
        }
        return 0;
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        if (jenis.equalsIgnoreCase("Tetap")) {
            System.out.println("NIDN: " + nidn);
        } else if (jenis.equalsIgnoreCase("Tamu")) {
            System.out.println("NIDK: " + nidk);
        }
        System.out.println("Jenis: " + jenis);
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("BUP: " + getBUP());
    }
}