/*
* Nama File : Petani.java
* Deskripsi : Kelas yang merepresentasikan petani dengan atribut tambahan asal kota dan aturan pajak khusus
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

import java.util.Date;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan Setter
    public String getAsal_kota() {
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Implementasi metode hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));

        // Coba ambil digit pertama dari asal_kota, jika tidak ada, gunakan 0
        try {
            return tahun + Integer.parseInt(asal_kota.substring(0, 1));
        } catch (NumberFormatException e) {
            return tahun + 0; // Jika gagal, tambahkan 0
        }
    }

    // Implementasi metode hitungPajak
    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    // Override metode cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}