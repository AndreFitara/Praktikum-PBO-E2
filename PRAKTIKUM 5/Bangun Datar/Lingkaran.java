/*
* Nama File : Lingkaran.java
* Deskripsi : Kelas yang merepresentasikan bangun datar lingkaran, turunan dari BangunDatar.
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/03/2025
*/

public class Lingkaran extends BangunDatar implements IResize {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void zoomIn() {
        radius = radius * 1.1;
    }

    @Override
    public void zoomOut() {
        radius = radius * 0.9;
    }

    @Override
    public void zoom(int percent) {
        radius = radius * percent / 100;
    }
}