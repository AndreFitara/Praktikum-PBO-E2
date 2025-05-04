/*
* Nama File : Senjata.java
* Deskripsi : Kelas Senjata dengan atribut bunyi, peluru, dan kemampuan menusuk (bayonet)
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

package latihanMedium;

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
