/**
* File      : BangunDatarGenericApp.java
* Deskripsi : main class untuk menguji kelas BangunDatarGeneric
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class BangunDatarGenericApp {
    public static void main(String[] args) {
        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
        bdgLingkaran.set(lingkaran);
        System.out.println("Lingkaran - Keliling: " + bdgLingkaran.hitungKeliling() +
                           ", Luas: " + bdgLingkaran.hitungLuas());

        // Persegi
        Persegi persegi = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(persegi);
        System.out.println("Persegi - Keliling: " + bdgPersegi.hitungKeliling() +
                           ", Luas: " + bdgPersegi.hitungLuas());

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<>();
        bdgPP.set(pp);
        System.out.println("Persegi Panjang - Keliling: " + bdgPP.hitungKeliling() +
                           ", Luas: " + bdgPP.hitungLuas());

        // Segitiga
        Segitiga segitiga = new Segitiga(6, 4, 5);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(segitiga);
        System.out.println("Segitiga - Keliling: " + bdgSegitiga.hitungKeliling() +
                           ", Luas: " + bdgSegitiga.hitungLuas());
    }
}
