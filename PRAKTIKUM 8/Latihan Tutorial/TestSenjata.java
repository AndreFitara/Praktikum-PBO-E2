/*
* Nama File : TestSenjata.java
* Deskripsi : Program utama untuk menguji fungsionalitas kelas Senjata (menembak dan menusuk)
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

// Main Program
package latihanTutorial;

public class TestSenjata{

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("TOOP");

        System.out.print("AK47: Menembak 3x: "); 
        ak47.menembak(3);
        System.out.print("M16: Menembak 1x: "); 
        m16.menembak(1);

        System.out.println("AK47: Menusuk: " + ak47.menusuk());
        ak47.pasangBeyonet();
        System.out.println("AK47: Menusuk: " + ak47.menusuk());
    }
}