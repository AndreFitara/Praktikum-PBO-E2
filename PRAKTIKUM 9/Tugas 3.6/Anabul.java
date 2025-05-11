/**
* Nama File : Anabul.java
* Deskripsi : Kelas induk untuk hewan peliharaan
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}
