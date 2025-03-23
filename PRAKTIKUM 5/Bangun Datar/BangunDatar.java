/*
* Nama File : BangunDatar.java
* Deskripsi : Kelas dasar yang merepresentasikan bangun datar umum.
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

public abstract class BangunDatar {
    protected String warna;
    protected String border;

    public BangunDatar() {
        this.warna = "Hitam";
        this.border = "Solid";
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}