/*
* Nama File : MTitik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/02/2025
*/

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik();

        // Menampilkan koordinat T1 dan T2
        System.out.println("Koordinat T1: (" + T1.getAbsis() + ", " + T1.getOrdinate() + ")");
        System.out.println("Koordinat T2: (" + T2.getAbsis() + ", " + T2.getOrdinate() + ")");

        // Mengubah koordinat T1
        T1.setAbsis(5);
        T1.setOrdinate(6);
        System.out.println("Koordinat T1 setelah diubah: (" + T1.getAbsis() + ", " + T1.getOrdinate() + ")");

        // Menggunakan method geser
        T1.geser(2, 3);
        System.out.println("Koordinat T1 setelah digeser: (" + T1.getAbsis() + ", " + T1.getOrdinate() + ")");

        // Menampilkan kuadran T1
        System.out.println("Kuadran T1: " + T1.getKuadran());

        // Menampilkan jarak T1 dari pusat
        System.out.println("Jarak T1 dari pusat: " + T1.getJarakPusat());

        // Menampilkan jarak antara T1 dan T2
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        // Merefleksikan T1 terhadap sumbu X dan Y
        T1.refleksiX();
        System.out.println("Koordinat T1 setelah refleksi X: (" + T1.getAbsis() + ", " + T1.getOrdinate() + ")");
        T1.refleksiY();
        System.out.println("Koordinat T1 setelah refleksi Y: (" + T1.getAbsis() + ", " + T1.getOrdinate() + ")");

        // Mendapatkan refleksi T1 terhadap sumbu X dan Y
        Titik T3 = T1.getRefleksiX();
        Titik T4 = T1.getRefleksiY();
        System.out.println("Refleksi T1 terhadap sumbu X: (" + T3.getAbsis() + ", " + T3.getOrdinate() + ")");
        System.out.println("Refleksi T1 terhadap sumbu Y: (" + T4.getAbsis() + ", " + T4.getOrdinate() + ")");

        // Menampilkan jumlah titik yang telah dibuat
        System.out.println("Jumlah titik yang telah dibuat: " + Titik.getCounterTitik());
    }
}