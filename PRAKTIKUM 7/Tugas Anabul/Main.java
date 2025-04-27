/*
* Nama File : Main.java
* Deskripsi : berisi class hewan dan main
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

// Kelas induk Anabul
class Anabul {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void bergerak() {
        System.out.println("Hewan bergerak");
    }
}

// Kelas turunan Kucing
class Kucing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak: Melata");
    }
}

// Kelas turunan Anjing
class Anjing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara: Guk guk!");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Anjing bergerak: Melata");
    }
}

// Kelas turunan Burung
class Burung extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Burung bersuara: Cuit cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Burung bergerak: Terbang");
    }
}

// Program utama untuk menguji
public class Main {
    public static void main(String[] args) {
        // Membuat array dari Anabul
        Anabul[] hewanPeliharaan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };
        
        // Mensimulasikan semua bunyi dan gerakan
        for (Anabul hewan : hewanPeliharaan) {
            System.out.println("=== " + hewan.getClass().getSimpleName() + " ===");
            hewan.bersuara();
            hewan.bergerak();
            System.out.println();
        }
    }
}
