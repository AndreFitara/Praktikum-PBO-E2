/*
* Nama File : Sewa.java
* Deskripsi : Class main sewa
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}