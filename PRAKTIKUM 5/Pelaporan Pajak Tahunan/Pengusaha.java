/*
* Nama File : Pengusaha.java
* Deskripsi : Kelas yang merepresentasikan pengusaha dengan atribut tambahan NPWP dan perhitungan pajak
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Implementasi metode hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return tahun + Integer.parseInt(npwp.substring(12, 13)); // B = digit ke-13 NPWP
    }

    // Implementasi metode hitungPajak
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Override metode cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}