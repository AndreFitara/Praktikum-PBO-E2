/**
* File      : BangunDatarGeneric.java
* Deskripsi : kelas konstruksi generic untuk BangunDatar
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}