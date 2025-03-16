/*
* Nama File : Pegawai.java
* Deskripsi : Kelas Pegawai sebagai kelas dasar untuk Dosen dan Tendik
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String tanggalLahir;
    protected String tmt;
    protected double gajiPokok;

    // Konstruktor
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menghitung masa kerja
    public int getMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tmtDate = LocalDate.parse(tmt, formatter);
        LocalDate sekarang = LocalDate.now();
        Period periode = Period.between(tmtDate, sekarang);
        return periode.getYears();
    }

    // Method untuk menghitung BUP (Batas Usia Pensiun)
    public String getBUP() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate lahir = LocalDate.parse(tanggalLahir, formatter);
        LocalDate bupDate = lahir.plusYears(65); // Default BUP untuk dosen tetap
        return bupDate.format(formatter);
    }

    // Method untuk mencetak informasi
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
    }
}