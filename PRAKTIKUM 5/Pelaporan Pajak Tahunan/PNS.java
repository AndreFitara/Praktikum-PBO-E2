/*
* Nama File : PNS.java
* Deskripsi : Kelas yang merepresentasikan PNS dengan atribut tambahan NIP dan perhitungan pajak khusus
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

import java.util.Date;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Implementasi metode hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return tahun + Integer.parseInt(nip.substring(13, 14)); // A = digit ke-14 NIM
    }

    // Implementasi metode hitungPajak
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Override metode cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}