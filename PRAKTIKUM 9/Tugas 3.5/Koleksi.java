/**
* Nama File : Koleksi.java
* Deskripsi : Kelas generik Koleksi dengan operasi dasar manipulasi data
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        }
        return null;
    }

    public void setIsi(int index, T elemen) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = elemen;
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int ukuran) {
        if (ukuran >= 0 && ukuran <= wadah.length) {
            nbelm = ukuran;
        }
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = elemen;
        } else {
            System.out.println("Koleksi penuh.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[--nbelm] = null;
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + i + ": " + wadah[i]);
        }
    }
}
