/*
* Nama File : Senjata.java
* Deskripsi : Kelas Senjata dengan atribut bunyi dan peluru serta fungsi menembak jika peluru tersedia
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Tidak ada peluru!");
        }
    }
}
