/*
* Nama File : Car.java
* Deskripsi : Class car
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}