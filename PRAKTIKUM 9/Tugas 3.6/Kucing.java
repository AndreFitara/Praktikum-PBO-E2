/**
* Nama File : Kucing.java
* Deskripsi : Kelas turunan dari Anabul, merepresentasikan Kucing
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}
