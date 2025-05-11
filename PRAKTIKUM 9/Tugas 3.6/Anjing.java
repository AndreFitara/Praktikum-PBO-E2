/**
* Nama File : Anjing.java
* Deskripsi : Kelas turunan dari Anabul, merepresentasikan Anjing
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}
