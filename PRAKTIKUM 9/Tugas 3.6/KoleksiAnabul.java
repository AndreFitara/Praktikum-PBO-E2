/**
* Nama File : KoleksiAnabul.java
* Deskripsi : Kelas generik untuk menyimpan koleksi objek Anabul
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> listAnabul = new ArrayList<>();

    public void tambah(T hewan) {
        listAnabul.add(hewan);
    }

    public void showAll() {
        for (T hewan : listAnabul) {
            System.out.println("=== " + hewan.getClass().getSimpleName() + " ===");
            hewan.bersuara();
            hewan.bergerak();
            System.out.println();
        }
    }
}
