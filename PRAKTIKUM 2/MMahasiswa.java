/*
* Nama File : MMahasiswa.java
* Deskripsi : Program ini berfungsi untuk mengelola data mahasiswa, termasuk informasi mata kuliah yang diambil, dosen, dan kendaraan yang dimiliki
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 27/02/2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek mahasiswa
        Mahasiswa M1 = new Mahasiswa("24060121140127", "Citra", "Informatika");

        // Membuat objek dosen
        Dosen D1 = new Dosen("24060121140129", "Andre", "Informatika");

        // Membuat objek kendaraan
        Kendaraan K1 = new Kendaraan("K1234BK", "Motor");

        // Menghubungkan objek dengan mahasiswa
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan jumlah SKS yang diambil mahasiswa
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());
    }
}
