/*
* Nama File : Vehicle.java
* Deskripsi : Superclass vehicle
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}