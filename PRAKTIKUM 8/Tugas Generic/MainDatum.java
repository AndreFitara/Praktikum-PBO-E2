/*
* Nama File : MainDatum.java
* Deskripsi : Program untuk mendemonstrasikan penggunaan kelas generik dengan objek turunan dari kelas abstrak Anabul
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

// Kelas generik Datum
class Datum<T> {
    private T isi;

    // Getter
    public T getIsi() {
        return isi;
    }

    // Setter
    public void setIsi(T isi) {
        this.isi = isi;
    }
}

// Kelas Anabul dan turunannya
abstract class Anabul {
    public abstract void bersuara();
    public abstract void bergerak();
}

class Kucing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Meong");
    }

    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak dengan melata");
    }
}

class Anjing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }

    @Override
    public void bergerak() {
        System.out.println("Anjing bergerak dengan melata");
    }
}

class Burung extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }

    @Override
    public void bergerak() {
        System.out.println("Burung bergerak dengan terbang");
    }
}

// Program utama untuk menguji kelas Datum
public class MainDatum {
    public static void main(String[] args) {
        // Membuat objek hewan
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        Burung burung = new Burung();

        // Membuat objek Datum dengan tipe Anabul
        Datum<Anabul> datum1 = new Datum<>();
        datum1.setIsi(kucing);
        
        Datum<Anabul> datum2 = new Datum<>();
        datum2.setIsi(anjing);
        
        Datum<Anabul> datum3 = new Datum<>();
        datum3.setIsi(burung);

        // Menampilkan perilaku hewan dari Datum
        System.out.println("Simulasi perilaku hewan:");
        System.out.println("------------------------");
        
        Anabul hewan1 = datum1.getIsi();
        hewan1.bersuara();
        hewan1.bergerak();
        System.out.println();
        
        Anabul hewan2 = datum2.getIsi();
        hewan2.bersuara();
        hewan2.bergerak();
        System.out.println();
        
        Anabul hewan3 = datum3.getIsi();
        hewan3.bersuara();
        hewan3.bergerak();
    }
}
