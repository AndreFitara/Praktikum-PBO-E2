/*
* Nama File : KontrolSenjata.java
* Deskripsi : Kelas kontrol yang mengatur aksi terhadap objek Senjata seperti menembak, isi peluru, dan menusuk
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}