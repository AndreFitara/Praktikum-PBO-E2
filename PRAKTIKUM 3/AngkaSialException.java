/*
* Nama File : AngkaSialException.java
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 7/03/2025
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}