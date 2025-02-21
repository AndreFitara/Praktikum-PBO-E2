/*
* Nama File : Titik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 20/02/2025
*/

public class Titik {
    //**********ATRIBUT**********/
    private double absis;
    private double ordinate;
    private static int counterTitik = 0;

    //**********METHOD**********/
    // Konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinate) {
        this.absis = absis;
        this.ordinate = ordinate;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0, 0);
    }

    // Getter untuk absis
    public double getAbsis() {
        return absis;
    }

    // Setter untuk absis
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    // Getter untuk ordinat
    public double getOrdinate() {
        return ordinate;
    }

    // Setter untuk ordinat
    public void setOrdinate(double ordinate) {
        this.ordinate = ordinate;
    }

    // Method untuk menggeser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinate += y;
    }

    // Method untuk mendapatkan kuadran
    public int getKuadran() {
        if (absis > 0 && ordinate > 0) return 1;
        else if (absis < 0 && ordinate > 0) return 2;
        else if (absis < 0 && ordinate < 0) return 3;
        else if (absis > 0 && ordinate < 0) return 4;
        else return 0; // Jika titik berada pada sumbu
    }

    // Method untuk mendapatkan jarak dari pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinate * ordinate);
    }

    // Method untuk mendapatkan jarak dari titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinate - T.getOrdinate();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method untuk merefleksikan titik terhadap sumbu X
    public void refleksiX() {
        this.ordinate = -this.ordinate;
    }

    // Method untuk merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Method untuk mendapatkan refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinate);
    }

    // Method untuk mendapatkan refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinate);
    }

    // Method untuk mendapatkan counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
}