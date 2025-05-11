/**
* Nama File : Burung.java
* Deskripsi : Kelas turunan dari Anabul, merepresentasikan Burung
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak: Terbang");
    }
}
