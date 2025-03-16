/*
* Nama File : BangunDatarFinal.java
* Deskripsi : Eksperimen penggunaan keyword final pada kelas dan method
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 13/03/2025
*/

public final class BangunDatarFinal {
    protected int jmlSisi;
    protected String warna;
    protected String border;

    // Konstruktor default
    public BangunDatarFinal() {
    }

    // Konstruktor berparameter
    public BangunDatarFinal(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // Method final (tidak bisa di-override)
    public final void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}