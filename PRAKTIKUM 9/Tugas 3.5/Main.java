/**
* Nama File : Main.java
* Deskripsi : Program utama untuk menguji kelas Koleksi dengan karakter
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 08/05/2025
*/

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);

        // Menambahkan 10 karakter acak
        koleksiChar.add('A');
        koleksiChar.add('B');
        koleksiChar.add('C');
        koleksiChar.add('D');
        koleksiChar.add('E');
        koleksiChar.add('F');
        koleksiChar.add('G');
        koleksiChar.add('H');
        koleksiChar.add('I');
        koleksiChar.add('J');

        // Menampilkan semua elemen koleksi
        System.out.println("Koleksi karakter awal:");
        showKoleksi(koleksiChar);

        // Melakukan setIsi pada indeks ke-3 (mengubah 'D' jadi 'Z')
        koleksiChar.setIsi(3, 'Z');
        System.out.println("\nKoleksi karakter setelah dilakukan setIsi (elemen ke-4 menjadi 'Z'):");
        showKoleksi(koleksiChar);

        // Menghapus elemen ke-6 (indeks 5)
        Character elemenDihapus = koleksiChar.getIsi(5);
        koleksiChar.delete(5);

        // Menampilkan koleksi setelah delete
        System.out.println("\nKoleksi karakter setelah dilakukan delete (elemen ke-6 dihapus):");
        showKoleksi(koleksiChar);

        // Menampilkan elemen yang dihapus
        System.out.println("\nElemen yang dihapus: " + elemenDihapus);

        // Menampilkan jumlah elemen saat ini
        System.out.println("Jumlah elemen koleksi saat ini: " + koleksiChar.getSize());
    }

    // Fungsi bantu untuk menampilkan koleksi dengan penomoran mulai dari 1
    public static void showKoleksi(Koleksi<?> koleksi) {
        for (int i = 0; i < koleksi.getSize(); i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + koleksi.getIsi(i));
        }
    }
}
