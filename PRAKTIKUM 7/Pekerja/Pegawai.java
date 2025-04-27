/*
* Nama File : Pegawai.java
* Deskripsi : Superclass pegawai
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}