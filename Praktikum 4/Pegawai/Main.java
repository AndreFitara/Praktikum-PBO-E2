/*
* Nama File : Main.java
* Deskripsi : Kelas utama
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public class Main {
    public static void main(String[] args) {
        // Data Dosen Tetap
        Dosen dosenTetap = new Dosen(
            "9545647548", // NIP
            "Andi", // Nama
            "05 05 1990", // Tanggal Lahir
            "01 01 2015", // TMT
            5000000, // Gaji Pokok
            "78647324", // NIDN
            "Tetap" // Jenis
        );
        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();

        // Data Dosen Tamu
        Dosen dosenTamu = new Dosen(
            "9876543210", // NIP
            "Budi", // Nama
            "15 03 1990", // Tanggal Lahir
            "01 07 2020", // TMT
            4500000, // Gaji Pokok
            "12345678", // NIDK
            "Tamu" // Jenis
        );
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu.printInfo();

        // Data Tendik
        Tendik tendik = new Tendik(
            "1023456789", // NIP
            "Dewi", // Nama
            "05 05 2000", // Tanggal Lahir
            "01 07 2015", // TMT
            5000000, // Gaji Pokok
            "Akademik" // Bidang
        );
        System.out.println("\nInformasi Tendik:");
        tendik.printInfo();
    }
}