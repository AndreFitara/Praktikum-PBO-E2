/**  
* File      : Lingkaran.java  
* Deskripsi : implementasi Lingkaran sebagai BangunDatar  
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/  

public class Lingkaran extends BangunDatar {  
    private double jejari;  

    public Lingkaran(double jejari) {  
        this.jejari = jejari;  
    }  

    public double hitungKeliling() {  
        return 2 * jejari * 3.14;  
    }  
}